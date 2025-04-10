/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author crisc
 */
public class ControlVentana implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VentanaPrincipal vistaPrincipal;
    
    public ControlVentana(ControlPrincipal controlPrincipal, VentanaPrincipal vistaPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.vistaPrincipal = vistaPrincipal;
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
    }
    
    public void asignarOyentes() {
        
    }
    
}
