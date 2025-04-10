/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.progavud.taller1.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import edu.progavud.taller1.Model.Producto;
import edu.progavud.taller1.View.VentanaPrincipal;
/**
 * Clase encargada de la gestion y comunicacion 
 * de las clases en el programa.
 * @author Juan Diaz
 */
public class ControlPrincipal implements ActionListener, InterfaceCreacion{
    
    /**
     * Forma de comunicacion con la vista.
     */
    private VentanaPrincipal vistaPrincipal;
    /**
     * Forma en la que se accede y se controlan 
     * los atributos de los usuarios.
     */
    private ControlUsuario usuarioPrincipal;
    /**
     * Forma en la que se modifican los productos.
     */
    private ControlProducto controlProducto;
    /**
     * Forma en la que se gestiona los pedidos.
     */
    private ControlPedido controlPedido;

    public ControlPrincipal(){
        vistaPrincipal = new VentanaPrincipal();
    }

    /**
     * Todos los listeners de la vista.
     */
    public void AsignarOyentes(){

    }

    /**
     * Metodo para anadir un producto generico al pedido.
     */
    @Override
    public void anadirProducto(Producto productoNuevo){
        throw new UnsupportedOperationException("Fuck");
    }

    /**
     * Metodo para agregar un array de productos 
     * genericos al pedido.
     */
    @Override
    public void anadirProducto(ArrayList<Producto> productoNuevo){
        throw new UnsupportedOperationException("Fuck");
    }
    
    /**
     * Metodo que contiene todas las acciones 
     * a realizar de los listeners.
     */
    @Override
    public void actionPerformed(ActionEvent e){
        throw new UnsupportedOperationException("Fuck");
    }

    
}
