package com.cursa;

import java.util.ArrayList;
import java.util.List;

public class Clasificacion {


    ArrayList<Participantes> clasificacionGeneral = new ArrayList<>();

    void mostrarClasificacionGeneral(ArrayList<Participantes> temp){

        //Mostrar Clasificacion General Ordenada


        System.out.println(temp.size());

        for (int i = 0; i < temp.size(); i++) {

            System.out.println(temp.get(i).getNombre() + " -> " + temp.get(i).getPuntuacion());

        }

    }
}