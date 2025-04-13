/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * Esta clase representa a los combos en el programa
 * 
 * @author Cristian Bonilla
 */

public class Combo extends Producto {
    /**
     * array de los productos dentro de un combo
     */
    private Producto[] productosIncluidos;
    /**
     * adiciones que el usuario desee
     */
    private String adiciones;

    /**
     * Método constructor de la clase
     * 
     * @param nombre                nombre del combo
     * @param descripcion           descripción del combo
     * @param rutaImagenProducto    ruta relativa de la imagen del combo
     * @param precio                precio del combo
     * @param valorPuntos           valor del combo dado en puntos
     * @param cantidad              cantidad de combos que desee el usuario
     * @param productosIncluidos    productos incluidos dentro del combo
     * @param adiciones             adiciones del combo
     */
    public Combo(
            String nombre, 
            String descripcion, 
            String rutaImagenProducto, 
            int precio,
            int valorPuntos, 
            int cantidad, 
            Producto[] productosIncluidos,
            String adiciones){
        super(nombre, descripcion, rutaImagenProducto, precio, valorPuntos, cantidad);
        this.productosIncluidos = productosIncluidos;
        this.adiciones = adiciones;
    }

    /**
     * Obtiene el arreglo de productos incluidos en el combo.
     * 
     * @return Un arreglo de objetos que hacen parte del combo.
     */
   public Producto[] getProductosIncluidos() {
       return productosIncluidos;
   }

    /**
     * Establece el arreglo de productos incluidos en el combo.
     * 
     * @param productosIncluidos Un arreglo de objetos que se asignarán al combo.
     */
    public void setProductosIncluidos(Producto[] productosIncluidos) {
       this.productosIncluidos = productosIncluidos;
    }

    /**
     * Obtiene las adiciones seleccionadas para el combo.
     * 
     * @return Una cadena de texto con las adiciones separadas por espacios.
     */
    public String getAdiciones() {
       return adiciones;
    }

   /**
    * Establece las adiciones del combo.
    * 
    * @param adiciones Una cadena de texto que representa las adiciones seleccionadas.
    */
   public void setAdiciones(String adiciones) {
       this.adiciones = adiciones;
   }

   /**
    * Calcula y actualiza el precio total del combo con base en los productos incluidos y las adiciones.
    * El precio se calcula como la suma del precio del primer y segundo producto más un valor adicional
    * de por cada adición presente en la cadena de adiciones.
    */
    public void cambiarPrecio() {
        super.setPrecio(
            this.productosIncluidos[0].getPrecio() +
            adiciones.split(" ").length * 2000 + 
            this.productosIncluidos[1].getPrecio()
        );
    }

    
}
