package com.ceep.videoclub.negocio;

public interface ICatalagoPeliculas {

    void agregarPelicula(String nombre, String nombreArchivo);

    void listarPeliculas(String nombreArchivo);

    void buscarPelicula(String nombreArchivo, String buscar);

    void iniciarArchivo(String nombreArchivo);

}
