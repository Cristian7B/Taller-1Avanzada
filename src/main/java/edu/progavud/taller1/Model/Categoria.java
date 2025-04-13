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
    private Producto[] categoria;
    private String nombreCategoria;
    
    public Categoria(Producto[] categoria, String nombreCategoria) {
        this.categoria = categoria;
        this.nombreCategoria = nombreCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    

    public Producto[] getCategoria() {
        return categoria;
    }

    public void setCategoria(Producto[] categoria) {
        this.categoria = categoria;
    }
    
    
    
}
