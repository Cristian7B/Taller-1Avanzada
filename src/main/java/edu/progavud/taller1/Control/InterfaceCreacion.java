/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.progavud.taller1.Control;

import java.util.ArrayList;

import edu.progavud.taller1.Model.Producto;

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
     * un array de productos.
     * @param productoNuevo Array de Productos.
     */
    public void anadirProducto(ArrayList<Producto> productoNuevo);
}
