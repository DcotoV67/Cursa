package com.cursa;

import java.util.ArrayList;
import java.util.Scanner;

public class Competicion {

    Scanner scanner = new Scanner(System.in);
    Jugador jugador = new Jugador();
    Clasificacion clasificacion = new Clasificacion();

    Participantes participantes = new Participantes();
    Circuito circuito = new Circuito();

    ArrayList<Participantes> listaParticipantes = new ArrayList<>();
    Circuito[] listaCircuitos;


    int qtadParticipantes;
    int qtadCircuitos;

    void configuracion(){

        System.out.println("Dime el nombre del jugador");
        jugador.nombre = scanner.nextLine();

        //¿¿¿¿¿Clase competicion con Array de circuitos y Array de participantes?????

        System.out.println("¿Cuantos participantes tiene la competición?");
        qtadParticipantes = scanner.nextInt();

        System.out.println("¿Cuantos circuitos tiene la competición?");
        qtadCircuitos = scanner.nextInt();

        listaCircuitos = new Circuito[qtadCircuitos];

        scanner.nextLine();
    }

    ArrayList<Participantes> setListaParticipantes() {

        for (int i = 0; i < qtadParticipantes; i++) {

            listaParticipantes.add(new Participantes());
            clasificacion.clasificacionGeneral.add(new Participantes());

            if (i == 0) {
                listaParticipantes.get(i).setNombre(jugador.nombre);

            } else {
                listaParticipantes.get(i).setNombre("CPU " + i);

            }
            System.out.println(listaParticipantes.get(i).getNombre());

        }

            return listaParticipantes;
    }

    Circuito[] setListaCircuito () {
        for (int j = 0; j < qtadCircuitos; j++) {

            listaCircuitos[j] = new Circuito();

            listaCircuitos[j].nombre = "Circuito "+ (j+1);

            System.out.println(listaCircuitos[j].nombre);

        }

        return listaCircuitos;
    }

}
