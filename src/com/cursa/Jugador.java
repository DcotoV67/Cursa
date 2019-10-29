package com.cursa;

import java.util.Scanner;

public class Jugador {
    String nombre = "";

    Vehiculo vehiculo = new Vehiculo();

    void elegirVehiculo (){
        Scanner in = new Scanner(System.in);

        System.out.println("Con que vehiculo quieres competir? ");
        System.out.println("");
        System.out.println("1 - Bicicleta");
        System.out.println("2 - Camión");
        System.out.println("3 - Coche");
        System.out.println("4 - Moto");

        int opcion = in.nextInt();


        switch (opcion){
            case 1:
                System.out.println("Has elegido competir con " + vehiculo.getBicicleta());
                vehiculo.getBicicleta();
                break;
            case 2:
                System.out.println("Has elegido competir con " + vehiculo.getCamion());
                vehiculo.getCamion();
                break;
            case 3:
                System.out.println("Has elegido competir con " + vehiculo.getCoche());
                vehiculo.getCoche();
                break;
            case 4:
                System.out.println("Has elegido competir con " + vehiculo.getMoto());
                vehiculo.getMoto();
                break;

            default:
                System.out.println("Opción no válida, por favor introduce otra opción");
                break;
        }

    }

}
