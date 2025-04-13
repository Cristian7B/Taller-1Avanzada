package edu.progavud.taller1.control;

import edu.progavud.taller1.View.Ventana;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Combo;
import edu.progavud.taller1.model.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

/**
 * Controlador de la única ventana principal de la aplicación. 
 * Se encarga de delegar la visualización de los distintos paneles sobre un único JFrame,
 * así como de gestionar la inactividad mediante un temporizador Swing.
 * 
 * @author Cristian Bonilla
 */
public class ControlVentana implements ActionListener {
    
    /** 
     * Controlador principal de la aplicación, desde el cual se obtienen datos del modelo. 
     */
    private ControlPrincipal controlPrincipal;
    
    /** 
     * Vista principal donde se muestran todos los paneles. 
     */
    private Ventana vistaPrincipal;
    Timer timer;

    /**
     * Crea un nuevo controlador de ventana.
     * Inicializa la vista, asigna los oyentes de los botones y prepara un temporizador inactivo.
     * 
     * @param controlPrincipal instancia del controlPrincipal que provee acceso al modelo.
     */
    public ControlVentana(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        vistaPrincipal = new Ventana(this);
        asignarOyentes();
        timer = new javax.swing.Timer(0, null);
    }
    
    /**
     * Maneja los eventos de acción disparados por los botones de la interfaz.
     * Según el comando de acción, cambia de panel o realiza otras acciones
     * 
     * @param e evento de acción que contiene el comando String a procesar.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "LLEVAR":
                timer.stop();
                vistaPrincipal.mostrarMantenimiento();
                timer = usarTimer();
                break;

            case "MESA":
                timer.stop();
                vistaPrincipal.mostrarCategorias();
                vistaPrincipal.getPanelBoton().setVisible(true);
                timer = usarTimer();
                controlPrincipal.crearPedido();
                break;

            case "MENU1":
                timer.stop();
                vistaPrincipal.mostrarInicio();
                timer = usarTimer();
                break;

            case "SALIR":
                vistaPrincipal.anuncio("Hasta pronto", "Salir");
                System.exit(0);
                break;

            case "COMBO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                Categoria categoriaIterar = controlPrincipal.obtenerCategoria("Combos");
                
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarProductosCombo((Combo) categoriaIterar.getCategoria()[i], i);
                    vistaPrincipal.getPanelProductos().botonesCombo.get(i).setActionCommand("Combo" + i);
                    vistaPrincipal.getPanelProductos().botonesCombo.get(i).addActionListener(this);
                    
                    vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(i).addActionListener(this);
                    vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(i).setActionCommand("ComboCheckChips"+i);
                    vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(i).addActionListener(this);
                    vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(i).setActionCommand("ComboCheckQueso"+i);
                    vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(i).addActionListener(this);
                    vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(i).setActionCommand("ComboCheckGaseosa"+i);
                }
                break;

            case "BUCKET":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.mostrarProductos();
                break;

            case "HAMBURGUESA":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Hamburguesa");
                
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarHamburguesas(categoriaIterar.getCategoria()[i], i);
                    vistaPrincipal.getPanelProductos().botonesHamburguesa.get(i).setActionCommand("Hamburguesa" + i);
                    vistaPrincipal.getPanelProductos().botonesHamburguesa.get(i).addActionListener(this);
                }
                break;

            case "POLLO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Pollos");
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarPollos(categoriaIterar.getCategoria()[i], i);
                    vistaPrincipal.getPanelProductos().botonesPollo.get(i).setActionCommand("Pollo" + i);
                    vistaPrincipal.getPanelProductos().botonesPollo.get(i).addActionListener(this);
                }
                break;

            case "HELADO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Helados");
                
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarHelados(categoriaIterar.getCategoria()[i], i);
                    vistaPrincipal.getPanelProductos().botonesHelado.get(i).setActionCommand("Helados" + i);
                    vistaPrincipal.getPanelProductos().botonesHelado.get(i).addActionListener(this);
                }
                
                break;

            case "PICAR":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Para Picar");
                
                vistaPrincipal.mostrarProductos();
                for(int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos().cargarPicar(categoriaIterar.getCategoria()[i], i);
                    vistaPrincipal.getPanelProductos().botonesPicar.get(i).setActionCommand("Picar" + i);
                    vistaPrincipal.getPanelProductos().botonesPicar.get(i).addActionListener(this);
                }
                
                break;

            case "ATRAS":
                timer.stop();
                timer = usarTimer();
                if (vistaPrincipal.getPanelProductos().isVisible()) {
                    vistaPrincipal.mostrarCategorias();
                } else if (vistaPrincipal.getPanelOpciones().isVisible() ||
                           vistaPrincipal.getPanelMantenimiento().isVisible()) {
                    vistaPrincipal.mostrarInicio();
                    vistaPrincipal.getPanelBoton().setVisible(false);
                    controlPrincipal.crearPedido();
                    vistaPrincipal.getPanelPedido().limpiarPedido();
                }
                
                break;
            case "Hamburguesa0":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[0]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[0].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Hamburguesa1":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[1]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[1].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Hamburguesa2":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[2]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[2].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Hamburguesa3":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[3]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Hamburguesa").getCategoria()[3].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;

            case "Combo0":
                if(vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(0).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Chips ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(0).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Queso ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(0).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Gaseosa");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).cambiarPrecio();
                }
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Combos").getCategoria()[0].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                
                break;
            case "Combo1":
                if(vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(1).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Chips ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(1).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Queso ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(1).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Gaseosa");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]).cambiarPrecio();
                }
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Combos").getCategoria()[1]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Combos").getCategoria()[1].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Combo2":
                if(vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(2).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Chips ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(2).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Queso ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(2).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Gaseosa");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]).cambiarPrecio();
                }
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Combos").getCategoria()[2]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Combos").getCategoria()[2].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Combo3":
                if(vistaPrincipal.getPanelProductos().checkboxesExtraChips.get(3).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Chips ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesExtraQueso.get(3).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Queso ");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).cambiarPrecio();
                }
                if(vistaPrincipal.getPanelProductos().checkboxesGaseosaGrande.get(3).isSelected()) {
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).setAdiciones(((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[0]).getAdiciones() + "Gaseosa");
                    ((Combo) controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]).cambiarPrecio();
                }
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Combos").getCategoria()[3]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Combos").getCategoria()[3].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
                
            case "Helados0":                
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Helados").getCategoria()[0]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Helados").getCategoria()[0].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Helados1":                
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Helados").getCategoria()[1]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Helados").getCategoria()[1].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Helados2":                
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Helados").getCategoria()[2]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Helados").getCategoria()[2].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;

            case "Picar0":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[0]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[0].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Picar1":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[1]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[1].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Picar2":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[2]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Para Picar").getCategoria()[2].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Pollo0":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[0]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[0].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Pollo1":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[1]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[1].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "Pollo2":
                controlPrincipal.anadirProducto(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[2]);
                vistaPrincipal.getPanelPedido().anadirJLabel(controlPrincipal.obtenerCategoria("Pollos").getCategoria()[2].getNombre());
                vistaPrincipal.getPanelPedido().setSubTotal("Total: $" + controlPrincipal.retonarPrecioPedido());
                break;
            case "PAGO":
                timer.stop();
                for (Producto p: controlPrincipal.obtenerProductosPedido()){
                    controlPrincipal.anadirProductoFactura(p);
                }
                vistaPrincipal.mostrarFactura();
                timer = usarTimer();
                break;
            case "TARJETA":
                break;
            case "EFECTIVO":
                break;
                
        }
    }
    
    public void asignarOyentes() {
        vistaPrincipal.botonParaLlevar.setActionCommand("LLEVAR");
        vistaPrincipal.botonParaLlevar.addActionListener(this);
        vistaPrincipal.botonParaLaMesa.setActionCommand("MESA");
        vistaPrincipal.botonParaLaMesa.addActionListener(this);

        vistaPrincipal.getPanelMantenimiento().jButton1.setActionCommand("MENU1");
        vistaPrincipal.getPanelMantenimiento().jButton1.addActionListener(this);
        vistaPrincipal.getPanelMantenimiento().jButton2.setActionCommand("SALIR");
        vistaPrincipal.getPanelMantenimiento().jButton2.addActionListener(this);

        vistaPrincipal.getPanelOpciones().botonBucket.setActionCommand("BUCKET");
        vistaPrincipal.getPanelOpciones().botonBucket.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonCombo.setActionCommand("COMBO");
        vistaPrincipal.getPanelOpciones().botonCombo.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonHamburguesa.setActionCommand("HAMBURGUESA");
        vistaPrincipal.getPanelOpciones().botonHamburguesa.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonPollo.setActionCommand("POLLO");
        vistaPrincipal.getPanelOpciones().botonPollo.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonHelado.setActionCommand("HELADO");
        vistaPrincipal.getPanelOpciones().botonHelado.addActionListener(this);
        vistaPrincipal.getPanelOpciones().botonPicar.setActionCommand("PICAR");
        vistaPrincipal.getPanelOpciones().botonPicar.addActionListener(this);

        vistaPrincipal.atras.setActionCommand("ATRAS");
        vistaPrincipal.atras.addActionListener(this);
        
        vistaPrincipal.getPanelPedido().botonPago.setActionCommand("PAGO");
        vistaPrincipal.getPanelPedido().botonPago.addActionListener(this);
        
        vistaPrincipal.getPanelFactura().botonEfectivo.setActionCommand("EFECTIVO");
        vistaPrincipal.getPanelFactura().botonEfectivo.addActionListener(this);
        vistaPrincipal.getPanelFactura().botonTarjeta.setActionCommand("TARJETA");
        vistaPrincipal.getPanelFactura().botonTarjeta.addActionListener(this);
    }
    
    /**
     * Crea y arranca un Timer Swing que, tras el tiempo de inactividad
     * especificado (1 minuto), muestra un anuncio de retorno al inicio y
     * restablece el panel principal.
     * 
     * @return el timer configurado y en marcha
     */
    public Timer usarTimer(){
        Timer timer = new Timer(60000, e -> {
            vistaPrincipal.anuncio("No se usó durante el tiempo establecido", "INICIO");
            vistaPrincipal.getPanelBoton().setVisible(false);
            vistaPrincipal.getPanelMantenimiento().setVisible(false);
            vistaPrincipal.getPanelOpciones().setVisible(false);
            vistaPrincipal.getPanelProductos().setVisible(false);
            vistaPrincipal.getPanelPrincipal().setVisible(true);
        });
        timer.setRepeats(false);
        timer.start();
        return timer;
    }

    public ControlPrincipal getControlPrincipal() {
        return controlPrincipal;
    }

    public void setControlPrincipal(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
    }

    public Ventana getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(Ventana vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
    
    
}