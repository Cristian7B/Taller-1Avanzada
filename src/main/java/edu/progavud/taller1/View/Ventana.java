package edu.progavud.taller1.View;
import edu.progavud.taller1.control.ControlVentana;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author crisc
 */
public class Ventana extends javax.swing.JFrame {

    private ControlVentana controlVentana;
    private PanelMantenimiento panelMantenimiento;
    private PanelOpciones panelOpciones;
    private PanelProductos panelProductos;
    private PanelPedido panelPedido;
    private JPanel panelPrincipal;
    private JPanel panelContenido;
    private PanelFactura panelFactura;
    public JButton atras;
    private JPanel panelBoton;

    public PanelPedido getPanelPedido() {
        return panelPedido;
    }

    public void setPanelPedido(PanelPedido panelPedido) {
        this.panelPedido = panelPedido;
    }
    private static final String CARD_FACTURA = "factura";
    private static final String CARD_INICIO = "inicio";
    private static final String CARD_MANTENIMIENTO = "mantenimiento";
    private static final String CARD_OPCIONES = "opciones";
    private static final String CARD_PRODUCTOS = "productos";

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
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

    public JPanel getjPanel2() {
        return jPanel2;
    }
    
    public void anuncio(String aviso, String boton){
        JOptionPane.showMessageDialog(null, aviso, boton, JOptionPane.INFORMATION_MESSAGE);
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }
    
    public PanelProductos getPanelProductos() {
        return panelProductos;
    }

    public void setPanelProductos(PanelProductos panelProductos) {
        this.panelProductos = panelProductos;
    }

    public JButton getBotonParaLaMesa() {
        return botonParaLaMesa;
    }

    public void setBotonParaLaMesa(JButton botonParaLaMesa) {
        this.botonParaLaMesa = botonParaLaMesa;
    }

    public JButton getBotonParaLlevar() {
        return botonParaLlevar;
    }

    public void setBotonParaLlevar(JButton botonParaLlevar) {
        this.botonParaLlevar = botonParaLlevar;
    }
    
    public void mostrarCategorias() {
        CardLayout cl = (CardLayout)(panelContenido.getLayout());
        cl.show(panelContenido, CARD_OPCIONES);
    }
    
    public void mostrarProductos() {
        CardLayout cl = (CardLayout)(panelContenido.getLayout());
        cl.show(panelContenido, CARD_PRODUCTOS);
    }
    
    public void mostrarInicio() {
        CardLayout cl = (CardLayout)(panelContenido.getLayout());
        cl.show(panelContenido, CARD_INICIO);
    }
    
    public void mostrarMantenimiento() {
        CardLayout cl = (CardLayout)(panelContenido.getLayout());
        cl.show(panelContenido, CARD_MANTENIMIENTO);
    }

    public JPanel getPanelBoton() {
        return panelBoton;
    }

    public void setPanelBoton(JPanel panelBoton) {
        this.panelBoton = panelBoton;
    }

    public ControlVentana getControlVentana() {
        return controlVentana;
    }

    public void setControlVentana(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
    }

    public JPanel getPanelContenido() {
        return panelContenido;
    }

    public void setPanelContenido(JPanel panelContenido) {
        this.panelContenido = panelContenido;
    }

    public PanelFactura getPanelFactura() {
        return panelFactura;
    }

    public void setPanelFactura(PanelFactura panelFactura) {
        this.panelFactura = panelFactura;
    }

    public JButton getAtras() {
        return atras;
    }

    public void setAtras(JButton atras) {
        this.atras = atras;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }
    
    
    
    /**
     * Creates new form Ventana
     */
    public Ventana(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
        initComponents();
        setBackground(new Color(0xFA7921));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("ByteBurgers");
        setPreferredSize(new java.awt.Dimension(900, 600));
        
        panelPrincipal = new JPanel(new BorderLayout());
        
        atras = new JButton("Atrás");
        atras.setBackground(new Color(0x387780));
        atras.setForeground(new Color(241, 241, 233));
        atras.setFont(new java.awt.Font("SansSerif", 1, 14));
        atras.setPreferredSize(new java.awt.Dimension(100, 30));
        atras.setBorder(null);
        atras.setMargin(new Insets(10, 20, 10, 20));
        atras.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panelPedido = new PanelPedido();
        
        panelBoton = new JPanel();
        panelBoton.setBackground(new Color(255, 87, 20));
        panelBoton.setLayout(new BoxLayout(panelBoton, BoxLayout.Y_AXIS));
        panelBoton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelPedido.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelBoton.add(atras);
        panelBoton.add(panelPedido);
        
        
        panelContenido = new JPanel(new CardLayout());
        
        
        crearPanelInicio();
        
        
        panelMantenimiento = new PanelMantenimiento();
        
        panelOpciones = new PanelOpciones();
        panelProductos = new PanelProductos();
        
        
        panelContenido.add(jPanel1, CARD_INICIO);
        panelContenido.add(panelMantenimiento, CARD_MANTENIMIENTO);
        panelContenido.add(panelOpciones, CARD_OPCIONES);
        panelContenido.add(panelProductos, CARD_PRODUCTOS);
        
        
        panelBoton.setVisible(false);
        panelPrincipal.add(panelBoton, BorderLayout.WEST);
        panelPrincipal.add(panelContenido, BorderLayout.CENTER);
        
        panelFactura = new PanelFactura();
        panelFactura.setBackground(new Color(255, 87, 20));
        panelContenido.add(panelFactura, CARD_FACTURA);

        
        getContentPane().add(panelPrincipal);
        
       
        mostrarInicio();
        
        pack();
    }
    public void mostrarFactura() {
        CardLayout cl = (CardLayout)(panelContenido.getLayout());
        cl.show(panelContenido, CARD_FACTURA);
    }

