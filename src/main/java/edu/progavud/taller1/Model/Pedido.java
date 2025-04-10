/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Model;

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
    private ArrayList<ArrayList<Producto>> arrayBucketsyCombos;

    public Pedido() {
        this.arrayProductos = new ArrayList<>();
        this.valorTotal = 0;
        this.valorTotalPuntos = 0;
        this.turnoPedido = "";
        this.arrayBucketsyCombos = new ArrayList<>();
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

    public ArrayList<ArrayList<Producto>> getArrayBucketsyCombos() {
        return arrayBucketsyCombos;
    }

    public void setArrayBucketsyCombos(ArrayList<ArrayList<Producto>> arrayBucketsyCombos) {
        this.arrayBucketsyCombos = arrayBucketsyCombos;
    }


}
