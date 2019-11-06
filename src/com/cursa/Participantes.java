package com.cursa;

public class Participantes {
    double  tiempo;
    String nombre;
    String vehiculo;

    void elegirNombreAleatorio(){

        nombre = "CPU 01";
    }

    void actualizarTiempo(){

        tiempo = Math.random()*179+1;
    }

    void elegirVehiculo(String vehiculo2){
        vehiculo = vehiculo2;

    }

}
