/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Gaseosa;
import edu.progavud.taller1.model.Producto;


/**
 *
 * @author crisc
 */
public class ControlCombo {
    private ControlPrincipal controlPrincipal;
    private Combo comboActual;
    
    public ControlCombo(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public void anadirReferenciaCombo(Combo combo) {
        comboActual = combo;
    }
    
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
    
    public void cambiarTamanoGaseosa(String nuevoTamano) {
        Producto[] productos = comboActual.getProductosIncluidos();
        Gaseosa gaseosa = (Gaseosa) productos[1];
        gaseosa.setTamano(nuevoTamano);
        gaseosa.cambiarPrecio();
        comboActual.cambiarPrecio();
    }

    
    public void anadirAdiciones(String adicion) {
        comboActual.setAdiciones(comboActual.getAdiciones() + " " + adicion);
        comboActual.cambiarPrecio();
    }
    
    public void removerReferenciaCombo() {
        comboActual = null;
    }
    
}
