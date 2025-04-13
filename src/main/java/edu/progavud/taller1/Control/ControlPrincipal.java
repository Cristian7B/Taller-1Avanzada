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

    /**
     * Método constructor de la clase.
     * Crea un objeto ControlPrincipal.
     */
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
    /**
     * Carga las categorias en el panel de las categorias,
     * posteriormente será utilizado para obtener las 
     * categorias en el control de la ventana.
     */
    public void cargarProductosTienda() {
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearHamburguesas(), "Hamburguesas"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearHelados(), "Helados"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlProducto.crearParaPicar(), "Para Picar"));
        controlCatalogo.anadirCategoria(controlCategoria.crearCategoria(controlCombo.crearCombos(), "Combos"));
    }
    
    /**
     * Obtiene la categoria con el nombre del parametro recibido.
     * @param categoria
     * @return categoriaEncontrada categoria la cual estamos buscando.
     */
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
    
    /**
     * Crea el contenido del combo a partir de sus parámetros.
     * @param nombreProducto        nombre del producto combo.
     * @param descripcionProducto   descripción del combo.
     * @param rutaImagenProducto    ruta relativa de su imagen.
     * @param nombreGaseosa         nombre de su gaseosa.
     * @param descripcionGaseosa    descripcion de la gaseosa.
     * @param tamanoGaseosa         tamaño de la gaseosa.
     * @param nombrePapas           nombre de las papas.
     * @param descripcionPapas      descripción de las papas.
     * @return contenido del combo, como array de productos.
     */
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

    /**
     * Añade un producto.
     * @param producto  producto a añadir.
     */
    public void anadirProducto(Producto producto) {
        controlPedido.anadirProducto(producto);
        controlPedido.actualizarPuntosYPrecio();
    }
    
    /**
     * Añade un combo.
     * @param comboNuevo    combo a añadir.
     */
    public void añadirCombo(Combo comboNuevo) {
        controlPedido.anadirProducto(comboNuevo);
        controlPedido.actualizarPuntosYPrecio();
    }
    
    /**
     * Añade un bucket.
     * @param bucketNuevo   bucket a añadir. 
     */
    public void añadirBucket(Bucket bucketNuevo) {
        controlPedido.anadirProducto(bucketNuevo);
        controlPedido.actualizarPuntosYPrecio();
    }
    public void obtenerProducto(Producto producto){
        
    }
    
}
