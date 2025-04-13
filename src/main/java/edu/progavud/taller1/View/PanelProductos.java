/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel para mostrar los productos de cada categoría
 * @author Nicolas Velasco
 */
public class PanelProductos extends JPanel {
    
    public PanelProductos() {
        setLayout(new GridLayout(2, 2, 10, 10));
        setBackground(Color.DARK_GRAY);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    
    /**
     * Carga productos para una categoría específica
     * @param categoryFolder El nombre de la carpeta de recursos
     * @param count El número de productos a cargar
     */
    public void cargarProductosNormales(Producto producto) {
        ImageIcon icon = new ImageIcon(getClass().getResource(producto.getImagenProducto()));
        Image imgEscalada = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel lblImagen = new JLabel(new ImageIcon(imgEscalada));
        lblImagen.setHorizontalAlignment(JLabel.CENTER);


        JPanel celda = new JPanel(new BorderLayout(5, 5));
        celda.setBackground(new Color(255, 214, 58)); 
        celda.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panelTextos = new JPanel();
        panelTextos.setLayout(new BoxLayout(panelTextos, BoxLayout.Y_AXIS));
        panelTextos.setBackground(new Color(255, 214, 58));

        String title = producto.getNombre();
        String description = producto.getDescripcion();

        JLabel lblTitulo = new JLabel(title);
        lblTitulo.setFont(new Font("Showcard Gothic", Font.BOLD, 16));

        JLabel lblDescripcion = new JLabel(description);
        lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 12));

        panelTextos.add(lblTitulo);
        panelTextos.add(Box.createVerticalStrut(5));
        panelTextos.add(lblDescripcion);
        
        celda.add(lblImagen, BorderLayout.WEST);
        celda.add(panelTextos, BorderLayout.CENTER);

        add(celda);
    }
    
    public void resetear() {
        removeAll();
        revalidate();
        repaint();
    }
    
    public void cargarProductosCombo(Combo combo) {
        System.out.println("edu.progavud.taller1.View.PanelProductos.cargarProductosCombo() " + combo.getImagenProducto());
        ImageIcon icon = new ImageIcon(getClass().getResource(combo.getImagenProducto()));
        Image imgEscalada = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel lblImagen = new JLabel(new ImageIcon(imgEscalada));
        lblImagen.setHorizontalAlignment(JLabel.CENTER);
        
        JPanel celda = new JPanel(new BorderLayout(5, 5));
        celda.setBackground(new Color(255, 214, 58)); 
        celda.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel panelTextos = new JPanel();
        panelTextos.setLayout(new BoxLayout(panelTextos, BoxLayout.Y_AXIS));
        panelTextos.setBackground(new Color(255, 214, 58));

        String title = combo.getNombre();
        String description = combo.getDescripcion();

        JLabel lblTitulo = new JLabel(title);
        lblTitulo.setFont(new Font("Showcard Gothic", Font.BOLD, 16));

        JLabel lblDescripcion = new JLabel(description);
        lblDescripcion.setFont(new Font("Arial", Font.PLAIN, 12));

        panelTextos.add(lblTitulo);
        panelTextos.add(Box.createVerticalStrut(5));
        panelTextos.add(lblDescripcion);
        
        celda.add(lblImagen, BorderLayout.WEST);
        celda.add(panelTextos, BorderLayout.CENTER);
        //Espacio para la creación de las adiciones, checkboxes
        add(celda);
    }

}