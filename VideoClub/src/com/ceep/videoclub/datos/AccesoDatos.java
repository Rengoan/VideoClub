package com.ceep.videoclub.datos;

import com.ceep.videoclub.domain.Pelicula;
import java.util.ArrayList;

public class AccesoDatos implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        System.out.println("La pelicula existe");
        return false;
    }

    @Override
    public void listar(String nombreArchivo, ArrayList peliculas) {
        System.out.println("peliculas = " + peliculas);
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) {

    }

    @Override
    public void buscar(String nombreArchivo, String buscar) {
        System.out.println("Pelicula a buscar = " + buscar);
    }

    @Override
    public void crear(String nombreArchivo) {
        System.out.println("La pelicula ha sido creada");
    }

    @Override
    public void borrar(String nombreArchivo) {
        System.out.println("La pelicula ha sido borrada");
    }

}
