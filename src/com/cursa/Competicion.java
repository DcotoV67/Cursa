package com.cursa;

import java.util.Scanner;

public class Competicion {

    Scanner scanner = new Scanner(System.in);
    Jugador jugador = new Jugador();
    Participantes participantes = new Participantes();

    int qtadParticipantes;
    int qtadCircuitos;

    void configuracion(){

        System.out.println("Dime el nombre del jugador");
        jugador.nombre = scanner.nextLine();

        //¿¿¿¿¿Clase competicion con Array de circuitos y Array de participantes?????

        System.out.println("¿Cuantos participantes tiene la competición?");
        qtadParticipantes = scanner.nextInt();

        Participantes[] listaParticipantes = new Participantes[qtadParticipantes];

        System.out.println("¿Cuantos circuitos tiene la competición?");
        qtadCircuitos = scanner.nextInt();

    }

}
