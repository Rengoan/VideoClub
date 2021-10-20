package com.ceep.videoclub.negocio;

import com.ceep.videoclub.datos.*;
import com.ceep.videoclub.domain.*;
import com.ceep.videoclub.excepciones.*;
import java.util.*;

public class CatalagoPeliculasImp implements ICatalagoPeliculas {

    private final IAccesoDatos datos;

    //Constructor
    public CatalagoPeliculasImp() {
        this.datos = new AccesoDatos();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreCatalogo) {
        
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

    }

    @Override
    public void iniciarArchivo(String nombreCatalogo) {

    }

}
