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

public class Combo extends Producto {
    private Producto[] productosIncluidos;
    private String adiciones;

    public Combo(
            String nombre, 
            String descripcion, 
            String rutaImagenProducto, 
            int precio,
            int valorPuntos, 
            int cantidad, 
            Producto[] productosIncluidos,
            String adiciones){
        super(nombre, descripcion, rutaImagenProducto, precio, valorPuntos, cantidad);
        this.productosIncluidos = productosIncluidos;
        this.adiciones = adiciones;
    }

    public Producto[] getProductosIncluidos() {
        return productosIncluidos;
    }
    
    public void cambiarPrecio() {
        super.setPrecio(
            this.productosIncluidos[0].getPrecio() +
            adiciones.split(" ").length * 2000 + 
            this.productosIncluidos[1].getPrecio()
        );
    }

    public void setProductosIncluidos(Producto[] productosIncluidos) {
        this.productosIncluidos = productosIncluidos;
    }

    public String getAdiciones() {
        return adiciones;
    }

    public void setAdiciones(String adiciones) {
        this.adiciones = adiciones;
    }
    
    
}
