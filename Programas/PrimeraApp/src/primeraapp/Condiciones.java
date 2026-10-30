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


public class Condiciones {
/*
    public static void main(String[] args) {
        System.out.println("Introduzca su edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        
        if(edad < 18){
            System.out.println("Es menor");
        }else if(edad > 67){
            System.out.println("Es jubilado");
        }else{
            System.out.println("Es adulto");}
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número 1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el número 2: ");
        int num2 = sc.nextInt();
        
        if(num1 <100 && num2 < 100){
            System.out.println("Tanto " + num1 + " y " + num2 + " son menores de 100");
        } else if (num1 > 100 && num2 > 100){
            System.out.println("Los dos son mayor de 100");
        } else if (num1 > 100){
            System.out.println(num1 + " es mayor de 100 y " + num2 + " es menor de 100");
        } else {
            System.out.println(num1 + " menor de 100 y " + num2 + " mayor de 100");
        }
    }

}

