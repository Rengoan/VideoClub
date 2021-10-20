package com.ceep.videoclub.negocio;

public interface ICatalagoPeliculas {

    //Agrega una pelicula al catalogo
    void agregarPelicula(String nombrePelicula, String nombreCatalogo);

    //Mostrar todas las peliculas del catalogo
    void listarPeliculas(String nombreCatalogo);

    //Busca la pelicula "Buscar" en el catalogo
    void buscarPelicula(String nombreCatalogo, String buscar);

    //Inicia nuestro catalogo
    void iniciarArchivo(String nombreCatalogo);

}
