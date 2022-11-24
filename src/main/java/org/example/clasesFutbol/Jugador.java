package org.example.clasesFutbol;

import java.util.Scanner;

public class Jugador {
    Scanner entradaPorTeclado=new Scanner(System.in);
    //atributos
    private String nombre, apellidos, posicion, equipo;
    private int edad, numeroDeCamisa ;


    //constructor
    public Jugador() {
    }

    public Jugador(String nombre, String apellidos, String posicion, String equipo, int edad, int numeroDeCamisa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.equipo = equipo;
        this.edad = edad;
        this.numeroDeCamisa = numeroDeCamisa;
    }
    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        while (edad<=17){
            System.out.println("la edad debe ser mayor de 18, ingrese la edad nuevamente: ");
            edad=entradaPorTeclado.nextInt();
        }this.edad=edad;
    }

    public int getNumeroDeCamisa() {
        return numeroDeCamisa;
    }

    public void setNumeroDeCamisa(int numeroDeCamisa) {
        this.numeroDeCamisa = numeroDeCamisa;
    }
}


