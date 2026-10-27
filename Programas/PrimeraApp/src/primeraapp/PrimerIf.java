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
public class PrimerIf {
    public static void main(String[] args) {
        boolean dosIgualAtres = 2 == 3;
        boolean otraComparacion = 2 == 2;
        System.out.println(dosIgualAtres);
        System.out.println(otraComparacion);
        
        int a = 5;
        boolean comparacionDistintoDe = a != 5;
        
        System.out.println("Es a distinto de 5? " + comparacionDistintoDe);
        
        boolean esAMayorQue4 = a > 4;
        System.out.println("Es a mayor que 4? " + esAMayorQue4);
        
        boolean esAMenorOIgualQue7 = a <= 7;
        System.out.println("Es a menor o igual que 7? " + esAMenorOIgualQue7);
        
        boolean esAMayorOIgualQue8 = a >= 8;
        System.out.println("Es a mayor o igual que 8? " + esAMayorOIgualQue8);
        
        //nuestro primer if
        String resultadoComparacion = ( a > 1 )? "a es mayor que 1" : "a NO es mayor que 1";
        System.out.println("En resultadoComparacion " + resultadoComparacion);
        
        
        //El programa pide al usuario su edad y se le muestra mensaje: "es adulto" o "no es adulto";
        System.out.println("Introduzca su edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
        String adulto = (edad >= 18)? "Es adulto" : "No es adulto";
        
        System.out.println(adulto);
    }
}
