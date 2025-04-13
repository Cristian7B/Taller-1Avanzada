/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import javax.swing.*;
import java.awt.*;

public class PanelPedido extends JPanel {
    
    private JLabel lblTitulo;
    private JLabel subTotal;

    public PanelPedido() {
        initComponents();
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String precio) {
        subTotal.setText(precio);
    }

    private void initComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(0xFF5714));

        lblTitulo = new JLabel("Tu Pedido");
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 25));
        lblTitulo.setForeground(new Color(241, 241, 233));
        lblTitulo.setAlignmentX(CENTER_ALIGNMENT);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        subTotal = new JLabel("Total: 0$");
        subTotal.setFont(new Font("SansSerif", Font.BOLD, 18));
        subTotal.setForeground(new Color(241, 241, 233));
        subTotal.setAlignmentX(CENTER_ALIGNMENT);
        subTotal.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        add(lblTitulo);
        add(subTotal);
    }

    public void anadirJLabel(String nombreProducto) {
        JLabel nombreProductoLabel = new JLabel(nombreProducto);
        nombreProductoLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        nombreProductoLabel.setForeground(Color.WHITE);
        nombreProductoLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(nombreProductoLabel);
        revalidate();
        repaint();
    }
    
    public void limpiarPedido() {
        removeAll();
        add(lblTitulo);
        subTotal.setText("Total: $0");
        add(subTotal);

        revalidate();
        repaint();
    }

}


