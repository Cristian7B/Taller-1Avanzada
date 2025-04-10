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
public class Catalogo {
    private ArrayList<Categoria> catalogoGeneral;
    
    public Catalogo(ArrayList<Categoria> catalogoGeneral) {
        this.catalogoGeneral = catalogoGeneral;
    }
    
    public void anadirCategoria(Categoria categoria) {
        catalogoGeneral.add(categoria);
    }

    public ArrayList<Categoria> getCatalogoGeneral() {
        return catalogoGeneral;
    }

    public void setCatalogoGeneral(ArrayList<Categoria> catalogoGeneral) {
        this.catalogoGeneral = catalogoGeneral;
    }
    
    
}
