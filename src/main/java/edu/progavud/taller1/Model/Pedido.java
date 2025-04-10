/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

import java.util.ArrayList;

/**
 *
 * @author ACER NITRO
 */
public class Pedido {
    private ArrayList<Producto> arrayProductos;
    private int valorTotal;
    private int valorTotalPuntos;
    private String turnoPedido;
    

    public Pedido() {
        this.arrayProductos = new ArrayList<>();
        this.valorTotal = 0;
        this.valorTotalPuntos = 0;
        this.turnoPedido = "";
    }

    public ArrayList<Producto> getArrayProductos() {
        return arrayProductos;
    }

    public void setArrayProductos(ArrayList<Producto> arrayProductos) {
        this.arrayProductos = arrayProductos;
    }

    public int getValorTotal() {
        return valorTotal;  
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getValorTotalPuntos() {
        return valorTotalPuntos;
    }

    public void setValorTotalPuntos(int valorTotalPuntos) {
        this.valorTotalPuntos = valorTotalPuntos;
    }

    public String getTurnoPedido() {
        return turnoPedido;
    }

    public void setTurnoPedido(String turnoPedido) {
        this.turnoPedido = turnoPedido;
    }





}
