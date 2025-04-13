/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.progavud.taller1.control;

import edu.progavud.taller1.Control.ControlCatalogo;
import edu.progavud.taller1.Control.ControlCategoria;
import edu.progavud.taller1.model.Bucket;
import edu.progavud.taller1.model.Catalogo;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Producto;
import java.util.ArrayList;

/**
 * Clase encargada de la gestion y comunicacion 
 * de las clases en el programa.
 * @author Juan Diaz
 */
public class ControlPrincipal implements InterfaceCreacion{
    
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
    /**
     * Controller que gestiona el catalogo de productos de la tienda
     */
    private ControlCatalogo controlCatalogo;
    /**
     * Controller que gestiona la categoria de un grupo de productos
     */
    private ControlCategoria controlCategoria;
    /**
     * Controller que gestiona la creación y modificación de combos
     */
    private ControlCombo controlCombo;

    public ControlPrincipal(){
        controlUsuario = new ControlUsuario(this);
        controlPedido = new ControlPedido(this);
        controlProducto = new ControlProducto(this);
        controlVentana = new ControlVentana(this);  
        controlCatalogo = new ControlCatalogo(this);
        controlCategoria = new ControlCategoria(this);
        controlCombo = new ControlCombo(this);
        cargarProductosTienda();
    }
    
    public void cargarProductosTienda() {
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearHamburguesas(), "Hamburguesas"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearHelados(), "Helados"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearParaPicar(), "Para Picar"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlCombo.crearCombos(), "Combos"));
    }
    
    public Categoria obtenerCategoria(String categoria) {
        Categoria categoriaEncontrada = null;
        
        switch (categoria){
            case "Hamburguesa": 
                categoriaEncontrada = controlCatalogo.obtenerCategoria(0);
                break;
            case "Helados":
                categoriaEncontrada = controlCatalogo.obtenerCategoria(1);
                break;
            case "Para Picar":
                categoriaEncontrada = controlCatalogo.obtenerCategoria(2);
                break;
            case "Combos":
                categoriaEncontrada = controlCatalogo.obtenerCategoria(3);
                break;
        }
        
        return categoriaEncontrada;
    }
    
    public Producto[] crearContenidoComboRedirect(String nombreProducto, String descripcionProducto, 
                                                String rutaImagenProducto, String nombreGaseosa, 
                                                String descripcionGaseosa, String tamanoGaseosa,
                                                String nombrePapas, String descripcionPapas) {
        return controlProducto.crearContenidoCombo(nombreProducto, descripcionProducto, 
                                                rutaImagenProducto, nombreGaseosa, 
                                                descripcionGaseosa, tamanoGaseosa,
                                                nombrePapas, descripcionPapas);
    }
    
    
    public void crearPedido() {
        controlPedido.crearPedido();
    }
    
    public ArrayList<Producto> obtenerProductosPedido() {
        return controlPedido.productosPedido();
    }
    public void anadirProducto(Producto producto) {
        controlPedido.anadirProducto(producto);
        controlPedido.actualizarPuntosYPrecio();
    }
    
    public void añadirCombo(Combo comboNuevo) {
        controlPedido.anadirProducto(comboNuevo);
        controlPedido.actualizarPuntosYPrecio();
    }
    
    public void añadirBucket(Bucket bucketNuevo) {
        controlPedido.anadirProducto(bucketNuevo);
        controlPedido.actualizarPuntosYPrecio();
    }
    public void obtenerProducto(Producto producto){
        
    }
    
}
