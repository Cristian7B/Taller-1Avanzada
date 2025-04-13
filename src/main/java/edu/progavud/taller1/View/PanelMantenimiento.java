/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import edu.progavud.taller1.control.ControlVentana;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ACER NITRO
 */
public class PanelMantenimiento extends JPanel {
    public JButton jButton1;
    public JButton jButton2;
    public PanelMantenimiento() {
        setBackground(new Color(0xFF5714));
        JLabel labelTitulo = new JLabel("En mantenimiento");
        labelTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 50));
        add(labelTitulo);
        
        jButton1 = new JButton("Menu");
        jButton2 = new JButton("Salir");
        
        JPanel panelNuevo = new JPanel();
        panelNuevo.setLayout(new FlowLayout());
        panelNuevo.add(jButton1);
        panelNuevo.add(jButton2);
        
        add(panelNuevo);
    }
}
