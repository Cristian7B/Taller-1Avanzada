/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Control;

import edu.progavud.taller1.control.ControlPrincipal;
import edu.progavud.taller1.model.Catalogo;
import edu.progavud.taller1.model.Categoria;
import java.util.ArrayList;


/**
 *
 * @author crisc
 */
public class ControlCatalogo {
    private ControlPrincipal controlPrincipal;
    private Catalogo catalogo;
    
    public ControlCatalogo(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        catalogo = new Catalogo();
    }
    
    public void anadirCategoria(Categoria categoria) {
        catalogo.anadirCategoria(categoria);
    }
    
    public Categoria obtenerCategoria(int number) {
        return catalogo.getCatalogoGeneral().get(number);
    }
    
}
