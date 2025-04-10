/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.Control;

/**
 *
 * @author ACER NITRO
 */
public class ControlProducto {
    private VentanaPrincipal vistaPrincipal;
    private ArrayList<Producto> arrayCombo3;
    private ArrayList<Producto> arrayCombo4;
    private ArrayList<Producto> arrayCombo5;

    public ControlProducto() {
        this.vistaPrincipal = new VentanaPrincipal(this);
        this.arrayCombo3 = new ArrayList<>();
        this.arrayCombo4 = new ArrayList<>();
        this.arrayCombo5 = new ArrayList<>();
    }

    public VentanaPrincipal getVistaPrincipal() {
        return vistaPrincipal;
    }

    public void setVistaPrincipal(VentanaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
    }

    public ArrayList<Producto> getArrayCombo3() {
        return arrayCombo3;
    }

    public void setArrayCombo3(ArrayList<Producto> arrayCombo3) {
        this.arrayCombo3 = arrayCombo3;
    }

    public ArrayList<Producto> getArrayCombo4() {
        return arrayCombo4;
    }

    public void setArrayCombo4(ArrayList<Producto> arrayCombo4) {
        this.arrayCombo4 = arrayCombo4;
    }

    public ArrayList<Producto> getArrayCombo5() {
        return arrayCombo5;
    }

    public void setArrayCombo5(ArrayList<Producto> arrayCombo5) {
        this.arrayCombo5 = arrayCombo5;
    }
    
}
