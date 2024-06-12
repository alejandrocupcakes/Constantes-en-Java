
package com.mycompany.trabajoautonomo;

public class constantes3 {
    public static void main(String[] args) {
        
       final String[] sabores= {"chocolate", "vainilla","avena","mandarina","galleta"};
        final String[] tamaños = {"Pequeño,", "Mediano","y Grande."};
        
        System.out.print("Tenemos multiple variedad de sabores como por ejemplo ");
        for (String sabor : sabores) {
            System.out.print(sabor + " ");
        }
        System.out.println(" y diferente tamaños como lo son ");
        for (String tamaño : tamaños) {
            System.out.print(tamaño + " ");
        }
    }
}
