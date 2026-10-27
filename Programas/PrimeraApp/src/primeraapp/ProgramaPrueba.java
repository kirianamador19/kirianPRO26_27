/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraapp;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */

//Pedir dos números, multiplicarlos, y sumarlos

public class ProgramaPrueba {
    public static void main(String[] args) {
        System.out.println("Escribe el numero 1:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        System.out.println("Escribe el numero 1:");
        int num2 = sc.nextInt();
        
        System.out.println("Suma: " + (num1+num2));
        System.out.println("Multiplicfacion: " + (num1*num2));
    }
    
}
