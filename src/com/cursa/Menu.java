package com.cursa;

import java.util.Scanner;

public class Menu {

    public void abrir() {

        Scanner scanner = new Scanner(System.in);

        Juego juego = new Juego();
        Competicion competicion = new Competicion();
        Jugador jugador = new Jugador();
        Participantes participante  = new Participantes();
        boolean jugar = true;
        int opcion;

        while(jugar){

            System.out.println("");
            System.out.println("¿Que quieres hacer?");
            System.out.println("");
            System.out.println("1 - Configuració de la competició");
            System.out.println("2 - Resultats/Palmarès/ClassificacióGeneral");
            System.out.println("3 - Jugar");
            System.out.println("4 - Acabar");
            System.out.println("");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    competicion.configuracion();
                    break;

                case 2:
                    System.out.println("Opción 2");
                    break;

                case 3:
                    System.out.println("Opción 3");
                    jugador.elegirVehiculo();
                    participante.elegirNombreAleatorio();
                    participante.actualizarTiempo();
                    participante.elegirVehiculo(jugador.vehiculo);
                    break;

                case 4:
                    jugar = false;
                    System.out.println(participante.vehiculo + " / " + jugador.vehiculo);
                    System.out.println(participante.nombre);
                    System.out.println(participante.tiempo);
                    break;

                default:
                    System.out.println("Opción no válida, por favor introduce otra opción");
                    break;

            }

        }

        juego.acabarJuego();

    }
}
