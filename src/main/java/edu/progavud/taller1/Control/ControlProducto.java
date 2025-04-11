/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Producto;
import edu.progavud.taller1.view.VentanaPrincipal;
import java.util.ArrayList;

/**
 *
 * @author ACER NITRO
 */
public class ControlProducto {
    private VentanaPrincipal vistaPrincipal;
    private ControlPrincipal controlPrincipal;

    public ControlProducto(ControlPrincipal controlPrincipal, VentanaPrincipal vistPrincipal) {
        this.vistaPrincipal = vistPrincipal;
        this.controlPrincipal = controlPrincipal;
    }

    public VentanaPrincipal getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(VentanaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }
    
    
}
