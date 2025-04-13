package edu.progavud.taller1.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;

public class PanelPrincipal extends JPanel {

    public JButton jButton1;
    public JButton jButton2;
    public JLabel jLabel1;
    private JPanel jPanel1;

    public PanelPrincipal() {
        initComponents();
        setVisible(false);
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();

        // Panel general
        setBackground(new Color(22, 153, 118));
        setLayout(new BorderLayout());

        // Panel interno con botones y label
        jPanel1.setBackground(new Color(255, 214, 58));

        jButton1.setBackground(new Color(109, 225, 210));
        jButton1.setFont(new Font("Showcard Gothic", Font.PLAIN, 21));
        jButton1.setText("Para llevar");

        jButton2.setBackground(new Color(109, 225, 210));
        jButton2.setFont(new Font("Showcard Gothic", Font.PLAIN, 21));
        jButton2.setText("Para la mesa");
        
        jLabel1.setFont(new Font("Stencil", Font.PLAIN, 32));
        jLabel1.setForeground(new Color(247, 90, 90));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("¡¡BIENVENIDO A TU AUTOSERVICIO!!");

        // Layout interno
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                    .addGap(50)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createSequentialGroup()
                .addGap(30)
                .addComponent(jLabel1)
                .addGap(30)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addGap(30)
        );

        // Agregar jPanel1 al JPanel principal
        add(jPanel1, BorderLayout.CENTER);
    }
    
}
