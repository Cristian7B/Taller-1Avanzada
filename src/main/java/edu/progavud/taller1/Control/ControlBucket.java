/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Producto;
import edu.progavud.taller1.view.VentanaPrincipal;

/**
 *
 * @author crisc
 */
public class ControlBucket {
    private ControlPrincipal controlPrincipal;
    private VentanaPrincipal vistaPrincipal;
    private Bucket bucketActual;
    
    public ControlBucket(VentanaPrincipal vistPrincipal, ControlPrincipal controlPrincipal) {
        this.vistaPrincipal = vistPrincipal;
        this.controlPrincipal = controlPrincipal;
    }
    
    public void crearBucket() {
        Bucket bucketNuevo = new Bucket("Bucket", "Bucket de productos del restaurante", "", 0);
        bucketActual = bucketNuevo;
        //Agregar funcion a la ventana principal para personalizar
    }
    
    public void anadirProducto(Producto producto) {
        bucketActual.agregarProducto(producto);
    }
    
    public void eliminarProducto(Producto producto) {
        bucketActual.removerProducto(producto);        
    }
    
    public void eliminarBucket() {
        bucketActual = null;
    }
}
