/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Dossier_2_Ej19 {
    public static void main(String[] args) {
        System.out.println("Introduzca los grados Farenheit: ");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextInt();
        
        double c = (f-32)*5/9;
        System.out.println("Grados Farenheit: " + f);
        System.out.println("Grados Centigrados: " + c);
    }
}
