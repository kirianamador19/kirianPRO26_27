/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeraapp;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PrimeraApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base: ");
        int b = sc.nextInt();
        System.out.println("Dame la altura: ");
        int a = sc.nextInt();
        
        System.out.println("El area de rectangulo es:");
        int resultado=b*a/2;
        System.out.println(resultado);
        
        
    }
    
}
