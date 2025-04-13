/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.progavud.taller1.View;

import edu.progavud.taller1.control.ControlPrincipal;
import edu.progavud.taller1.control.ControlVentana;

/**
 * Esta clase
 * @author Nicolas Velasco
 */
public class VistaMantenimiento extends javax.swing.JFrame {
    private ControlVentana controlVentana;
    public VistaMantenimiento(ControlVentana controlVentana) {
        this.controlVentana = controlVentana;
        setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(236, 133, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 233, 220));
        jLabel1.setText("¡¡LO SENTIMOS!! ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, 90));

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 233, 220));
        jLabel2.setText("Esta página esta en desarrollo...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 360, -1));

        jButton1.setBackground(new java.awt.Color(35, 206, 61));
        jButton1.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 233, 220));
        jButton1.setText("MENU");
        jButton1.setName("botonMenu"); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 331, 216, 105));

        jButton2.setBackground(new java.awt.Color(231, 43, 43));
        jButton2.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 233, 220));
        jButton2.setText("SALIR");
        jButton2.setName("botonSalir"); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 331, 225, 105));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hamburguesa/img0.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 300, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
