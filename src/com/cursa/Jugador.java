package com.cursa;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador{

    ArrayList<Participantes> temp = new ArrayList<>();

    int posicion;

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

    ArrayList<Participantes> competir(Circuito[] listaCircuitos, ArrayList<Participantes> listaParticipantes){

        Clasificacion clasificacion = new Clasificacion();

        for (int j = 0; j < listaParticipantes.size(); j++) {
            clasificacion.clasificacionGeneral.add(new Participantes());
        }

        for (int i = 0; i < listaCircuitos.length; i++) {
            System.out.println(listaCircuitos[i].nombre);
            System.out.println("");
            for (int k = 0; k < listaParticipantes.size(); k++) {
                listaParticipantes.get(k).actualizarTiempo();
            }

            listaParticipantes.sort(Participantes::compareTo);
            for (int j = 0; j < listaParticipantes.size(); j++) {
                clasificacion.clasificacionGeneral.get(j).setNombre(listaParticipantes.get(j).getNombre());

            }


            for (int j = 0; j < listaParticipantes.size(); j++) {

                posicion = j;

                switch (posicion) {
                    case 0:
                        listaParticipantes.get(j).setPuntuacion(16);
                        clasificacion.clasificacionGeneral.get(j).setPuntuacion((clasificacion.clasificacionGeneral.get(j).getPuntuacion() + 16));
                        System.out.println(listaParticipantes.get(j).getNombre() + " -> " + listaParticipantes.get(j).getTiempo() + " -> " + listaParticipantes.get(j).getPuntuacion() + "pts");
                    break;

                    case 1:
                        listaParticipantes.get(j).setPuntuacion(12);
                        clasificacion.clasificacionGeneral.get(j).setPuntuacion((clasificacion.clasificacionGeneral.get(j).getPuntuacion() + 12));
                        System.out.println(listaParticipantes.get(j).getNombre() + " -> " + listaParticipantes.get(j).getTiempo() + " -> " + listaParticipantes.get(j).getPuntuacion() + "pts");
                    break;

                    case 2:
                        listaParticipantes.get(j).setPuntuacion(8);
                        clasificacion.clasificacionGeneral.get(j).setPuntuacion((clasificacion.clasificacionGeneral.get(j).getPuntuacion() + 8));
                        System.out.println(listaParticipantes.get(j).getNombre() + " -> " + listaParticipantes.get(j).getTiempo() + " -> " + listaParticipantes.get(j).getPuntuacion() + "pts");
                    break;

                    case 3:
                        listaParticipantes.get(j).setPuntuacion(4);
                        clasificacion.clasificacionGeneral.get(j).setPuntuacion((clasificacion.clasificacionGeneral.get(j).getPuntuacion() + 4));
                        System.out.println(listaParticipantes.get(j).getNombre() + " -> " + listaParticipantes.get(j).getTiempo() + " -> " + listaParticipantes.get(j).getPuntuacion() + "pts");
                    break;

                    default:
                        listaParticipantes.get(j).setPuntuacion(2);
                        clasificacion.clasificacionGeneral.get(j).setPuntuacion((clasificacion.clasificacionGeneral.get(j).getPuntuacion() + 2));
                        System.out.println(listaParticipantes.get(j).getNombre() + " -> " + listaParticipantes.get(j).getTiempo() + " -> " + listaParticipantes.get(j).getPuntuacion() + "pts");
                    break;

                }
            }

            System.out.println("");
            System.out.println("---------------------");

        }
        for (int i = 0; i < clasificacion.clasificacionGeneral.size(); i++) {
            temp.add(new Participantes());
        }
        for (int i = 0; i < temp.size(); i++) {
            temp.get(i).setNombre(clasificacion.clasificacionGeneral.get(i).getNombre());
            temp.get(i).setPuntuacion(clasificacion.clasificacionGeneral.get(i).getPuntuacion());
        }
        listaParticipantes.clear();
        return temp;
    }

}


