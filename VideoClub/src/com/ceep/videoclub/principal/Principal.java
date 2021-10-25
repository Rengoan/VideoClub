package com.ceep.videoclub.principal;

import com.ceep.videoclub.negocio.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        var nombreCatalogo = "Videoclub.txt";
        ICatalagoPeliculas catalogo = new CatalagoPeliculasImp();
//        catalogo.agregarPelicula("Matrix", nombreCatalogo);
        menu(nombreCatalogo, catalogo);

    }

    public static void menu(String nombreCatalogo, ICatalagoPeliculas catalogo) {
        var nombrePeli = "";
        int opcion;
        Scanner menu = new Scanner(System.in);
        while (true) {
            System.out.println("MENU");
            System.out.println("====");
            System.out.println("1.- Iniciar catálogo de películas");
            System.out.println("2.- Agregar película");
            System.out.println("3.- Listar películas");
            System.out.println("4.- Buscar una película");
            System.out.println("0.- Salir");
            System.out.println("Elige una opcion");

            opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("=========================PELÍCULAS===================================");
                    catalogo.iniciarArchivo(nombreCatalogo);
                    System.out.println("Catalogo iniciado...");
                    break;
                case 2:
                    Scanner agregar = new Scanner(System.in);
                    System.out.println("Introducuce el nombre de la pelicula a agregar");
                    nombrePeli = agregar.nextLine();
                    catalogo.agregarPelicula(nombrePeli, nombreCatalogo);
                    System.out.println("Se ha agregado " + nombrePeli + " al catalogo " + nombreCatalogo);
                    break;
                case 3:
                    catalogo.listarPeliculas(nombreCatalogo);
                    break;
                case 4:
                    Scanner buscar = new Scanner(System.in);
                    System.out.println("Introduce el nombre de la pelicula que quieres buscar: ");
                    nombrePeli = buscar.nextLine();
                    catalogo.buscarPelicula(nombreCatalogo, nombrePeli);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    return;
                default:
                    System.out.println("Debe seleccionar una opción entre 0 y 4");
            }
        }
    }
}
