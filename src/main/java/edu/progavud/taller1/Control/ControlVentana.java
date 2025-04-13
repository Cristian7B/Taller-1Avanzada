/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.View.Ventana;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Combo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


/**
 *
 * @author crisc
 */
public class ControlVentana implements ActionListener{
    private ControlPrincipal controlPrincipal;
    private Ventana vistaPrincipal;
    Timer timer;

    public ControlVentana(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        vistaPrincipal = new Ventana(this);
        asignarOyentes();
        timer = new javax.swing.Timer(0, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        switch (comando) {
            case "LLEVAR":
                timer.stop();
                vistaPrincipal.mostrarMantenimiento();
                timer = usarTimer();
                break;

            case "MESA":
                timer.stop();
                vistaPrincipal.mostrarCategorias();
                vistaPrincipal.getPanelBoton().setVisible(true);
                timer = usarTimer();
                break;

            case "MENU1":
                timer.stop();
                vistaPrincipal.mostrarInicio();
                timer = usarTimer();
                break;

            case "SALIR":
                vistaPrincipal.anuncio("Hasta pronto", "Salir");
                System.exit(0);
                break;

            case "COMBO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                Categoria categoriaIterar = controlPrincipal.obtenerCategoria("Combos");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarProductosCombo((Combo) categoriaIterar.getCategoria()[i], i);
                }
                break;

            case "BUCKET":
                // Aquí deberías implementar la carga de productos tipo BUCKET
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.mostrarProductos();
                break;

            case "HAMBURGUESA":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Hamburguesa");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarHamburguesas(categoriaIterar.getCategoria()[i], i);
                }
                break;

            case "POLLO":
                // Aquí deberías implementar la carga de productos tipo POLLO
                timer.stop();
                vistaPrincipal.mostrarProductos();
                timer = usarTimer();
                break;

            case "HELADO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Helados");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarHelados(categoriaIterar.getCategoria()[i], i);
                }
                
                break;

            case "PICAR":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Para Picar");
                System.out.println("Entro" + categoriaIterar.getCategoria());
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarPicar(categoriaIterar.getCategoria()[i], i);
                }
                
                break;

            case "ATRAS":
                timer.stop();
                timer = usarTimer();
                if (vistaPrincipal.getPanelProductos().isVisible()) {
                    vistaPrincipal.mostrarCategorias();
                } else if (vistaPrincipal.getPanelOpciones().isVisible() || 
                          vistaPrincipal.getPanelMantenimiento().isVisible()) {
                    vistaPrincipal.mostrarInicio();
                    vistaPrincipal.getPanelBoton().setVisible(false);
                }
                
                break;
        }
    }
    
    public void asignarOyentes() {
        
        vistaPrincipal.botonParaLlevar.setActionCommand("LLEVAR");//llevar en mantenimiento
        vistaPrincipal.botonParaLlevar.addActionListener(this); 
        vistaPrincipal.botonParaLaMesa.setActionCommand("MESA"); //solo sirve mesa
        vistaPrincipal.botonParaLaMesa.addActionListener(this); 
        
        vistaPrincipal.getPanelMantenimiento().jButton1.setActionCommand("MENU1");
        vistaPrincipal.getPanelMantenimiento().jButton1.addActionListener(this);
        vistaPrincipal.getPanelMantenimiento().jButton2.setActionCommand("SALIR");
        vistaPrincipal.getPanelMantenimiento().jButton2.addActionListener(this);
        
        vistaPrincipal.getPanelOpciones().botonBucket.setActionCommand("BUCKET");
        vistaPrincipal.getPanelOpciones().botonBucket.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonCombo.setActionCommand("COMBO");
        vistaPrincipal.getPanelOpciones().botonCombo.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonHamburguesa.setActionCommand("HAMBURGUESA");
        vistaPrincipal.getPanelOpciones().botonHamburguesa.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonPollo.setActionCommand("POLLO");
        vistaPrincipal.getPanelOpciones().botonPollo.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonHelado.setActionCommand("HELADO");
        vistaPrincipal.getPanelOpciones().botonHelado.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonPicar.setActionCommand("PICAR");
        vistaPrincipal.getPanelOpciones().botonPicar.addActionListener(this);
        vistaPrincipal.atras.addActionListener(this);
        vistaPrincipal.atras.setActionCommand("ATRAS");
    }
    
    public Timer usarTimer(){
        Timer timer = new Timer(6000, e -> {
            vistaPrincipal.anuncio("No se usó durante el tiempo establecido", "INICIO");
            vistaPrincipal.getPanelBoton().setVisible(false);
            vistaPrincipal.getPanelMantenimiento().setVisible(false);
            vistaPrincipal.getPanelOpciones().setVisible(false);
            vistaPrincipal.getPanelProductos().setVisible(false);
            vistaPrincipal.getPanelPrincipal().setVisible(true);
        });
        timer.setRepeats(false);
        timer.start();
        return timer;
    }
         
}