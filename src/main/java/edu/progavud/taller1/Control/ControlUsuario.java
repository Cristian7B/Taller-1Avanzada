/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Usuario;

/**
 * Clase encargada de gestionar la información y acciones relacionadas
 * con el usuario actual de la aplicación.
 * 
 * Se encarga de crear un usuario por defecto y permite modificar su cantidad de puntos.
 * 
 * @author  Nicolas Velasco
 */
public class ControlUsuario {
    
    /** Usuario actual en la sesión. */
    private Usuario usuario;
    
    /** Referencia al controlador principal. */
    private ControlPrincipal controlPrincipal;
    
    /**
     * Constructor que crea un usuario por defecto con nombre, saldo y
     * cantidad de puntos.
     * 
     * @param controlPrincipal controlador principal de la aplicación
     */
    public ControlUsuario(ControlPrincipal controlPrincipal) {
        usuario = new Usuario("Cristian Bonilla", 100000, 20, true);
        this.controlPrincipal = controlPrincipal;
    }

    /**
     * Suma una cantidad de puntos al usuario actual.
     * 
     * @param puntosASumar cantidad de puntos a agregar
     */
    public void cambiarPuntos(int puntosASumar) {
        usuario.setCantidadPuntos(usuario.getCantidadPuntos() + puntosASumar);
    }
}

