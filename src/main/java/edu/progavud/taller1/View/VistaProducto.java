/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import edu.progavud.taller1.control.ControlVentana;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 * Esta clase de tipo GUI contiene todos los productos
 * @author Nicolas Velasco
 */
public class VistaProducto extends JFrame{
    private PanelOpciones panelOpciones;
    private PanelProductos panelProducto;
    private JLayeredPane layerPane;
    private ControlVentana controlVentana;
    private JLabel lblOpciones;
    
    public VistaProducto(ControlVentana controlVentana){
        setTitle("PRODUCTOS");
        
        setPreferredSize(new Dimension(1200, 850));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.gray);
        getContentPane().setLayout(new BorderLayout());
        
        this.controlVentana = controlVentana;
        inicializarComponentes();
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
	
    }
    
    public void inicializarComponentes(){
        
        lblOpciones = new JLabel("CATEGORÍAS", JLabel.CENTER); // Texto centrado
        lblOpciones.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 36));
        lblOpciones.setForeground(Color.WHITE);
        lblOpciones.setBackground(Color.DARK_GRAY);
        lblOpciones.setOpaque(true);
        getContentPane().add(lblOpciones, BorderLayout.NORTH);
        
        layerPane = new JLayeredPane();
        getContentPane().add(layerPane, BorderLayout.CENTER);
        
        panelOpciones = new PanelOpciones();
        panelOpciones.setBounds(250, 200, 700, 500);
        
        layerPane.add(panelOpciones, 2,0);
        
        panelProducto = new PanelProductos();
        layerPane.add(panelProducto, 1,0);
        
    }

    public PanelOpciones getPanelOpciones() {
        return panelOpciones;
    }

    public void setPanelOpciones(PanelOpciones panelOpciones) {
        this.panelOpciones = panelOpciones;
    }

    public PanelProductos getPanelProducto() {
        return panelProducto;
    }

    public void setPanelProducto(PanelProductos panelProducto) {
        this.panelProducto = panelProducto;
    }

    public JLayeredPane getLayerPane() {
        return layerPane;
    }

    public void setLayerPane(JLayeredPane layerPane) {
        this.layerPane = layerPane;
    }

    public ControlVentana getControlVentana() {
        return controlVentana;
    }

    public void setControlVentana(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
    }

    public JLabel getLblOpciones() {
        return lblOpciones;
    }

    public void setLblOpciones(JLabel lblOpciones) {
        this.lblOpciones = lblOpciones;
    }
    
}
