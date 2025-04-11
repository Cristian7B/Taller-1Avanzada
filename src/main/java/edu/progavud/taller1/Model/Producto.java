/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

import java.awt.image.BufferedImage;

import java.awt.image.BufferedImage;

/**
 *
 * @author ACER NITRO
 */
public class Producto {
    private String nombre;
    private String descripcion;
    private String rutaImagenProducto;
    private int precio;
    private int valorPuntos;
    private int cantidad;

    public Producto(String nombre, String descripcion, String rutaImagenProducto, int precio, int valorPuntos, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagenProducto = rutaImagenProducto;
        this.precio = precio;
        this.valorPuntos = valorPuntos;
        this.cantidad = cantidad;
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

    public String getImagenProducto() {
        return rutaImagenProducto;
    }

    public void setImagenProducto(String rutaImagenProducto) {
        this.rutaImagenProducto = rutaImagenProducto;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidadPuntos(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
