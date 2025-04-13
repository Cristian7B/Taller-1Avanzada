package edu.progavud.taller1.View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class PanelPagoTarjeta extends JPanel {

    public PanelPagoTarjeta() {
        setBackground(new Color(255, 255, 255)); 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel mensaje = new JLabel("Pagando con tarjeta");
        mensaje.setAlignmentX(CENTER_ALIGNMENT);
        mensaje.setFont(new Font("SansSerif", Font.BOLD, 24));
        mensaje.setForeground(new Color(50, 50, 50));

        add(mensaje);
    }
}
