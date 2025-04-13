/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Control;

import edu.progavud.taller1.control.ControlPrincipal;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Producto;

/**
 * Clase encargada de gestionar la creación de categorías dentro
 * del sistema. Permite instanciar nuevas categorías a partir de
 * un conjunto de productos y un nombre asignado.
 * 
 * Este controlador forma parte de la lógica de control y se comunica
 * con el controlador principal de la aplicación.
 * 
 * @author  Cristian Bonilla
 */
public class ControlCategoria {

    /** Referencia al controlador principal de la aplicación. */
    private ControlPrincipal controlPrincipal;

    /**
     * Método constructor de la clase.
     * Crea una instancia del controlador de categoría, 
     * enlazada al controlador principal.
     * 
     * @param controlPrincipal instancia principal del controlador
     */
    public ControlCategoria(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }

    /**
     * Crea una nueva categoría a partir de un arreglo de productos
     * y un nombre identificador.
     * 
     * @param categoria         arreglo de productos que conforman la categoría
     * @param nombreCategoria   nombre asignado a la categoría
     * @return una nueva instancia de categoría con los valores especificados
     */
    public Categoria crearCategoria(Producto[] categoria, String nombreCategoria) {
        return new Categoria(categoria, nombreCategoria);
    }
}

