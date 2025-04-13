/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.View;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Panel que muestra la factura del pedido con dos formas
 * de pago: efectivo y tarjeta.
 * 
 * @author Nicolas Velasco 
 */
public class PanelFactura extends JPanel{
    private JPanel contenedorProductos;
    private JLabel titulo;
    public JButton botonEfectivo;
    public JButton botonTarjeta;
    public PanelFactura(){
        inicializarComponentes();
        setVisible(true);
    }
    

    public void inicializarComponentes(){
        setLayout(new BorderLayout());
        titulo = new JLabel("Factura");
        titulo.setFont(new Font("Arial", Font.BOLD, 24)); 
        titulo.setHorizontalAlignment(SwingConstants.CENTER); 
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        add(titulo, BorderLayout.NORTH);
        
        contenedorProductos = new JPanel();
        contenedorProductos.setLayout(new BoxLayout(contenedorProductos, BoxLayout.Y_AXIS)); // Vertical
        add(contenedorProductos, BorderLayout.CENTER);
    }

    public void anadirProductoFactura(Producto producto){
        JPanel filaProducto = new JPanel();
        filaProducto.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        JLabel nombreLabel = new JLabel(producto.getNombre());
        JLabel valorLabel = new JLabel(String.valueOf(producto.getPrecio()));
        JLabel cantidadLabel = new JLabel(String.valueOf(producto.getCantidad()));
        JLabel precioFinalLabel = new JLabel(String.valueOf(producto.getPrecio()*producto.getCantidad())); 
        
        filaProducto.add(nombreLabel);
        filaProducto.add(valorLabel);
        filaProducto.add(cantidadLabel);
        filaProducto.add(precioFinalLabel);
        
        contenedorProductos.add(filaProducto);
        contenedorProductos.revalidate();
        contenedorProductos.repaint();
    }
    public void anadirBucketFactura(Bucket bucket){
        JPanel filaProducto = new JPanel();
        filaProducto.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        JLabel nombreLabel = new JLabel(bucket.getNombre());
        JLabel valorLabel = new JLabel(String.valueOf(bucket.getPrecio()));
        JLabel cantidadLabel = new JLabel(String.valueOf(bucket.getCantidad()));
        JLabel precioFinalLabel = new JLabel(String.valueOf(bucket.getPrecio()*bucket.getCantidad())); 
        
        filaProducto.add(nombreLabel);
        filaProducto.add(valorLabel);
        filaProducto.add(cantidadLabel);
        filaProducto.add(precioFinalLabel);
        
        contenedorProductos.add(filaProducto);
        contenedorProductos.revalidate();
        contenedorProductos.repaint();
    }
    public void anadirComboFactura(Combo combo){
        JPanel filaProducto = new JPanel();
        filaProducto.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        JLabel nombreLabel = new JLabel(combo.getNombre());
        JLabel valorLabel = new JLabel(String.valueOf(combo.getPrecio()));
        JLabel cantidadLabel = new JLabel(String.valueOf(combo.getCantidad()));
        JLabel precioFinalLabel = new JLabel(String.valueOf(combo.getPrecio()*combo.getCantidad())); 
        
        filaProducto.add(nombreLabel);
        filaProducto.add(valorLabel);
        filaProducto.add(cantidadLabel);
        filaProducto.add(precioFinalLabel);
        
        contenedorProductos.add(filaProducto);
        contenedorProductos.revalidate();
        contenedorProductos.repaint();
    }
}
