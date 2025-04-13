package edu.progavud.taller1.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel {
    public JButton botonBucket;
    public JButton botonCombo;
    public JButton botonHamburguesa;    
    public JButton botonPollo;
    public JButton botonHelado;
    public JButton botonPicar;
    private JLabel lblTitulo;
    private JPanel panelOpciones;
    
    public PanelOpciones() {
        setBackground(new Color(0xFFAD05));
        setLayout(new GridBagLayout());

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
        contenedor.setBackground(new Color(0xFFAD05));

        inicializarComponentes(contenedor);
        add(contenedor); 
        setVisible(false);
    }

    public void inicializarComponentes(JPanel contenedor) {
        lblTitulo = new JLabel("¡Escoge qué quieres comer hoy!", JLabel.CENTER);
        lblTitulo.setFont(new Font("SansSerif", Font.BOLD, 35));
        lblTitulo.setForeground(new Color(241, 241, 233));
        lblTitulo.setAlignmentX(CENTER_ALIGNMENT);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        contenedor.add(lblTitulo);

        panelOpciones = new JPanel();
        panelOpciones.setLayout(new GridLayout(3, 2, 10, 10));
        panelOpciones.setAlignmentX(CENTER_ALIGNMENT);
        panelOpciones.setMaximumSize(new Dimension(400, 200));
        panelOpciones.setPreferredSize(new Dimension(400, 200));
        panelOpciones.setBackground(new Color(0xFFAD05));

        botonBucket = crearBoton("Buckets");
        panelOpciones.add(botonBucket);

        botonCombo = crearBoton("Combos");
        panelOpciones.add(botonCombo);

        botonHamburguesa = crearBoton("Hamburguesas");
        panelOpciones.add(botonHamburguesa);

        botonPollo = crearBoton("Pollo");
        panelOpciones.add(botonPollo);

        botonHelado = crearBoton("Helados");
        panelOpciones.add(botonHelado);

        botonPicar = crearBoton("Entradas");
        panelOpciones.add(botonPicar);

        contenedor.add(panelOpciones);
    }

    private JButton crearBoton(String texto){
        JButton boton = new JButton(texto);
        boton.setFont(new Font("SansSerif", Font.PLAIN, 20));
        boton.setBackground(new Color(0xFF5714)); 
        boton.setForeground(new Color(241, 241, 233));
        boton.setPreferredSize(new java.awt.Dimension(150, 50)); // Tamaño fijo
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setOpaque(true); 
        return boton;
    }

    public JButton getBotonBucket() {
        return botonBucket;
    }

    public void setBotonBucket(JButton botonBucket) {
        this.botonBucket = botonBucket;
    }

    public JButton getBotonCombo() {
        return botonCombo;
    }

    public void setBotonCombo(JButton botonCombo) {
        this.botonCombo = botonCombo;
    }

    public JButton getBotonHamburguesa() {
        return botonHamburguesa;
    }

    public void setBotonHamburguesa(JButton botonHamburguesa) {
        this.botonHamburguesa = botonHamburguesa;
    }

    public JButton getBotonPollo() {
        return botonPollo;
    }

    public void setBotonPollo(JButton botonPollo) {
        this.botonPollo = botonPollo;
    }

    public JButton getBotonHelado() {
        return botonHelado;
    }

    public void setBotonHelado(JButton botonHelado) {
        this.botonHelado = botonHelado;
    }

    public JButton getBotonPicar() {
        return botonPicar;
    }

    public void setBotonPicar(JButton botonPicar) {
        this.botonPicar = botonPicar;
    }
}
