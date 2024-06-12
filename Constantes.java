package com.mycompany.trabajoautonomo;

import java.util.ArrayList;

public class Constantes {
    public static void main(String[] args) {
        
        final int vehiculos= 4;
     final String[] nombres = {"Corolla", "4Runner","Aveo","F 150"};
        System.out.println("los vehiculos disponibles son "+vehiculos);
            System.out.println("lo cuales son: ");
            for (String nombre : nombres) {
    System.out.print(nombre + " ");

    }
    }
}
