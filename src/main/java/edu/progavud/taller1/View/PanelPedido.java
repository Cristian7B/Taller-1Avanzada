/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author crisc
 */
public class PanelPedido extends JPanel {
    
    private JLabel lblTitulo;
    
    public PanelPedido() {
        initComponents();
    }
    
    private void initComponents() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        lblTitulo = new JLabel("Tu Pedido");
        setBackground(new Color(0xFF5714));
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 18));
        
        add(lblTitulo);
    }
}
