/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

/**
 *
 * @author ACER NITRO
 */
public class Usuario {
    private String nombre;
    private int cantidadPuntos;
    private int edad;
    private boolean isIndigena;

    public Usuario(String nombre, int cantidadPuntos, int edad, boolean isIndigena) {
        this.nombre = nombre;
        this.cantidadPuntos = cantidadPuntos;
        this.edad = edad;
        this.isIndigena = isIndigena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isIndigena() {
        return isIndigena;
    }

    public void setIndigena(boolean isIndigena) {
        this.isIndigena = isIndigena;
    }
    
}
