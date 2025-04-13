/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

import java.util.ArrayList;

/**
 * Esta clase representa el catálogo de las categorias de productos del programa
 * 
 * @author Cristian Bonilla
 */
public class Catalogo {
    /**
     * arrayList de todo el catálogo, cada posición esta conformada por una categoria
     */
    private ArrayList<Categoria> catalogoGeneral;
    /**
     * Método constructor de la clase
     */
    public Catalogo() {
        this.catalogoGeneral = new ArrayList<>();
    }
    /**
     * añade una categoria al catálogo
     * 
     * @param categoria categoria escogida a añadir dentro del catálogo 
     */
    public void anadirCategoria(Categoria categoria) {
        catalogoGeneral.add(categoria);
    }

    /**
     * obtiene el catálogo por completo
     * @return catalogoGeneral  el catálogo final creado
     */
    public ArrayList<Categoria> getCatalogoGeneral() {
        return catalogoGeneral;
    }

    /**
     * asigna un nuevo catalogo ya creado
     * @param catalogoGeneral catalogo general creado anteriormente
     */
    public void setCatalogoGeneral(ArrayList<Categoria> catalogoGeneral) {
        this.catalogoGeneral = catalogoGeneral;
    }
    
    
}
