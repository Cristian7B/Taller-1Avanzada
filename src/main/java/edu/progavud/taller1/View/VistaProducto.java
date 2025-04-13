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
    public JButton atras;
    
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
        
        lblOpciones = new JLabel("CATEGORÍAS", JLabel.CENTER); 
        lblOpciones.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 36));
        lblOpciones.setForeground(Color.WHITE);
        lblOpciones.setBackground(Color.DARK_GRAY);
        lblOpciones.setOpaque(true);
        getContentPane().add(lblOpciones, BorderLayout.NORTH);
        
        atras = new JButton("Ir atrás");
        
        add(atras, BorderLayout.WEST);
        
        layerPane = new JLayeredPane();
        layerPane.setPreferredSize(new Dimension(1200, 750));
        
        panelOpciones = new PanelOpciones();
        panelOpciones.setBounds(250, 100, 700, 500);
        
        panelProducto = new PanelProductos();
        panelProducto.setBounds(50, 50, 1100, 650);
        panelProducto.setVisible(false); 
        
        layerPane.add(panelOpciones, Integer.valueOf(2));
        layerPane.add(panelProducto, Integer.valueOf(1));
        
        add(layerPane, BorderLayout.CENTER);
        
        System.out.println("Panel producto bounds: " + panelProducto.getBounds());
        System.out.println("Panel opciones bounds: " + panelOpciones.getBounds());
        System.out.println("LayerPane size: " + layerPane.getPreferredSize());
    }
    
    public void mostrarCategorias() {
        panelProducto.setVisible(false);
        lblOpciones.setText("CATEGORÍAS");
        panelOpciones.setVisible(true);
        layerPane.repaint();
    }
    
    public void mostrarProductos() {
        panelOpciones.setVisible(false);
        lblOpciones.setText("Productos");
        panelProducto.setVisible(true);
        layerPane.repaint();
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