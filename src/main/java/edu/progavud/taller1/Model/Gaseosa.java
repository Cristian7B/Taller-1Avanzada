/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

/**
 * Representa una gaseosa como un producto del negocio.
 * Esta clase extiende de producto e incluye un atributo adicional
 * que indica el tamaño de la bebida. El precio puede variar dependiendo del tamaño.
 * 
 * @author Cristian Bonilla
 */
public class Gaseosa extends Producto {

    /**
     * Tamaño de la gaseosa.
     */
    private String tamano;

    /**
     * Método constructor de la clase.
     * Crea un nuevo objeto con los atributos especificados.
     *
     * @param nombre                Nombre de la gaseosa.
     * @param descripcion           Breve descripción del producto.
     * @param rutaImagenProducto    Ruta de la imagen asociada al producto.
     * @param precio                Precio de la gaseosa.
     * @param valorPuntos           Valor en puntos del producto.
     * @param cantidad              Cantidad disponible en inventario.
     * @param tamano                Tamaño de la gaseosa (ej. "Pequeño", "Mediano", "Grande").
     */
    public Gaseosa(String nombre, String descripcion, String rutaImagenProducto, int precio, int valorPuntos, int cantidad, String tamano) {
        super(nombre, descripcion, rutaImagenProducto, precio, valorPuntos, cantidad);
        this.tamano = tamano;
    }

    /**
     * Ajusta el precio de la gaseosa según su tamaño.
     */
    public void cambiarPrecio() {
        if (tamano.equals("Pequeño")) {
            super.setPrecio(3000);
        } else if (tamano.equals("Mediano")) {
            super.setPrecio(6000);
        } else {
            super.setPrecio(9000);
        }
    }

    /**
     * Establece el tamaño de la gaseosa.
     *
     * @param tamano Nuevo tamaño.
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    /**
     * Obtiene el tamaño de la gaseosa.
     *
     * @return Una cadena que representa el tamaño del producto.
     */
    public String getTamano() {
        return tamano;
    }
}

