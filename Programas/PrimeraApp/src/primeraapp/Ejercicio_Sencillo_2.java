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
public class Ejercicio_Sencillo_2 {
    public static void main(String[] args) {
        /*El usuario da un número
            vamos a convertir ese número en letra
        */
        System.out.println("Introduce un número entre 0 - 255: ");
        Scanner sc = new Scanner(System.in);
        char num = (char)sc.nextInt();
        System.out.println("Las siguientes 5 letras son: " + ++num + ++num + ++num + ++num + ++num);
    }
}