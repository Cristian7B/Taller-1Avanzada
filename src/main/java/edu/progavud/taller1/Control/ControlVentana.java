/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.View.VistaMantenimiento;
import edu.progavud.taller1.View.VistaProducto;
import edu.progavud.taller1.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author crisc
 */
public class ControlVentana implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VistaMantenimiento vistaMantenimiento;
    private VentanaPrincipal vistaPrincipal;
    private VistaProducto vistaProducto;
    public ControlVentana(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        vistaPrincipal = new VentanaPrincipal(this);
        vistaMantenimiento = new VistaMantenimiento(this);
        vistaProducto = new VistaProducto(this);
        asignarOyentes();
    }
    
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando == "LLEVAR"){
            vistaPrincipal.setVisible(false);
            vistaMantenimiento.setVisible(true);  
        }else if (comando == "MESA"){
            vistaProducto.setVisible(true);
            vistaProducto.getPanelOpciones().setVisible(true);
            vistaPrincipal.setVisible(false);
        }else if (comando == "MENU1"){
            vistaMantenimiento.setVisible(false);
            vistaPrincipal.setVisible(true);
        }else if (comando == "SALIR"){
            JOptionPane.showMessageDialog(null, "Hasta pronto",	"Salir", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }else if (comando == "COMBO"){
            vistaProducto.getPanelOpciones().setVisible(false);
            vistaProducto.getPanelProducto().setVisible(true);
        }
    }
    
    public void asignarOyentes() {
        
        vistaPrincipal.jButton1.setActionCommand("LLEVAR");//llevar en mantenimiento
        vistaPrincipal.jButton1.addActionListener(this); 
        vistaPrincipal.jButton2.setActionCommand("MESA"); //solo sirve mesa
        vistaPrincipal.jButton2.addActionListener(this); 
        vistaPrincipal.jMenuItem2.setActionCommand("SALIR");
        vistaPrincipal.jMenuItem2.addActionListener(this);
        
        vistaMantenimiento.jButton1.setActionCommand("MENU1");
        vistaMantenimiento.jButton1.addActionListener(this);
        vistaMantenimiento.jButton2.setActionCommand("SALIR");
        vistaMantenimiento.jButton2.addActionListener(this);
        
        vistaProducto.getPanelOpciones().botonBucket.setActionCommand("BUCKET");
        vistaProducto.getPanelOpciones().botonBucket.addActionListener(this);
        vistaProducto.getPanelOpciones().botonCombo.setActionCommand("COMBO");
        vistaProducto.getPanelOpciones().botonCombo.addActionListener(this);
        vistaProducto.getPanelOpciones().botonHamburguesa.setActionCommand("HAMBURGUESA");
        vistaProducto.getPanelOpciones().botonHamburguesa.addActionListener(this);
        vistaProducto.getPanelOpciones().botonPollo.setActionCommand("POLLO");
        vistaProducto.getPanelOpciones().botonPollo.addActionListener(this);
        vistaProducto.getPanelOpciones().botonHelado.setActionCommand("HELADO");
        vistaProducto.getPanelOpciones().botonHelado.addActionListener(this);
        vistaProducto.getPanelOpciones().botonPicar.setActionCommand("PICAR");
        vistaProducto.getPanelOpciones().botonPicar.addActionListener(this);
        
    }
}
