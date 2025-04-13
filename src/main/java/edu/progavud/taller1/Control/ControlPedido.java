/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Gaseosa;
import edu.progavud.taller1.Model.Pedido;
import edu.progavud.taller1.model.Producto;
import java.util.ArrayList;
/**
 * Clase encargada de manejar la lógica asociada a la creación y administración de un pedido.
 * 
 * Permite añadir productos, combos o buckets al pedido actual, así como calcular 
 * automáticamente el precio total y los puntos acumulados del pedido.
 * 
 * @author  Nicolas Velasco
 */
public class ControlPedido implements InterfaceCreacion {

    /** Referencia al controlador principal de la aplicación. */
    private ControlPrincipal controlPrincipal;

    /** Pedido que está siendo procesado actualmente. */
    private Pedido pedidoActual;

    /**
     * Crea una instancia del controlador de pedido asociada al controlador principal.
     * Inicializa un nuevo pedido vacío.
     * 
     * @param controlPrincipal instancia del controlador principal
     */
    public ControlPedido(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.pedidoActual = new Pedido();
    }
    
    public Pedido retornarPedido() {
        return pedidoActual;
    }
    
    public void crearPedido() {
        pedidoActual = new Pedido();
    }
    
    public ArrayList<Producto> productosPedido() {
        return pedidoActual.getArrayProductos();
    }
    
    public void anadirProducto(Producto producto) {
        pedidoActual.getArrayProductos().add(producto);
        actualizarPuntosYPrecio();
    }

    /**
     * Añade un combo al pedido actual.
     * 
     * @param comboNuevo combo a añadir al pedido
     */
    public void añadirCombo(Combo comboNuevo) {
        pedidoActual.getArrayProductos().add(comboNuevo);
        actualizarPuntosYPrecio();
    }

    /**
     * Añade un bucket al pedido actual.
     * 
     * @param bucketNuevo bucket a añadir al pedido
     */
    public void añadirBucket(Bucket bucketNuevo) {
        pedidoActual.getArrayProductos().add(bucketNuevo);
        actualizarPuntosYPrecio();
    }

    /**
     * Actualiza el precio total del pedido y el total de puntos acumulados,
     * en función de los productos, combos o buckets añadidos.
     */
    public void actualizarPuntosYPrecio() {
        int totalPuntos = 0;
        int precio = 0;
        for (int i = 0; i < pedidoActual.getArrayProductos().size(); i++) {
            precio += pedidoActual.getArrayProductos().get(i).getPrecio();
            totalPuntos += pedidoActual.getArrayProductos().get(i).getValorPuntos();
        }

        pedidoActual.setValorTotal(precio);
        pedidoActual.setValorTotalPuntos(totalPuntos);
    }
}

