/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.View.VistaMantenimiento;
import edu.progavud.taller1.View.VistaProducto;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


import edu.progavud.taller1.View.VistaProducto;
import edu.progavud.taller1.view.VentanaPrincipal;
import javax.swing.Timer;


/**
 *
 * @author crisc
 */
public class ControlVentana implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private VentanaPrincipal vistaPrincipal;




    public ControlVentana(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        vistaPrincipal = new VentanaPrincipal(this);
        asignarOyentes();
    }
    
    /* Snippet of the actionPerformed method in ControlVentana */

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        vistaPrincipal.getPanelPrincipal().setVisible(true);
        vistaPrincipal.getPanelMantenimiento().setVisible(false);
        switch (comando){
            case "LLEVAR":
                vistaPrincipal.getPanelPrincipal().setVisible(false);
                vistaPrincipal.getPanelMantenimiento().setVisible(true);
                timer();
                break;
            case "MESA":
                vistaPrincipal.setVisible(true);
                //vistaProducto.mostrarCategorias();
                vistaPrincipal.setVisible(false);
                timer();
                break;
            case "MENU1":
                vistaPrincipal.getPanelMantenimiento().setVisible(false);
                vistaPrincipal.getPanelPrincipal().setVisible(true);
                timer();
                break;
            case "SALIR":
                vistaPrincipal.anuncio("Hasta pronto", "Salir");
                System.exit(0);
                break;
            case "COMBO":
                //vistaProducto.getPanelProducto().resetear();
                Categoria categoriaIterar = controlPrincipal.obtenerCategoria("Combos");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                //vistaProducto.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    //vistaProducto.getPanelProducto().cargarProductosCombo((Combo) categoriaIterar.getCategoria()[i]);
                }
                timer();
                break;
            case "BUCKET":
                timer();
                break;
            case "HAMBURGUESA":
                //vistaProducto.getPanelProducto().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Hamburguesa");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                //vistaProducto.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    //vistaProducto.getPanelProducto().cargarProductosNormales(categoriaIterar.getCategoria()[i]);
                }
                timer();
                break;
            case "POLLO":
                timer();
                break;
            case "HELADO":
                timer();
                break;
            case "PICAR":
                //vistaProducto.getPanelProducto().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Para Picar");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                //vistaProducto.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    //vistaProducto.getPanelProducto().cargarProductosNormales(categoriaIterar.getCategoria()[i]);
                }
                timer();
                break;
                
            case "ATRAS":
                break;
            
        } 
    }
    
    public void asignarOyentes() {
        
        vistaPrincipal.getPanelPrincipal().jButton1.setActionCommand("LLEVAR");//llevar en mantenimiento
        vistaPrincipal.getPanelPrincipal().jButton1.addActionListener(this); 
        vistaPrincipal.getPanelPrincipal().jButton2.setActionCommand("MESA"); //solo sirve mesa
        vistaPrincipal.getPanelPrincipal().jButton2.addActionListener(this); 
        vistaPrincipal.jMenuItem1.setActionCommand("SALIR");
        vistaPrincipal.jMenuItem1.addActionListener(this);
        
        vistaPrincipal.getPanelMantenimiento().jButton1.setActionCommand("MENU1");
        vistaPrincipal.getPanelMantenimiento().jButton1.addActionListener(this);
        vistaPrincipal.getPanelMantenimiento().jButton2.setActionCommand("SALIR");
        vistaPrincipal.getPanelMantenimiento().jButton2.addActionListener(this);
        
//        vistaProducto.getPanelOpciones().botonBucket.setActionCommand("BUCKET");
//        vistaProducto.getPanelOpciones().botonBucket.addActionListener(this);
//        vistaProducto.getPanelOpciones().botonCombo.setActionCommand("COMBO");
//        vistaProducto.getPanelOpciones().botonCombo.addActionListener(this);
//        vistaProducto.getPanelOpciones().botonHamburguesa.setActionCommand("HAMBURGUESA");
//        vistaProducto.getPanelOpciones().botonHamburguesa.addActionListener(this);
//        vistaProducto.getPanelOpciones().botonPollo.setActionCommand("POLLO");
//        vistaProducto.getPanelOpciones().botonPollo.addActionListener(this);
//        vistaProducto.getPanelOpciones().botonHelado.setActionCommand("HELADO");
//        vistaProducto.getPanelOpciones().botonHelado.addActionListener(this);
//        vistaProducto.getPanelOpciones().botonPicar.setActionCommand("PICAR");
//        vistaProducto.getPanelOpciones().botonPicar.addActionListener(this);
//        vistaProducto.atras.addActionListener(this);
//        vistaProducto.atras.setActionCommand("ATRAS");
    }
    
    public void timer(){
        Timer timer = new Timer(60000, e -> {
            vistaPrincipal.anuncio("No se usó durante el tiempo establecido", "INICIO");
            vistaPrincipal.setVisible(true);
        });
        timer.setRepeats(false);
        timer.start();
    }
         
}
