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
public class Dossier_2_Ej17 {
    public static void main(String[] args) {
        final double IGIC = 0.07;
        System.out.println("Inserte el precio del producto sin IGIC: ");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        double resIGIC = precio*IGIC;
        System.out.println("El IGIC del producto es de: "
                + resIGIC + "EUR");
    }
}
