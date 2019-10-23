package com.cursa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Franco: Mañana es jueves y se sale");
        int gvhj;

        Scanner scanner = new Scanner(System.in);
        String franco = "";

        franco = scanner.nextLine();

        if (franco.equals("fuera")){

            System.out.println("ESPAÑOLES, he salido");
        }else{
            System.out.println("Era una broma");        }

    }
}
