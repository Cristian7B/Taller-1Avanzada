/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Gaseosa;
import edu.progavud.taller1.model.Producto;

/**
 * Clase encargada de manejar la lógica relacionada con la creación,
 * modificación y referencia de combos en la aplicación.
 * 
 * Permite crear combos predefinidos, modificar sus componentes como el tamaño
 * de la bebida, añadir adiciones y gestionar la referencia al combo actual.
 * 
 * @author  Nicolas Velasco
 */
public class ControlCombo {

    /** 
     * Referencia al controlador principal de la aplicación. 
     */
    private ControlPrincipal controlPrincipal;

    /** 
     * Combo actualmente en uso o seleccionado. 
     */
    private Combo comboActual;

    /**
     * Construye un controlador de combos enlazado al controlador principal.
     * 
     * @param controlPrincipal instancia principal del controlador
     */
    public ControlCombo(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }

    /**
     * Establece una referencia al combo actual sobre el cual se harán modificaciones.
     * 
     * @param combo combo al que se desea referenciar
     */
    public void anadirReferenciaCombo(Combo combo) {
        comboActual = combo;
    }

    /**
     * Crea y devuelve un conjunto de combos predefinidos del restaurante.
     * Cada combo incluye una proteína, una bebida y una porción de papas.
     * 
     * @return un arreglo con los combos iniciales disponibles
     */
    public Combo[] crearCombos() {
        Producto[] productosCombo1 = controlPrincipal.crearContenidoComboRedirect(
            "Nuggets de Pollo", "Deliciosos nuggets de pollo crujientes", "/assets/combo/Combo#1.png",
            "Pepsi", "Refresco refrescante", "Pequeño",
            "Papas Fritas", "Crujientes papas a la francesa"
        );
        Combo combo1 = new Combo("Combo Nuggets", "Nuggets de pollo con papas y pepsi pequeña", 
                               "/assets/combo/Combo#1.png", 12000, 450, 0, productosCombo1, "Salsa BBQ");

        Producto[] productosCombo2 = controlPrincipal.crearContenidoComboRedirect(
            "Alitas BBQ", "Deliciosas alitas de pollo en salsa BBQ", "/assets/combo/Combo#2.png",
            "Pepsi", "Refresco refrescante", "Pequeño",
            "Papas Fritas", "Crujientes papas a la francesa"
        );
        Combo combo2 = new Combo("Combo Alitas", "Alitas BBQ con papas y pepsi pequeña", 
                               "/assets/combo/Combo#2.png", 16000, 550, 0, productosCombo2, "Salsa Ranch");

        Producto[] productosCombo3 = controlPrincipal.crearContenidoComboRedirect(
            "Pechugas de Pollo", "Jugosas pechugas de pollo apanadas", "/assets/combo/Combo#3.png",
            "Pepsi", "Refresco refrescante", "Pequeño",
            "Papas Fritas", "Crujientes papas a la francesa"
        );
        Combo combo3 = new Combo("Combo Pechugas", "Pechugas de pollo con papas y pepsi pequeña", 
                               "/assets/combo/Combo#3.png", 15000, 500, 0, productosCombo3, "Salsa de la casa");

        Producto[] productosCombo4 = controlPrincipal.crearContenidoComboRedirect(
            "8 Presas de Pollo", "Caja con 8 presas variadas de pollo frito", "/assets/combo/Combo#4.png",
            "Pepsi", "Refresco refrescante", "Grande",
            "Papas Fritas", "Crujientes papas a la francesa"
        );
        Combo combo4 = new Combo("Combo Familiar", "8 presas de pollo con papas y pepsi grande", 
                               "/assets/combo/Combo#4.png", 28000, 1200, 0, productosCombo4, "2 Salsas a elección");

        Combo[] combosIniciales = {combo1, combo2, combo3, combo4};

        return combosIniciales;
    }

    /**
     * Cambia el tamaño de la gaseosa del combo actual y ajusta su precio en consecuencia.
     * 
     * @param nuevoTamano nuevo tamaño de la gaseosa (por ejemplo, "Grande")
     */
    public void cambiarTamanoGaseosa(String nuevoTamano) {
        Producto[] productos = comboActual.getProductosIncluidos();
        Gaseosa gaseosa = (Gaseosa) productos[1];
        gaseosa.setTamano(nuevoTamano);
        gaseosa.cambiarPrecio();
        comboActual.cambiarPrecio();
    }

    /**
     * Añade una nueva adición al combo actual y actualiza su precio.
     * 
     * @param adicion descripción de la adición a incluir
     */
    public void anadirAdiciones(String adicion) {
        comboActual.setAdiciones(comboActual.getAdiciones() + " " + adicion);
        comboActual.cambiarPrecio();
    }

    /**
     * Elimina la referencia actual al combo, dejando de trabajar sobre él.
     */
    public void removerReferenciaCombo() {
        comboActual = null;
    }

}

