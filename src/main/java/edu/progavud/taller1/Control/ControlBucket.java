/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Producto;

/**
 * Controlador para la gestión de un bucket de productos.
 * Permite crear un nuevo bucket, añadir y eliminar productos, 
 * y eliminar el bucket actual.
 * Esta clase delega en control principal para acceder al modelo
 * global de la aplicación si es necesario.
 * 
 * @author Cristian Bonilla
 */
public class ControlBucket {

    /** 
     * Referencia al controlador principal de la aplicación.
     */
    private ControlPrincipal controlPrincipal;

    /** 
     * Instancia actual del bucket en uso. 
     */
    private Bucket bucketActual;

    /**
     * Método constructor de la clase.
     * Construye un controlador de bucket asociado al controlador principal.
     *
     * @param controlPrincipal instancia de ControlPrincipal
     *                         para acceder al modelo global.
     */
    public ControlBucket(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }

    /**
     * Crea un nuevo {@link Bucket} con valores por defecto
     * y lo asigna como el bucket actual.
     * El bucket se inicializa con:
     *   Nombre: "Bucket"
     *   Descripción: "Bucket de productos del restaurante"
     *   Imagen: cadena vacía
     *   Precio inicial: 0
     */
    public void crearBucket() {
        Bucket bucketNuevo = new Bucket(
            "Bucket",
            "Bucket de productos del restaurante",
            "",
            0
        );
        bucketActual = bucketNuevo;
    }

    /**
     * Añade un objeto producto al bucket actual.
     *
     * @param producto el producto a añadir; 
     * @throws IllegalStateException si no existe un bucket actual
     */
    public void anadirProducto(Producto producto) {
        if (bucketActual == null) {
            throw new IllegalStateException("No hay un bucket creado para añadir productos.");
        }
        bucketActual.agregarProducto(producto);
    }

    /**
     * Elimina un Producto del bucket actual.
     *
     * @param producto el producto a eliminar;
     * @throws IllegalStateException si no existe un bucket actual
     */
    public void eliminarProducto(Producto producto) {
        if (bucketActual == null) {
            throw new IllegalStateException("No hay un bucket creado para eliminar productos.");
        }
        bucketActual.removerProducto(producto);
    }

    /**
     * Elimina el bucket actual, dejándolo en null.
     */
    public void eliminarBucket() {
        bucketActual = null;
    }
}
