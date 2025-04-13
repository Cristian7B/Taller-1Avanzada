package edu.progavud.taller1.view;

import edu.progavud.taller1.View.PanelMantenimiento;
import edu.progavud.taller1.View.PanelOpciones;
import edu.progavud.taller1.View.PanelPrincipal;
import edu.progavud.taller1.control.ControlVentana;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private ControlVentana controlVentana;

    // Tus paneles existentes
    private edu.progavud.taller1.View.PanelPrincipal panelPrincipal;     // Lateral
    private edu.progavud.taller1.View.PanelMantenimiento panelMantenimiento;
    private edu.progavud.taller1.View.PanelOpciones panelOpciones;

    // Contenedor dinámico
    private JPanel panelCentral;

    // Menú
    private JMenuBar jMenuBar1;
    private JMenu jMenu1;
    public JMenuItem jMenuItem1;

    public VentanaPrincipal(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        // Instancias
        panelPrincipal     = new edu.progavud.taller1.View.PanelPrincipal();
        panelMantenimiento = new edu.progavud.taller1.View.PanelMantenimiento();
        panelOpciones      = new edu.progavud.taller1.View.PanelOpciones();

        panelCentral = new JPanel(new BorderLayout());

        jMenuBar1 = new JMenuBar();
        jMenu1    = new JMenu("Opciones");
        jMenuItem1= new JMenuItem("Salir");

        // Configuración del frame
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Mi Aplicación MVC");
        setPreferredSize(new Dimension(1200, 800));

        // Barra de menú
        jMenu1.add(jMenuItem1);
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);

        // El panelPrincipal va en WEST (lateral estático)
        panelPrincipal.setPreferredSize(new Dimension(300, 0));
        add(panelPrincipal, BorderLayout.WEST);

        // Al inicio mostramos el panelPrincipal como contenido central (o podrías mostrar otro)
        panelCentral.add(new JLabel("Selecciona una opción…", SwingConstants.CENTER), BorderLayout.CENTER);
        add(panelCentral, BorderLayout.CENTER);

        pack();

    }

    /**  
     * Reemplaza el contenido del panelCentral  
     */
    public void cambiarPanel(JPanel nuevo) {
        panelCentral.removeAll();
        panelCentral.add(nuevo, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }
    
    public void anuncio(String aviso, String boton){
        JOptionPane.showMessageDialog(null, aviso, boton, JOptionPane.INFORMATION_MESSAGE);
    }
    public ControlVentana getControlVentana() {
        return controlVentana;
    }

    public void setControlVentana(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
    }

    public PanelPrincipal getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public PanelMantenimiento getPanelMantenimiento() {
        return panelMantenimiento;
    }

    public void setPanelMantenimiento(PanelMantenimiento panelMantenimiento) {
        this.panelMantenimiento = panelMantenimiento;
    }

    public PanelOpciones getPanelOpciones() {
        return panelOpciones;
    }

    public void setPanelOpciones(PanelOpciones panelOpciones) {
        this.panelOpciones = panelOpciones;
    }

    public JPanel getPanelCentral() {
        return panelCentral;
    }

    public void setPanelCentral(JPanel panelCentral) {
        this.panelCentral = panelCentral;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }
    
}
