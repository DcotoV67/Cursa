package com.cursa;

import java.util.Scanner;

public class Competicion {

    Scanner scanner = new Scanner(System.in);
    Jugador jugador = new Jugador();
    Participantes participantes = new Participantes();
    Circuito circuito = new Circuito();

    Participantes[] listaParticipantes;
    Circuito[] listaCircuitos;


    int qtadParticipantes;
    int qtadCircuitos;

    void configuracion(){

        System.out.println("Dime el nombre del jugador");
        jugador.nombre = scanner.nextLine();

        //¿¿¿¿¿Clase competicion con Array de circuitos y Array de participantes?????

        System.out.println("¿Cuantos participantes tiene la competición?");
        qtadParticipantes = scanner.nextInt();

        listaParticipantes = new Participantes[qtadParticipantes];

        System.out.println("¿Cuantos circuitos tiene la competición?");
        qtadCircuitos = scanner.nextInt();

        listaCircuitos = new Circuito[qtadCircuitos];
    }

    Participantes[] setListaParticipantes() {

        for (int i = 0; i < qtadParticipantes; i++) {

            listaParticipantes[i] = new Participantes();
        }

        for (int i = 0; i < listaParticipantes.length; i++) {

            participantes.actualizarTiempo();

            if (i == 0) {
                listaParticipantes[i].nombre = jugador.nombre;
                listaParticipantes[i].tiempo = participantes.tiempo;
            } else {
                listaParticipantes[i].nombre = "CPU " + i;
                listaParticipantes[i].tiempo = participantes.tiempo;

            }
            System.out.println(listaParticipantes[i].nombre + " Tiempo del participante: " + listaParticipantes[i].tiempo);

        }

            return listaParticipantes;
    }
    void setListaCircuito () {
        for (int j = 0; j < qtadCircuitos; j++) {

            listaCircuitos[j] = circuito;

            listaCircuitos[j].nombre = "Circuito "+ (j+1);

            System.out.println(listaCircuitos[j].nombre);
        }
    }
}
