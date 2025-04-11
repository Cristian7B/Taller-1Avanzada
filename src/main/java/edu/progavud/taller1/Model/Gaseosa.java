/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

/**
 *
 * @author crisc
 */
public class Gaseosa extends Producto {
    private String tamano;
    
    public Gaseosa(String nombre, String descripcion, String rutaImagenProducto, int precio, int valorPuntos, int cantidad, String tamano) {
        super(nombre, descripcion, rutaImagenProducto, precio, valorPuntos, cantidad);
        this.tamano = tamano;
    }
    
    public void cambiarPrecio() {
        if(tamano == "Pequeño") {
           super.setPrecio(3000);
        } else if (tamano == "Mediano") {
           super.setPrecio(6000);
        } else {
           super.setPrecio(9000);
        }
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTamano() {
        return tamano;
    }
}
