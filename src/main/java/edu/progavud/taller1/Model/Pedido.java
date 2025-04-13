package edu.progavud.taller1.Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import edu.progavud.taller1.model.Producto;
import java.util.ArrayList;

/**
 * Representa un pedido realizado por un usuario.
 * Un pedido contiene una lista de productos seleccionados por el cliente,
 * el valor total en dinero, el valor total en puntos acumulados y el turno
 * al que pertenece el pedido.
 * 
 * @author Nicolas Velasco 
 */
public class Pedido {

    /**
     * Lista de productos incluidos en el pedido.
     */
    private ArrayList<Producto> arrayProductos;

    /**
     * Valor total en dinero del pedido.
     */
    private int valorTotal;

    /**
     * Valor total del pedido expresado en puntos de fidelización.
     */
    private int valorTotalPuntos;

    /**
     * Turno asociado al pedido.
     */
    private String turnoPedido;

    /**
     * Método constructor de la clase.
     * 
     * Crea un nuevo objeto con valores por defecto.
     */
    public Pedido() {
        this.arrayProductos = new ArrayList<>();
        this.valorTotal = 0;
        this.valorTotalPuntos = 0;
        this.turnoPedido = "";
    }

    /**
     * Obtiene la lista de productos del pedido.
     * 
     * @return Una lista de objetos.
     */
    public ArrayList<Producto> getArrayProductos() {
        return arrayProductos;
    }

    /**
     * Establece la lista de productos del pedido.
     * 
     * @param arrayProductos Una lista de productos a asociar al pedido.
     */
    public void setArrayProductos(ArrayList<Producto> arrayProductos) {
        this.arrayProductos = arrayProductos;
    }

    /**
     * Obtiene el valor total en dinero del pedido.
     * 
     * @return Valor total en pesos.
     */
    public int getValorTotal() {
        return valorTotal;  
    }

    /**
     * Establece el valor total en dinero del pedido.
     * 
     * @param valorTotal Nuevo valor total en pesos.
     */
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Obtiene el valor total del pedido en puntos.
     * 
     * @return Valor total en puntos de fidelización.
     */
    public int getValorTotalPuntos() {
        return valorTotalPuntos;
    }

    /**
     * Establece el valor total del pedido en puntos.
     * 
     * @param valorTotalPuntos Nuevo valor en puntos.
     */
    public void setValorTotalPuntos(int valorTotalPuntos) {
        this.valorTotalPuntos = valorTotalPuntos;
    }

    /**
     * Obtiene el turno asociado al pedido.
     * 
     * @return Una cadena que representa el turno del pedido.
     */
    public String getTurnoPedido() {
        return turnoPedido;
    }

    /**
     * Establece el turno asociado al pedido.
     * 
     * @param turnoPedido Cadena con el turno.
     */
    public void setTurnoPedido(String turnoPedido) {
        this.turnoPedido = turnoPedido;
    }
}
