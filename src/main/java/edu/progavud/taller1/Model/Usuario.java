/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller1.model;

/**
 * Representa un usuario del sistema que realiza compras de productos.
 * Cada usuario tiene un nombre, una cantidad de puntos acumulados por fidelización,
 * su edad y una indicación de si pertenece a una comunidad indígena (lo cual puede 
 * influir en beneficios o descuentos).
 * 
 * @author ACER NITRO
 */
public class Usuario {

    /**
     * Nombre del usuario.
     */
    private String nombre;

    /**
     * Cantidad de puntos acumulados por el usuario.
     */
    private int cantidadPuntos;

    /**
     * Edad del usuario.
     */
    private int edad;

    /**
     * Indica si el usuario pertenece a una comunidad indígena.
     */
    private boolean isIndigena;

    /**
     * Método constructor de la clase.
     * Crea un nuevo usuario con la información proporcionada.
     *
     * @param nombre            Nombre del usuario.
     * @param cantidadPuntos    Cantidad de puntos acumulados.
     * @param edad              Edad del usuario.
     * @param isIndigena        Booleano true si el usuario pertenece a una comunidad indígena.
     */
    public Usuario(String nombre, int cantidadPuntos, int edad, boolean isIndigena) {
        this.nombre = nombre;
        this.cantidadPuntos = cantidadPuntos;
        this.edad = edad;
        this.isIndigena = isIndigena;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cantidad de puntos del usuario.
     *
     * @return Puntos acumulados.
     */
    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    /**
     * Establece la cantidad de puntos del usuario.
     *
     * @param cantidadPuntos Nueva cantidad de puntos acumulados.
     */
    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    /**
     * Obtiene la edad del usuario.
     *
     * @return Edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del usuario.
     *
     * @param edad Nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Indica si el usuario pertenece a una comunidad indígena.
     *
     * @return true si es indígena, false en caso contrario.
     */
    public boolean isIndigena() {
        return isIndigena;
    }

    /**
     * Establece si el usuario pertenece a una comunidad indígena.
     *
     * @param isIndigena true si es indígena, false en caso contrario.
     */
    public void setIndigena(boolean isIndigena) {
        this.isIndigena = isIndigena;
    }
}
