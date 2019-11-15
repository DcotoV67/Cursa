package com.cursa;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador{
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

    void asignarVehiculo(ArrayList<Participantes> listaParticipantes){

        for (int i = 0; i < listaParticipantes.size(); i++) {
            listaParticipantes.get(i).vehiculo = vehiculo;

        }
    }

    void competir(Circuito[] listaCircuitos, ArrayList<Participantes> listaParticipantes){

        for (int i = 0; i < listaParticipantes.size(); i++) {
            listaParticipantes.get(i).actualizarTiempo();
        }

        listaParticipantes.sort(Participantes::compareTo);

        for (int i = 0; i < listaCircuitos.length; i++) {
            System.out.println(listaCircuitos[i].nombre);

            for (int j = 0; j < listaParticipantes.size(); j++) {
                System.out.println(listaParticipantes.get(j).nombre);
            }

        }

    }

}


