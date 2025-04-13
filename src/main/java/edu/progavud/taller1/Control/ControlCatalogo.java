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
 * Clase encargada de gestionar el catálogo general de categorías
 * dentro de la aplicación. Actúa como intermediario entre la lógica
 * principal y el modelo de datos del catálogo.
 * 
 * Proporciona métodos para añadir nuevas categorías al catálogo
 * y obtener una categoría específica mediante su índice.
 * 
 * Este controlador depende del ControlPrincipal para integrarse
 * con el resto de la lógica de la aplicación.
 * 
 * @author  Cristian Bonilla
 */
public class ControlCatalogo {

    /** Referencia al controlador principal de la aplicación. */
    private ControlPrincipal controlPrincipal;

    /** Catálogo general de categorías del restaurante. */
    private Catalogo catalogo;

    /**
     * Construye un controlador de catálogo que se enlaza
     * al controlador principal.
     * 
     * @param controlPrincipal instancia del controlador principal
     */
    public ControlCatalogo(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        catalogo = new Catalogo();
    }

    /**
     * Añade una nueva categoría al catálogo general.
     * 
     * @param categoria la categoría a añadir al catálogo
     */
    public void anadirCategoria(Categoria categoria) {
        catalogo.anadirCategoria(categoria);
    }

    /**
     * Devuelve la categoría en la posición indicada dentro del catálogo.
     * 
     * @param number índice de la categoría a obtener
     * @return la categoría correspondiente al índice especificado
     */
    public Categoria obtenerCategoria(int number) {
        return catalogo.getCatalogoGeneral().get(number);
    }
}

