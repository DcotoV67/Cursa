package com.cursa;

public class Participantes {
    private double  tiempo;
    private String nombre;
    private String vehiculo;
    private float puntuacion;

    void actualizarTiempo(){
        tiempo = Math.round(Math.random()*179+1);
    }

    void elegirVehiculo(String vehiculo2){
        vehiculo = vehiculo2;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }
}
