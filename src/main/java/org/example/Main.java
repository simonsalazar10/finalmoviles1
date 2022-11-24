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
            System.out.println("menu\n");
            System.out.println("1. Agregar un jugador: \n2. Buscar un jugador por número: \n3.  Editar información de un jugador: \n4. Mostrar toda la convocatoria de jugadores: \n5. Salir");

            System.out.println("Digita una opcion del menu: ");
            opcion= entradaPorTeclado.nextInt();

            switch (opcion){
                case 1:
                    if(jugadores.size()<23) {
                        Jugador objetoJugador = new Jugador();
                        System.out.print("ingrese numero de jugador: ");

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
                            System.out.println("numero ya existente, porfavor digite otro numero");
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
                        System.out.println("no hay mas cupo");
                    }
                    break;
                case 2:
                    int buscarPorNumero;
                    System.out.print("Digite el numero del jugador: ");
                    buscarPorNumero = entradaPorTeclado.nextInt();

                    boolean noSeDetectaElJugador = false;
                    for (Jugador jugador: jugadores){
                        if (jugador.getNumeroDeCamisa()== buscarPorNumero){

                            System.out.println("el numero de la camisa es: " + jugador.getNumeroDeCamisa());
                            System.out.println("el nombre del jugador es: " + jugador.getNombre());
                            System.out.println("el apellido del jugador es: " + jugador.getApellidos());
                            System.out.println("la posicion del jugador es: " + jugador.getPosicion());
                            System.out.println("la edad del jugador es: " + jugador.getEdad());
                            System.out.println("el equipo es: " + jugador.getEquipo());

                            noSeDetectaElJugador=false;
                            break;
                        }else {
                            noSeDetectaElJugador=true;
                        }
                    }if (noSeDetectaElJugador){
                    System.out.println("jugador no encontrado");
                }else {
                    System.out.println("FELICIDADES!!! se encontro jugador");
                }break;
                case 3:
                    int editarInformacion;
                    System.out.print("numero de la camisa del jugador que quiere editar: ");
                    editarInformacion= entradaPorTeclado.nextInt();

                    int optionEditar;
                    for (Jugador jugador:jugadores){
                        if (jugador.getNumeroDeCamisa()== editarInformacion){
                            System.out.println("jugador encontrado: ");
                            do {
                                System.out.println("1. editar numero de camiseta \n2. editar nombres \n3.  editar apellido \n4. editar posicion \n5. editar edad \n 6. editar equipo \n 7. finalizar edicion");
                                System.out.println("Digite una opcion: ");
                                optionEditar= entradaPorTeclado.nextInt();
                                switch (optionEditar){
                                    case 1:
                                        int editarNumero;
                                        System.out.print("Digite el numero de la camiseta: ");
                                        editarNumero= entradaPorTeclado.nextInt();
                                        for (Jugador validarJugador:jugadores){
                                            if (validarJugador.getNumeroDeCamisa()== editarNumero){
                                                System.out.println("jugador ya existente");
                                            }else {
                                                jugador.setNumeroDeCamisa(editarNumero);
                                                System.out.println("edicion exitosa!!!");
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
                                        System.out.print("salir de la edicion");
                                        break;

                                    default:
                                        System.out.println("opcion no existente");
                                }
                            }while (optionEditar !=7);
                        }else {
                            System.out.println("jugador no existente");
                        }
                    }break;
                case 4:
                    System.out.println("listado de jugadores: ");
                    for (Jugador jugador: jugadores){
                        System.out.println("informacion");
                        System.out.println("el jugador: " + jugador.getNumeroDeCamisa());
                        System.out.println("nombre: " + jugador.getNombre());
                        System.out.println("apellido: " + jugador.getApellidos());
                        System.out.println("posicion: " + jugador.getPosicion());
                        System.out.println("edad: " + jugador.getEdad());
                        System.out.println("equipo: " + jugador.getEquipo());
                    }break;
                case 5:
                    System.out.println("fin de la ejecucion");
                    break;

                default:
                    System.out.println("opcion no valida");
            }

        }while (opcion !=5);

    }
}