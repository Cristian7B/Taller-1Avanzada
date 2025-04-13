/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

import java.util.ArrayList;

/**
 * Esta clase representa a los buckets en el programa
 * 
 * @author Cristian Bonilla
 */
public class Categoria {
    /**
     * categoria es un conjunto de productos
     */
    private Producto[] categoria;
    /**
     * esta variable se asignará al nombre de cada categoria
     */
    private String nombreCategoria;
    /**
     * Método constructor de la clase
     * @param categoria         union de producto dentro de una categoria
     * @param nombreCategoria   variable para asignar el nombre de cada categoria
     */
    public Categoria(Producto[] categoria, String nombreCategoria) {
        this.categoria = categoria;
        this.nombreCategoria = nombreCategoria;
    }
    
    /**
     * obtiene el nombre de una categoria
     * @return nombreCategoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * modifica el nombre de una categoria
     * 
     * @param nombreCategoria nombre nuevo a asignar
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    /**
     * obtiene la categoria completa
     * @return  categoria
     */
    public Producto[] getCategoria() {
        return categoria;
    }
    /**
     * asigna una categoria ya creada
     * @param categoria categoria a asignar
     */
    public void setCategoria(Producto[] categoria) {
        this.categoria = categoria;
    }
    
    
    
}
