package org.example;

import org.example.clasesFutbol.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();

        int opcion;

        do{
            System.out.println("MENU\n");
            System.out.println("1.Agregar un jugador: \n2.Buscar un jugador por numero: \n3.Editar informacion de un jugador: \n4.Mostrar toda la convocatoria de jugadores: \n5.Salir");

            System.out.println("Digita una opcion del menu: ");
            opcion= entradaPorTeclado.nextInt();

            switch (opcion){
                case 1:
                    if(jugadores.size()<23) {
                        Jugador objetoJugador = new Jugador();
                        System.out.print("Ingrese numero de jugador: ");

                        int numeroDeJugador = entradaPorTeclado.nextInt();
                        boolean validar = false;
                        for (Jugador jugador:jugadores){
                            if (jugador.getNumeroDeCamisa()==numeroDeJugador){
                                validar= true;

                                break;
                            }else {
                                validar=false;
                            }
                        }if (validar){
                            System.out.println("Numero ya existente, porfavor digite otro numero");
                        }else {
                            objetoJugador.setNumeroDeCamisa(numeroDeJugador);
                            System.out.print("Digite el nombre del jugador: ");
                            objetoJugador.setNombre(entradaPorTeclado.next());
                            System.out.print("Digite el apellido del jugador: ");
                            objetoJugador.setApellidos(entradaPorTeclado.next());
                            System.out.print("Digite la posicion del jugador: ");
                            objetoJugador.setPosicion(entradaPorTeclado.next());
                            System.out.print("Digite la edad del jugador: ");
                            objetoJugador.setEdad(entradaPorTeclado.nextInt());
                            System.out.print("Digite el equipo al cual pertenece el jugador: ");
                            objetoJugador.setEquipo(entradaPorTeclado.next());

                            jugadores.add(objetoJugador);

                        }
                    }else{
                        System.out.println("No hay mas cupo");
                    }
                    break;
                case 2:
                    int buscarPorNumero;
                    System.out.print("Digite el numero del jugador: ");
                    buscarPorNumero = entradaPorTeclado.nextInt();

                    boolean noSeDetectaElJugador = false;
                    for (Jugador jugador: jugadores){
                        if (jugador.getNumeroDeCamisa()== buscarPorNumero){

                            System.out.println("El numero de la camisa es: " + jugador.getNumeroDeCamisa());
                            System.out.println("El nombre del jugador es: " + jugador.getNombre());
                            System.out.println("El apellido del jugador es: " + jugador.getApellidos());
                            System.out.println("La posicion del jugador es: " + jugador.getPosicion());
                            System.out.println("La edad del jugador es: " + jugador.getEdad());
                            System.out.println("El equipo es: " + jugador.getEquipo());

                            noSeDetectaElJugador=false;
                            break;
                        }else {
                            noSeDetectaElJugador=true;
                        }
                    }if (noSeDetectaElJugador){
                    System.out.println("JUGADOR NO EXISTENTE!!!");
                }else {
                    System.out.println("\nFELICIDADES!!! se encontro jugador");
                }break;
                case 3:
                    int editarInformacion;
                    System.out.print("Numero de la camisa del jugador que quiere editar: ");
                    editarInformacion= entradaPorTeclado.nextInt();

                    int optionEditar;
                    for (Jugador jugador:jugadores){
                        if (jugador.getNumeroDeCamisa()== editarInformacion){
                            System.out.println("Jugador encontrado: ");
                            do {
                                System.out.println("1.Editar numero de camiseta \n2.Editar nombres \n3.Editar apellido \n4.Editar posicion \n5.Editar edad \n6.Editar equipo \n7.Finalizar edicion");
                                System.out.println("Digite una opcion: ");
                                optionEditar= entradaPorTeclado.nextInt();
                                switch (optionEditar){
                                    case 1:
                                        int editarNumero;
                                        System.out.print("Digite el numero de la camiseta: ");
                                        editarNumero= entradaPorTeclado.nextInt();
                                        for (Jugador validarJugador:jugadores){
                                            if (validarJugador.getNumeroDeCamisa()== editarNumero){
                                                System.out.println("Jugador ya existente");
                                            }else {
                                                jugador.setNumeroDeCamisa(editarNumero);
                                                System.out.println("Edicion exitosa!!!");
                                            }
                                        }break;
                                    case 2:
                                        System.out.print("Digite el nuevo nombre: ");
                                        jugador.setNombre(entradaPorTeclado.next());
                                        break;
                                    case 3:
                                        System.out.print("Digite el nuevo apellido: ");
                                        jugador.setApellidos(entradaPorTeclado.next());
                                        break;
                                    case 4:
                                        System.out.print("Digite la nueva posicion: ");
                                        jugador.setPosicion(entradaPorTeclado.next());
                                        break;
                                    case 5:
                                        System.out.print("Digite la nueva edad: ");
                                        int nuevoDato= entradaPorTeclado.nextInt();
                                        jugador.setEdad(nuevoDato);
                                        break;
                                    case 6:
                                        System.out.print("Digite el nuevo equipo: ");
                                        jugador.setEquipo(entradaPorTeclado.next());
                                        break;
                                    case 7:
                                        System.out.print("Salir de la edicion");
                                        break;

                                    default:
                                        System.out.println("Opcion no existente");
                                }
                            }while (optionEditar !=7);
                        }else {
                            System.out.println("Jugador no existente");
                        }
                    }break;
                case 4:
                    System.out.println("Listado de jugadores: ");
                    for (Jugador jugador: jugadores){
                        System.out.println("Informacion");
                        System.out.println("El jugador: " + jugador.getNumeroDeCamisa());
                        System.out.println("Nombre: " + jugador.getNombre());
                        System.out.println("Apellido: " + jugador.getApellidos());
                        System.out.println("Posicion: " + jugador.getPosicion());
                        System.out.println("Edad: " + jugador.getEdad());
                        System.out.println("Equipo: " + jugador.getEquipo());
                    }break;
                case 5:
                    System.out.println("Fin de la ejecucion");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }while (opcion !=5);

    }
}