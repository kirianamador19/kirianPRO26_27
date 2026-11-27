/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier3;

/**
 *
 * @author Kirian Amador Guillén
 */


public class Dossier_3_Ej3 {
    /**
     * la funcion aleatorio recibe dos numeros enteros positivo y devuelve un
     * anetorio entre esos dos números
     * 
     * @param min el valor mas pequeno que puede generar el aleatorio
     * @param max el valor mas grande que puede generar el aleatorio
     * @return numero aleatorio entre min y max
     */
    
    public static int aleatorio(int min, int max) {
        int res = (int) ((max - min + 1) * Math.random()) + min;
        return res;
    }

    public static void main(String[] args) {
        int num;
        do {
            num = aleatorio(25, 45);
            System.out.println(num);
        } while (num != 35);
    }
}
