package com.cursa;

public class Vehiculo {
    private String bicicleta = "bicicleta";
    private String moto = "moto";
    private String coche = "coche";
    private String camion = "camión";

    public void setBicicleta(String bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getBicicleta() {
        return bicicleta;
    }

    public void setCamion(String camion) {
        this.camion = camion;
    }

    public String getCamion() {
        return camion;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getCoche() {
        return coche;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public String getMoto() {
        return moto;
    }
}
