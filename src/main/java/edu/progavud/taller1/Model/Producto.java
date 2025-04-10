/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Model;

import java.awt.image.BufferedImage;

/**
 *
 * @author ACER NITRO
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private BufferedImage imagenProducto;
    private int precio;
    private int valorPuntos;
    private int cantidadPuntos;

    public Producto(String nombre, String descripcion, BufferedImage imagenProducto, int precio, int valorPuntos, int cantidadPuntos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenProducto = imagenProducto;
        this.precio = precio;
        this.valorPuntos = valorPuntos;
        this.cantidadPuntos = cantidadPuntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BufferedImage getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(BufferedImage imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getValorPuntos() {
        return valorPuntos;
    }

    public void setValorPuntos(int valorPuntos) {
        this.valorPuntos = valorPuntos;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }
    
}