    private void crearPanelInicio() {
      
        jPanel1 = new JPanel();
        jPanel1.setBackground(new Color(255, 87, 20));
        jPanel1.setLayout(new BorderLayout());
        
        
        jPanel2 = new JPanel();
        jPanel2.setBackground(new Color(255, 87, 20));
        jPanel2.setBorder(new MatteBorder(0, 0, 2, 0, new Color(0xF1F1E9)));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 60));
        jPanel2.setLayout(new BorderLayout());
        
        
        JPanel logoPanel = new JPanel(new BorderLayout());
        logoPanel.setBackground(new Color(255, 87, 20));
        logoPanel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 0));
        
        jLabel7 = new JLabel(new ImageIcon(getClass().getResource("/assets/icons/Icon.png")));
        jLabel8 = new JLabel("ByteBurgers");
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        jLabel8.setForeground(new Color(241, 241, 233));
        
        logoPanel.add(jLabel7, BorderLayout.WEST);
        logoPanel.add(jLabel8, BorderLayout.CENTER);
        
        jPanel2.add(logoPanel, BorderLayout.WEST);
        
        // Separador
        jSeparator1 = new JSeparator();
        jPanel2.add(jSeparator1, BorderLayout.SOUTH);
        
        // Panel de contenido principal del inicio
        JPanel panelContenidoInicio = new JPanel();
        panelContenidoInicio.setBackground(new Color(255, 87, 20));
        panelContenidoInicio.setLayout(new BoxLayout(panelContenidoInicio, BoxLayout.Y_AXIS));
        panelContenidoInicio.setBorder(BorderFactory.createEmptyBorder(50, 0, 50, 0));
        
        // Componentes de la pantalla de inicio
        jLabel3 = new JLabel("¡Bienvenido!");
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 80));
        jLabel3.setForeground(new Color(241, 241, 233));
        jLabel3.setAlignmentX(CENTER_ALIGNMENT);
        
        jLabel4 = new JLabel("Escoge como quieres ordenar");
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14));
        jLabel4.setForeground(new Color(241, 241, 233));
        jLabel4.setAlignmentX(CENTER_ALIGNMENT);
        
        // Panel para botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(255, 87, 20));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        
        botonParaLlevar = new JButton("Para llevar");
        botonParaLlevar.setBackground(new Color(125, 128, 218));
        botonParaLlevar.setFont(new java.awt.Font("SansSerif", 1, 18));
        botonParaLlevar.setForeground(new Color(241, 241, 233));
        botonParaLlevar.setBorder(null);
        botonParaLlevar.setPreferredSize(new java.awt.Dimension(123, 41));
        
        botonParaLaMesa = new JButton("Para la Mesa");
        botonParaLaMesa.setBackground(new Color(125, 128, 218));
        botonParaLaMesa.setFont(new java.awt.Font("SansSerif", 1, 18));
        botonParaLaMesa.setForeground(new Color(241, 241, 233));
        botonParaLaMesa.setBorder(null);
        botonParaLaMesa.setPreferredSize(new java.awt.Dimension(123, 41));
        
        panelBotones.add(botonParaLlevar);
        panelBotones.add(Box.createHorizontalStrut(38)); // Espacio entre botones
        panelBotones.add(botonParaLaMesa);
        
        // Añadir componentes al panel de contenido de inicio
        panelContenidoInicio.add(Box.createVerticalGlue());
        panelContenidoInicio.add(jLabel3);
        panelContenidoInicio.add(Box.createVerticalStrut(10));
        panelContenidoInicio.add(jLabel4);
        panelContenidoInicio.add(Box.createVerticalStrut(20));
        panelContenidoInicio.add(panelBotones);
        panelContenidoInicio.add(Box.createVerticalGlue());
        
        // Variables adicionales (no usadas pero declaradas en tu código)
        jLabel1 = new JLabel("jLabel1");
        jLabel2 = new JLabel("jLabel2");
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        
        // Añadir componentes al panel de inicio
        panelPrincipal.add(jPanel2, BorderLayout.NORTH);
        jPanel1.add(panelContenidoInicio, BorderLayout.CENTER);
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton botonParaLaMesa;
    public javax.swing.JButton botonParaLlevar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration                   
}