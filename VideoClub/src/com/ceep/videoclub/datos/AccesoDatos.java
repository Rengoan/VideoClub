package com.ceep.videoclub.datos;

import com.ceep.videoclub.domain.Pelicula;
import com.ceep.videoclub.excepciones.AccesoDatosEx;
import com.ceep.videoclub.excepciones.EscrituraDatosEx;
import com.ceep.videoclub.excepciones.LecturaDatosEx;
import java.io.*;
import java.util.*;

public class AccesoDatos implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {

        var archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            //Entrada es el descriptor de lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            // Nos devuelve una linea de nuestro archivo
            var lectura = entrada.readLine();
            while (lectura != null) { // hasta null
                //Creamos un objeto de pelicula con cada linea del archivo
                //Añado cada pelicula a mi listado de peliculas
                peliculas.add(new Pelicula(lectura));
                //Avanzamos en la lectura
                lectura = entrada.readLine();
            }
            entrada.close(); //Cerrar archivo
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error de lectura listando las peliculas");
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error de lectura listando las peliculas");
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        var archivo = new File(nombreArchivo);
        try {
            //Invocamos a FileWriter para poder anexar la informacion y no sobreescrbirla
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.getNombre());//Agregar mi contenido
            salida.close(); //Cerrar archivo
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepcion al escribir en el archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        var resultado = "";
        try {
            //entrada es el descriptor de lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //nos devuelve una linea de nuestro archivo 
            var lectura = entrada.readLine();
            var i = 0;
            while (!lectura.equalsIgnoreCase(buscar)) {
                i++;
                // Avanzamos en la lectura
                lectura = entrada.readLine();
            }
            resultado = "\nLa pelicula: " + buscar + ", está en la posición " + i;
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        var archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            //Aqui ya esta creado el archivo
            salida.close(); //Cerrar archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {

    }

}
