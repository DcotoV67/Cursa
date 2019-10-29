package com.cursa;

public class Jugador {
    String nombre = "";

    Vehiculo vehiculo = new Vehiculo();

    void elegirVehiculo (){
        int opcion = 0;

        System.out.println("Con que vehiculo quieres competir? ");
        System.out.println("");
        System.out.println("1 - Bicicleta");
        System.out.println("2 - Camión");
        System.out.println("3 - Coche");
        System.out.println("4 - Moto");


        switch (opcion){
            case 1:
                vehiculo.getBicicleta();
                break;
            case 2:
                vehiculo.getCamion();
                break;
            case 3:
                vehiculo.getCoche();
                break;
            case 4:
                vehiculo.getMoto();
                break;

            default:
                System.out.println("Opción no válida, por favor introduce otra opción");
                break;
        }

    }

}
