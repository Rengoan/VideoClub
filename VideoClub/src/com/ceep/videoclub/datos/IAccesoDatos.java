package com.ceep.videoclub.datos;

import com.ceep.videoclub.domain.*;
import java.util.ArrayList;

public interface IAccesoDatos {

    boolean existe(String nombreArchivo);

    void listar(String nombreArchivo, ArrayList peliculas);

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar);

    void buscar(String nombreArchivo, String buscar);

    void crear(String nombreArchivo);

    void borrar(String nombreArchivo);
}
