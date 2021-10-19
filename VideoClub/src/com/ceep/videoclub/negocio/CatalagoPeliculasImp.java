package com.ceep.videoclub.negocio;

public class CatalagoPeliculasImp implements ICatalagoPeliculas {

    @Override
    public void agregarPelicula(String nombre, String nombreArchivo) {
        System.out.println("Se ha agregado una película");
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        System.out.println("Listado de peliculas = " + nombreArchivo);
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        System.out.println("Buscar pelicula: ");
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        System.out.println("Iniciar archivo");
    }

}
