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
/**
 *
 * @author ACER NITRO
 */
public class ControlPedido implements InterfaceCreacion{
    private ControlPrincipal controlPrincipal;
    private Pedido pedidoActual;
    
    public ControlPedido(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.pedidoActual = new Pedido();
    }
    
    public void crearPedido() {
        pedidoActual = new Pedido();
    }
    
    public void anadirProducto(Producto producto) {
        pedidoActual.getArrayProductos().add(producto);
        actualizarPuntosYPrecio();
    }
    
    public void añadirCombo(Combo comboNuevo) {
        pedidoActual.getArrayProductos().add(comboNuevo);
        actualizarPuntosYPrecio();
    }
    
    public void añadirBucket(Bucket bucketNuevo) {
        pedidoActual.getArrayProductos().add(bucketNuevo);
        actualizarPuntosYPrecio();
    }
    
    
    public void actualizarPuntosYPrecio() {       
        int totalPuntos = 0;
        int precio = 0;
        for(int i = 0; i < pedidoActual.getArrayProductos().size(); i++) {
            precio += pedidoActual.getArrayProductos().get(i).getPrecio();
            totalPuntos += pedidoActual.getArrayProductos().get(i).getValorPuntos();
        }
        
        pedidoActual.setValorTotal(precio);
        pedidoActual.setValorTotalPuntos(totalPuntos);
    }
    
}
