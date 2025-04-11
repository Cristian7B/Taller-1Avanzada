/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Usuario;

/**
 *
 * @author Nicolas Velasco 
 */
public class ControlUsuario {
    private Usuario usuario;
    private ControlPrincipal controlPrincipal;
    
    public ControlUsuario(ControlPrincipal controlPrincipal) {
        usuario = new Usuario("Cristian Bonilla", 100000, 20, true);
        this.controlPrincipal = controlPrincipal;
    }
    
    public void cambiarPuntos(int puntosASumar) {
        usuario.setCantidadPuntos(usuario.getCantidadPuntos() + puntosASumar);
    }

    
}
