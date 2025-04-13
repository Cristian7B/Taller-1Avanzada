/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Control;

import edu.progavud.taller1.control.ControlPrincipal;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author crisc
 */
public class ControlCategoria {
    private ControlPrincipal controlPrincipal;
    
    public ControlCategoria(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public Categoria crearCategoria(Producto[] categoria, String nombreCategoria) {
        return new Categoria(categoria, nombreCategoria);
    }
}
