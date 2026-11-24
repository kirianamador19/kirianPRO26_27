/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Funciones {
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "-------------------\n"
                + "Que quieres hacer?:\n"
                + "-------------------\n"
                + "1. Multiplicar\n"
                + "2. Sumar\n"
                + "3. Restar\n"
                + "4. Dividir\n"
                + "-------------------\n");
        int operacion = sc.nextInt(); sc.nextLine();
        System.out.println("Dame el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        int num2 = sc.nextInt();
        
        switch (operacion){
            case 1: System.out.println(num1 + " x " + num2 + " = " + (num1*num2));break;
            case 2: System.out.println(num1 + " + " + num2 + " = " + (num1+num2));break;
            case 3: System.out.println(num1 + " - " + num2 + " = " + (num1-num2));break;
            case 4: System.out.println(num1 + " / " + num2 + " = " + (num1/num2));break;
        }
    }
}
