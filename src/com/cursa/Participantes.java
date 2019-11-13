package com.cursa;

public class Participantes {
    double  tiempo;
    String nombre;
    String vehiculo;

    void actualizarTiempo(){

        tiempo = Math.round(Math.random()*179+1);
    }

    void elegirVehiculo(String vehiculo2){
        vehiculo = vehiculo2;

    }

}
