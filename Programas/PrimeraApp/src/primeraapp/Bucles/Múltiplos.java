/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp.Bucles;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Múltiplos {
    public static void main(String[] args) {
        // el usuario te da dos números, el menor y el mayor
        // nosotros vamos a mostrar los múltiplos de 3 entre
        // los dos números que nos ha dado el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el menor numero entero: ");
        int numMen = sc.nextInt();
        System.out.println("Dame el mayor numero entero: ");
        int numMay = sc.nextInt();
        System.out.println("");
        
        if(numMen>numMay) {
            int aux = numMay;
            numMay = numMen;
            numMen = aux;
        }
        
        System.out.println("Los multiplos de 3 entre " + numMen + " y " + numMay + " son:");
        
        int i = numMen;
        
        while (i<numMay) {
            if(i %3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
