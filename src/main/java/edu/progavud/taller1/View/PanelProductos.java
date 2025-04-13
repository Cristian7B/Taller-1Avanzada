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
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel para mostrar los productos de cada categoría
 * @author Nicolas Velasco
 */
public class PanelProductos extends JPanel {
    public ArrayList<JButton> botonesHamburguesa;
    public ArrayList<JButton> botonesCombo;
    public ArrayList<JButton> botonesPicar;
    public ArrayList<JButton> botonesHelado;
    
    public PanelProductos() {
        setLayout(new GridLayout(2, 2, 10, 10));
        setBackground(new Color(0xFFAD05));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        botonesHamburguesa = new ArrayList<>();    
        anadirBotonesHamburguesa();
        botonesCombo = new ArrayList<>();
        anadirBotonesCombo();
        botonesPicar = new ArrayList<>();
        anadirBotonesPicar();
        botonesHelado = new ArrayList<>();
        anadirBotonesHelado();
    }
    
    public void anadirBotonesHamburguesa() {
        botonesHamburguesa.add(new JButton("Añadir"));
        botonesHamburguesa.add(new JButton("Añadir"));
        botonesHamburguesa.add(new JButton("Añadir"));
        botonesHamburguesa.add(new JButton("Añadir"));
    }
    
    public void anadirBotonesCombo() {
        botonesCombo.add(new JButton("Añadir"));
        botonesCombo.add(new JButton("Añadir"));
        botonesCombo.add(new JButton("Añadir"));
        botonesCombo.add(new JButton("Añadir"));
    }

    public void anadirBotonesPicar() {
        botonesPicar.add(new JButton("Añadir"));
        botonesPicar.add(new JButton("Añadir"));
        botonesPicar.add(new JButton("Añadir"));
        botonesPicar.add(new JButton("Añadir"));
    }

    public void anadirBotonesHelado() {
        botonesHelado.add(new JButton("Añadir"));
        botonesHelado.add(new JButton("Añadir"));
        botonesHelado.add(new JButton("Añadir"));
        botonesHelado.add(new JButton("Añadir"));
    }
    
    /**
     * Carga productos para una categoría específica
     * @param categoryFolder El nombre de la carpeta de recursos
     * @param count El número de productos a cargar
     */
    public void cargarHamburguesas(Producto producto, int count) {
        ImageIcon icon = new ImageIcon(getClass().getResource(producto.getImagenProducto()));
        Image imgEscalada = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
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
        celda.add(botonesHamburguesa.get(count), BorderLayout.SOUTH);

        add(celda);
    }

    public void cargarHelados(Producto producto, int count) {
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

        celda.add(botonesHelado.get(count), BorderLayout.SOUTH);
        add(celda);
    }

    public void cargarPicar(Producto producto, int count) {
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

        celda.add(botonesPicar.get(count), BorderLayout.SOUTH);

        add(celda);
    }
    
    public void cargarProductosCombo(Combo combo, int count) {
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
        celda.add(botonesCombo.get(count), BorderLayout.SOUTH);
        //Espacio para la creación de las adiciones, checkboxes
        add(celda);
    }

    public void resetear() {
        removeAll();
        revalidate();
        repaint();
    }

}