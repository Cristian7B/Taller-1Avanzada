/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.model.Gaseosa;
import edu.progavud.taller1.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author ACER NITRO
 */
public class ControlProducto {

    private ControlPrincipal controlPrincipal;

    public ControlProducto(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }
    
    public Producto[] crearHamburguesas() {
        Producto[] hamburguesasIniciales = {
            new Producto("Hamburguesa Full", "Hamburguesa doble carne con extra tocineta", "/assets/hamburguesa/img0.png", 12000, 1000, 0),
            new Producto("Hamburguesa Tasty", "Hamburguesa doble carne con queso y cebolla", "/assets/hamburguesa/img1.png", 10000, 800, 0),
            new Producto("Hamburguesa Premium Pollo", "Hamburguesa con doble porción de pollo y queso", "/assets/hamburguesa/img2.png", 13000, 1100, 0),
            new Producto("Hamburguesa Pollo", "Hamburguesa doble porción de pollo, queso y pepinillos", "/assets/hamburguesa/img3.png", 11000, 900, 0),
        };
        
        return hamburguesasIniciales;
    }
    
    public Producto[] crearHelados() {
        Producto[] heladosIniciales = {
            new Producto("McFlurry Oreo", "Helado de vainilla con galleta Oreo", "/assets/helado/MacFlurry#1.png", 6000, 500, 0),
            new Producto("McFlurry Cocosette", "Helado de vainilla con galleta Cocosette", "/assets/helado/MacFlurry#2.png", 6000, 500, 0),
            new Producto("McFlurry MyMs", "Helado de vainilla con chocolates MyMs", "/assets/helado/MacFlurry#3.png", 6000, 500, 0)
        };
        
        return heladosIniciales;
    }
    
    public Producto[] crearParaPicar() {
        Producto[] paraPicarIniciales = {
            new Producto("Muffin Huevo-Tocineta", "Muffin para el desayuno con huevo, tocineta y queso", "/assets/picar/Muffin#1.png", 8000, 600, 0),
            new Producto("Muffin Huevo-Carne", "Muffin para el desayuno con huevo, carne y queso", "/assets/picar/Muffin#2.png", 9000, 700, 0),
            new Producto("Nuggets de Pollo", "10 Nuggets de pollo para cualquier momento del día", "/assets/picar/Nuggets#1.png", 7000, 650, 0),
        };
        
        return paraPicarIniciales;
    }
    
    public Producto[] crearPollo() {
        Producto[] polloIniciales = {
            new Producto("Alitas completas", "10 Alitas de pollo con salsa", "/assets/pollo/Alitas#1.png", 8000, 600, 0),
            new Producto("Nuggets", "15 Piezas de nuggets para disfrutar", "/assets/pollo/Nuggets#3.png", 9000, 700, 0),
            new Producto("Popcorn", "20 Piezas de pollo pequeñas", "/assets/pollo/Popcorn#2.png", 7000, 650, 0),
        };
        
        return polloIniciales;
    }
    
    public Producto[] crearContenidoCombo(String nombreProducto, String descripcionProducto, String rutaImagenProducto,
                                          String nombreGaseosa, String descripcionGaseosa, String tamanoGaseosa,
                                          String nombrePapas, String descripcionPapas) {
        Producto productoBase = new Producto(nombreProducto, descripcionProducto, rutaImagenProducto, 0, 0, 0);
        Gaseosa gaseosa = new Gaseosa(nombreGaseosa, descripcionGaseosa, rutaImagenProducto, 0, 0, 0, tamanoGaseosa);

        Producto papas = new Producto(nombrePapas, descripcionPapas, rutaImagenProducto, 0, 0, 0);

        Producto[] contenidoCombo = {
            productoBase,
            gaseosa,
            papas
        };

        return contenidoCombo;
    }

  
    
}
