/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Nicolas Velasco
 */
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PanelProductos extends JPanel {
    private JPanel panelBucket;
    private JPanel panelCombo;
    private JPanel panelHamburguesa;
    private JPanel panelPollo;
    private JPanel panelHelado;
    private JPanel panelPicar;
    

    public PanelProductos() {
        // Grid de 2 filas x 2 columnas, con separación de 10px
        setLayout(new GridLayout(2, 2, 10, 10));
        setBackground(Color.DARK_GRAY);
        
        inicializarComponentes();
        // Obtener las imágenes de la carpeta
        
        
    }
    public void inicializarComponentes(){
        for (int i = 0; i < 4; i++) {
            String nombre = "/Resources/assets/hamburguesa/img" + i + ".png";
            java.net.URL url = getClass().getResource(nombre);
            if (url == null) {
                System.out.println("No se encontró la imagen: " + nombre);
                continue;
            }

            ImageIcon icon = new ImageIcon(url);
            Image imgEscalada = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            JLabel lblImagen = new JLabel(new ImageIcon(imgEscalada));
            lblImagen.setHorizontalAlignment(JLabel.CENTER);

            JPanel celda = new JPanel(new BorderLayout(5, 5));
            celda.setBackground(Color.LIGHT_GRAY);
            celda.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

            JPanel panelTextos = new JPanel();
            panelTextos.setLayout(new BoxLayout(panelTextos, BoxLayout.Y_AXIS));
            panelTextos.setBackground(Color.LIGHT_GRAY);

            JLabel lblTitulo = new JLabel("Título " + i);
            lblTitulo.setFont(lblTitulo.getFont().deriveFont(Font.BOLD, 14f));
            JLabel lblDescripcion = new JLabel("Descripción " + i);
            lblDescripcion.setFont(lblDescripcion.getFont().deriveFont(12f));

            panelTextos.add(lblTitulo);
            panelTextos.add(Box.createVerticalStrut(5));
            panelTextos.add(lblDescripcion);

            celda.add(lblImagen, BorderLayout.WEST);
            celda.add(panelTextos, BorderLayout.CENTER);

            add(celda);
        }
    }

}
