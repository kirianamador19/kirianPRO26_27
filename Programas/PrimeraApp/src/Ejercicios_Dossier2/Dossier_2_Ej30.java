/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier2;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Dossier_2_Ej30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do{
            int numRandom = (int)(Math.random()*10) + 10;
            System.out.println("Numero aleatorio generado: " + numRandom);
            System.out.println("Desea continuar?: ");
            continuar = sc.nextLine();
        }while(continuar.equals("c") || continuar.equals("C"));
        System.out.println("Fin del bucle.");
    }
}
