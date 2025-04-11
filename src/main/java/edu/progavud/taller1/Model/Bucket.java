/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 *
 * @author crisc
 */
public class Bucket extends Producto {
    private ArrayList<Producto> productosSeleccionados;

    public Bucket(
            String nombre, 
            String descripcion, 
            String rutaImagenProducto,
            int cantidad) {
        super(nombre, descripcion, rutaImagenProducto, 0, 0, cantidad);
        this.productosSeleccionados = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosSeleccionados.add(producto);
        setPrecio(getPrecio() + producto.getPrecio());
    }

    public void removerProducto(Producto producto) {
        if (productosSeleccionados.remove(producto)) {
            setPrecio(getPrecio() - producto.getPrecio());
        }
    }

    public ArrayList<Producto> getProductosSeleccionados() {
        return productosSeleccionados;
    }

    public void setProductosSeleccionados(ArrayList<Producto> productosSeleccionados) {
        this.productosSeleccionados = productosSeleccionados;

        int nuevoPrecio = 0;
        for (Producto p : productosSeleccionados) {
            nuevoPrecio += p.getPrecio();
        }
        setPrecio(nuevoPrecio);
    }
}

