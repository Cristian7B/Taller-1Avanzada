/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Combo;
import java.util.ArrayList;

import edu.progavud.taller1.model.Producto;

/**
 * Interface utilizada para el seguir
 * principio de segregacion de interfaces,
 * es implementada por ControPrincipal y 
 * ControlPedido.
 * 
 * @author Juan Diaz
 */
public interface InterfaceCreacion {
    /**
     * Metodo generico para la adicion de 
     * productos.
     * @param productoNuevo Producto individual.
     */
    public void anadirProducto(Producto productoNuevo);
    /**
     * Metodo generico para la adicion de 
     * un combo de productos.
     * @param comboNuevo Combo de Productos.
     */
    void añadirCombo(Combo comboNuevo);
    /**
     * Metodo generico para la adicion de 
     * un bucket de productos.
     * @param bucketNuevo Bucket de Productos.
     */
    void añadirBucket(Bucket bucketNuevo);
}
