/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

import java.util.ArrayList;

/**
 *
 * @author crisc
 */
public class Categoria {
    private ArrayList<Producto> categoria;
    
    public Categoria(ArrayList<Producto> categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Producto> getCategoria() {
        return categoria;
    }

    public void setCategoria(ArrayList<Producto> categoria) {
        this.categoria = categoria;
    }
    
    
    
}
