package edu.progavud.taller1.control;

import edu.progavud.taller1.View.Ventana;
import edu.progavud.taller1.model.Categoria;
import edu.progavud.taller1.model.Combo;
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
    
    /** Temporizador Swing para detectar inactividad y volver al panel de inicio. */
    private Timer timer;

    /**
     * Crea un nuevo controlador de ventana.
     * Inicializa la vista, asigna los oyentes de los botones y prepara un temporizador inactivo.
     * 
     * @param controlPrincipal instancia del controlPrincipal que provee acceso al modelo.
     */
    public ControlVentana(ControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.vistaPrincipal = new Ventana(this);
        asignarOyentes();
        this.timer = new Timer(0, null);
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
                for (int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos()
                                 .cargarProductosCombo((Combo) categoriaIterar.getCategoria()[i], i);
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
                for (int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos()
                                 .cargarHamburguesas(categoriaIterar.getCategoria()[i], i);
                }
                break;

            case "POLLO":
                timer.stop();
                vistaPrincipal.mostrarProductos();
                timer = usarTimer();
                break;

            case "HELADO":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Helados");
                vistaPrincipal.mostrarProductos();
                for (int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos()
                                 .cargarHelados(categoriaIterar.getCategoria()[i], i);
                }
                break;

            case "PICAR":
                timer.stop();
                timer = usarTimer();
                vistaPrincipal.getPanelProductos().resetear();
                categoriaIterar = controlPrincipal.obtenerCategoria("Para Picar");
                vistaPrincipal.mostrarProductos();
                for (int i = 0; i < categoriaIterar.getCategoria().length; i++) {
                    vistaPrincipal.getPanelProductos()
                                 .cargarPicar(categoriaIterar.getCategoria()[i], i);
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
                }
                break;
        }
    }
    
    /**
     * Asigna los oyentes de acción a todos los botones de la vista principal,
     * definiendo su comando de acción correspondiente.
     */
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
    }
    
    /**
     * Crea y arranca un Timer Swing que, tras el tiempo de inactividad
     * especificado (1 minuto), muestra un anuncio de retorno al inicio y
     * restablece el panel principal.
     * 
     * @return el timer configurado y en marcha
     */
    public Timer usarTimer() {
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
}
