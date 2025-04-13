/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

/**
 * Representa un producto genérico del negocio de comidas.
 * Esta clase contiene información común a todos los productos como nombre, descripción,
 * imagen asociada, precio, valor en puntos de fidelización y la cantidad disponible.
 * Es una clase base que puede ser extendida por productos más específicos como combos o gaseosas.
 * 
 * @author Nicolas Velasco
 */
public class Producto {

    /**
     * Nombre del producto.
     */
    protected String nombre;

    /**
     * Descripción del producto.
     */
    protected String descripcion;

    /**
     * Ruta relativa de la imagen asociada al producto.
     */
    protected String rutaImagenProducto;

    /**
     * Precio en pesos del producto.
     */
    protected int precio;

    /**
     * Valor en puntos del producto (para fidelización).
     */
    protected int valorPuntos;

    /**
     * Cantidad disponible o seleccionada del producto.
     */
    protected int cantidad;

    /**
     * Método constructor de la clase.
     * Crea un nuevo objeto con los datos proporcionados.
     * 
     * @param nombre                Nombre del producto.
     * @param descripcion           Descripción del producto.
     * @param rutaImagenProducto    Ruta de la imagen asociada.
     * @param precio                Precio en pesos.
     * @param valorPuntos           Valor en puntos de fidelización.
     * @param cantidad              Cantidad disponible o seleccionada.
     */
    public Producto(String nombre, String descripcion, String rutaImagenProducto, int precio, int valorPuntos, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rutaImagenProducto = rutaImagenProducto;
        this.precio = precio;
        this.valorPuntos = valorPuntos;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del producto.
     * 
     * @return Descripción del producto.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     * 
     * @param descripcion Nueva descripción del producto.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la ruta de la imagen del producto.
     * 
     * @return Ruta de la imagen.
     */
    public String getImagenProducto() {
        return rutaImagenProducto;
    }

    /**
     * Establece la ruta de la imagen del producto.
     * 
     * @param rutaImagenProducto Nueva ruta de la imagen.
     */
    public void setImagenProducto(String rutaImagenProducto) {
        this.rutaImagenProducto = rutaImagenProducto;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return Precio en pesos.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio Nuevo precio en pesos.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el valor del producto en puntos.
     * 
     * @return Valor en puntos de fidelización.
     */
    public int getValorPuntos() {
        return valorPuntos;
    }

    /**
     * Establece el valor del producto en puntos.
     * 
     * @param valorPuntos Nuevo valor en puntos.
     */
    public void setValorPuntos(int valorPuntos) {
        this.valorPuntos = valorPuntos;
    }

    /**
     * Obtiene la cantidad del producto.
     * 
     * @return Cantidad actual.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del producto.
     * 
     * @param cantidad Nueva cantidad.
     */
    public void setCantidadPuntos(int cantidad) {
        this.cantidad = cantidad;
    }
}
