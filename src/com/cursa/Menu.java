package com.cursa;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void abrir() {

        boolean jugar = true;
        int opcion = 0;

        while(!jugar){

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

    }
}
