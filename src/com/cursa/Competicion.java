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

    }

    void setListaParticipantes(){

        for (int i = 0; i < qtadParticipantes; i++) {

            listaParticipantes[i] = participantes;
            if (i == 0){
                listaParticipantes[i].nombre = jugador.nombre;
            }else {
            listaParticipantes[i].nombre = "CPU " + i;
            }
            System.out.println(listaParticipantes[i].nombre);

        }
    }
    void setListaCircuito () {
        for (int i = 0; i <qtadCircuitos ; i++) {
            listaCircuitos[i] = circuito;
            listaCircuitos[i].nombre = "Circuito"+ i;
            System.out.println(listaCircuitos[i].nombre);
        }
    }
}
