/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Combo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import edu.progavud.taller1.model.Producto;
import edu.progavud.taller1.view.VentanaPrincipal;

/**
 * Clase encargada de la gestion y comunicacion 
 * de las clases en el programa.
 * @author Juan Diaz
 */
public class ControlPrincipal implements InterfaceCreacion{
    
    /**
     * Forma de comunicacion con la vista.
     */
    private VentanaPrincipal vistaPrincipal;
    /**
     * Forma en la que se accede y se controlan 
     * los atributos de los usuarios.
     */
    private ControlUsuario controlUsuario;
    /**
     * Forma en la que se modifican los productos.
     */
    private ControlProducto controlProducto;
    /**
     * Forma en la que se gestiona los pedidos.
     */
    private ControlPedido controlPedido;
    /**
     * Controller que gestiona eventos y oyentes
     */
    private ControlVentana controlVentana;

    public ControlPrincipal(){
        vistaPrincipal = new VentanaPrincipal(this);
        controlUsuario = new ControlUsuario(this, vistaPrincipal);
        controlPedido = new ControlPedido(this, vistaPrincipal);
        controlProducto = new ControlProducto(this, vistaPrincipal);
        controlVentana = new ControlVentana(this, vistaPrincipal);
        
    }

    public void anadirProducto(Producto producto) {
        controlPedido.anadirProducto(producto);
    }
    
    public void añadirCombo(Combo comboNuevo) {
        controlPedido.anadirProducto(comboNuevo);
    }
    
    public void añadirBucket(Bucket bucketNuevo) {
        controlPedido.anadirProducto(bucketNuevo);
    }
    
    

    
}
