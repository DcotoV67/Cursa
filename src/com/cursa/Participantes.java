package com.cursa;

public class Participantes implements Comparable<Participantes>{
    double  tiempo;
    String nombre;
    protected String vehiculo;
    private int puntuacion;
    int posicion;

    void actualizarTiempo(){
        tiempo = Math.round(Math.random()*99+1);
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int compareTo(Participantes participantes) {
        if (participantes.tiempo == this.tiempo) {
            return 0;
        } else if (participantes.tiempo > this.tiempo) {
            return -1;
        } else if (participantes.tiempo < this.tiempo) {
            return 1;
        }
        return 0;
    }
}
