package com.ceep.videoclub.domain;

public class Pelicula {

    private String nombre;

    //Constructor
    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this();
        this.nombre = nombre;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre pelicula: " + nombre;
    }

}
