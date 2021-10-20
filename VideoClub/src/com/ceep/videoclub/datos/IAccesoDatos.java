package com.ceep.videoclub.datos;


import com.ceep.videoclub.domain.Pelicula;
import com.ceep.videoclub.excepciones.AccesoDatosEx;
import com.ceep.videoclub.excepciones.EscrituraDatosEx;
import com.ceep.videoclub.excepciones.LecturaDatosEx;
import java.util.List;

public interface IAccesoDatos {

    //Comprueba si el archivo existe
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    //Lista todas las peliculas contenidas en el archivo nombreArchivo
    List<Pelicula> listar(String nombreArchivo)throws LecturaDatosEx;

    //Escribe una nueva pelicula en el archivo nombreArchivo
    //El parametro anexar puede indicar si queremos agregar la pelicula o sobreescribir
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar)
            throws EscrituraDatosEx;

    //Busca la expresion de buscar en el archivo y nos muestra un mensaje en
    // caso de que lo encuentre o no
    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    //Crea el archivo
    void crear(String nombreArchivo) throws AccesoDatosEx;

    //Borra el archivo
    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
