package com.cursa;

import java.util.Scanner;

public class Competicion {

    Scanner scanner = new Scanner(System.in);
    int qtadParticipantes;
    int qtadCircuitos;

    void configuracion(){

        //jugador.nombre = scanner.nextLine();

        System.out.println("¿Cuantos participantes tiene la competición?");
        qtadParticipantes = scanner.nextInt();

        System.out.println("¿Cuantos circuitos tiene la competición?");
        qtadCircuitos = scanner.nextInt();

    }

}
