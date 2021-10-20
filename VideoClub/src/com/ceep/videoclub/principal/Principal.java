package com.ceep.videoclub.principal;

import com.ceep.videoclub.domain.Pelicula;
import com.ceep.videoclub.negocio.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        var nombreCatalogo = "Videoclub.txt";
        ICatalagoPeliculas catalogo = new CatalagoPeliculasImp();
        catalogo.agregarPelicula("Matrix", nombreCatalogo);

    }

    public static void menu() {
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
                    System.out.println("=========================PELÍCULAS====================================");
//                visualizar();
                    System.out.println("==============================================================");
                    break;
                case 2:
//                masBarato();
                    break;
                case 3:
//                modiPrecio();
                    break;
                case 4:
//                precioMedio();
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
