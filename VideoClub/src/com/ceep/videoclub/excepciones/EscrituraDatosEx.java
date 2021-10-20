package com.ceep.videoclub.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscrituraDatosEx extends AccesoDatosEx {

    
    public EscrituraDatosEx(String mensaje) {
        super(mensaje);
    }
    
//    public static void escribirArchivo(String nombreArchivo, String contenido) {
//        //Recibe el nombre del archivo y el contenido
//        //Declaramos un objeto de tipo file
//        var archivo = new File(nombreArchivo);
//
//        try {
//            PrintWriter salida = new PrintWriter(archivo);
//            salida.println(contenido);
//            salida.close(); //Cerrar archivo
//        } catch (FileNotFoundException e) {
//            e.printStackTrace(System.out);
//        }
//
//    }

    
}
