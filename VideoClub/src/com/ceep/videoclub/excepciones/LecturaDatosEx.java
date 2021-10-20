package com.ceep.videoclub.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDatosEx extends AccesoDatosEx {

    
    public LecturaDatosEx(String mensaje) {
        super(mensaje);
    }
    
//    public static void leerArchivo(String nombreArchivo) {
//        var archivo = new File(nombreArchivo);
//        try {
//            //Entrada es el descriptor de lectura
//            var entrada = new BufferedReader(new FileReader(archivo));
//            // Nos devuelve una linea de nuestro archivo
//            var lectura = entrada.readLine();
//            while (lectura != null) { // hasta null
//                System.out.println("Pelicula = " + lectura);
//                //Avanzamos en la lectura
//                lectura = entrada.readLine();
//            }
//            entrada.close(); //Cerrar archivo
//        } catch (FileNotFoundException e) {
//            e.printStackTrace(System.out);
//        } catch (IOException e) {
//            e.printStackTrace(System.out);
//        }
//    }

    
}
