package com.cursa;

import java.util.Scanner;

public class Jugador {
    String nombre = "";

    String vehiculo = "";

    String elegirVehiculo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Con que vehiculo quieres competir? ");
        System.out.println("");
        System.out.println("1 - Bicicleta");
        System.out.println("2 - Camión");
        System.out.println("3 - Coche");
        System.out.println("4 - Moto");

        int opcion = in.nextInt();


        switch (opcion) {
            case 1:
                vehiculo = "Bicicleta";
                System.out.println("Has elegido competir con " + vehiculo);
                break;
            case 2:
                vehiculo = "Camion";
                System.out.println("Has elegido competir con " + vehiculo);
                break;
            case 3:
                vehiculo = "Coche";
                System.out.println("Has elegido competir con " + vehiculo);
                break;
            case 4:
                vehiculo = "Moto";
                System.out.println("Has elegido competir con " + vehiculo);
                break;

            default:
                System.out.println("Opción no válida, por favor introduce otra opción");
                break;
        }

        return vehiculo;
    }

    void asignarVehiculo(Participantes[] listaParticipantes){

        for (int i = 0; i < listaParticipantes.length; i++) {
            listaParticipantes[i].vehiculo = vehiculo;

        }
    }
}


