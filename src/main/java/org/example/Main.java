package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Jugador objetoJugador = new Jugador();

        int opcion=0;

        System.out.println("menu\n");
        System.out.println("1. Agregar un jugador: \n2. Buscar un jugador por número: \n3.  Editar información de un jugador: \n4. Mostrar toda la convocatoria de jugadores: \n5. Salir");


        do{
            System.out.println("Digita una opcion del menu: ");
            opcion= entradaPorTeclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Numero de camiseta: ");

            }

        }while (opcion !=0);

    }
}