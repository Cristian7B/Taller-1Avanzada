/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 * Esta clase representa a los buckets en el programa
 * 
 * @author Cristian Bonilla
 */
public class Bucket extends Producto {
    /**
     * Arraylist de productos representa el bucket, ya que esta compuesto de los productos seleccionados por el usuario
     */
    private ArrayList<Producto> productosSeleccionados;

    /**
     * Método constructor de la clase
     * 
     * @param nombre                nombre del producto seleccionado  
     * @param descripcion           descripción del producto seleccionado
     * @param rutaImagenProducto    ruta relativa de la imagen del producto seleccionado
     * @param cantidad              cantidad que deséa llevar del producto seleccionado
     */
    public Bucket(
            String nombre, 
            String descripcion, 
            String rutaImagenProducto,
            int cantidad) {
        super(nombre, descripcion, rutaImagenProducto, 0, 0, cantidad);
        this.productosSeleccionados = new ArrayList<>();
    }

    /**
     * Agrega un producto al bucket
     * 
     * @param producto producto seleccionado por el usuario
     */
    public void agregarProducto(Producto producto) {
        productosSeleccionados.add(producto);
        setPrecio(getPrecio() + producto.getPrecio());
    }

    /**
     * Remueve un producto del bucket
     * 
     * @param producto producto seleccionado por el usuario
     */
    public void removerProducto(Producto producto) {
        if (productosSeleccionados.remove(producto)) {
            setPrecio(getPrecio() - producto.getPrecio());
        }
    }

    /**
     * obtiene todos los productos seleccionados o el bucket
     * 
     * @return productosSeleccionados o bucket
     */
    public ArrayList<Producto> getProductosSeleccionados() {
        return productosSeleccionados;
    }
    
    /** 
     * modifica los productos seleccionados dentro del bucket
     * 
     * @param productosSeleccionados    productos seleccionados a modificar por el usuario
     */
    public void setProductosSeleccionados(ArrayList<Producto> productosSeleccionados) {
        this.productosSeleccionados = productosSeleccionados;

        int nuevoPrecio = 0;
        for (Producto p : productosSeleccionados) {
            nuevoPrecio += p.getPrecio();
        }
        setPrecio(nuevoPrecio);
    }
}

