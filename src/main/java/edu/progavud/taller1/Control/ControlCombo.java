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
