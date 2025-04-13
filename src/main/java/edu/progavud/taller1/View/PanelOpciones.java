/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ACER NITRO
 */
public class PanelOpciones extends JPanel {
    public JButton botonBucket;
    public JButton botonCombo;
    public JButton botonHamburguesa;    
    public JButton botonPollo;
    public JButton botonHelado;
    public JButton botonPicar;
    private JLabel lblTitulo;
    
    public PanelOpciones(){
        setLayout(new GridLayout(3,2));
        setBackground(Color.gray);
        inicializarComponentes();
        setVisible(false);
    }
    
    public void inicializarComponentes(){
        
        botonBucket = new JButton("BUCKET");
        add(botonBucket);
        
        botonCombo = new JButton("COMBOS");
        add(botonCombo);
        
        botonHamburguesa = new JButton("HAMBURGUESAS");
        add(botonHamburguesa);
        
        botonPollo = new JButton("POLLO");
        add(botonPollo);
        
        botonHelado = new JButton("HELADOS");
        add(botonHelado);
        
        botonPicar = new JButton("PARA PICAR");
        add(botonPicar);
                        
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
