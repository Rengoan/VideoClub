package com.ceep.videoclub.negocio;

import com.ceep.videoclub.datos.*;
import com.ceep.videoclub.domain.*;
import com.ceep.videoclub.excepciones.*;
import java.io.File;
import java.util.*;

public class CatalagoPeliculasImp implements ICatalagoPeliculas {

    private final IAccesoDatos datos;

    //Constructor
    public CatalagoPeliculasImp() {
        this.datos = new AccesoDatos();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreCatalogo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            if (this.datos.existe(nombreCatalogo)) {
                this.datos.escribir(pelicula, nombreCatalogo, true);
            } else {
                System.out.println("Catalogo no inicializado");
            }

        } catch (EscrituraDatosEx ex) {
            System.out.println("Error agregando al catalogo");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas(String nombreCatalogo) {
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            peliculas = this.datos.listar(nombreCatalogo);

            peliculas.forEach(pelicula -> {
                System.out.println(pelicula.getNombre());
            });
        } catch (LecturaDatosEx ex) {
            System.out.println("Error leyendo el catalogo");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String nombreCatalogo, String buscar) {
        var archivo = new File(nombreCatalogo);
        try {
            System.out.println(this.datos.buscar(nombreCatalogo, buscar));
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Error al buscar el archivo");
        }
    }

    @Override
    public void iniciarArchivo(String nombreCatalogo) {

    }

}
