/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Dossier_2_Ej16 {
    public static void main(String[] args) {
        System.out.println("Introduzca la distancia en metros "
                + "de cada lado de su finca\nLargo: ");
        Scanner sc = new Scanner(System.in);
        int largo = sc.nextInt();
        System.out.println("Ancho: ");
        int ancho = sc.nextInt();
        
        System.out.println("El area de la finca es de:\n"
                + (largo*ancho) + " metros cuadrados.\n"
                + ((largo*100)*(ancho*100)) + " centimetros cuadrados.");
    }
}
