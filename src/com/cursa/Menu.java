package com.cursa;

import java.util.Scanner;

public class Menu {

    public void abrir() {

        Scanner scanner = new Scanner(System.in);

        Juego juego = new Juego();

        boolean jugar = true;
        int opcion = 0;

        while(jugar){

            System.out.println("¿Que quieres hacer?");
            System.out.println("");
            System.out.println("1 - Configuració de la competició");
            System.out.println("2 - Resultats/Palmarès/ClassificacióGeneral");
            System.out.println("3 - Jugar");
            System.out.println("4 - Acabar");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    jugar = false;
                    break;

                default:
                    System.out.println("Opción no válida, por favor introduce otra opción");
                    break;

            }

        }

        juego.acabarJuego();

    }
}
