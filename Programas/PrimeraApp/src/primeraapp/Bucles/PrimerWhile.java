/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp.Bucles;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class PrimerWhile {
    public static void main(String[] args) {
        //mostrar tabla de multiplicar
        Scanner sc = new Scanner(System.in);
        System.out.println("Que tabla de multiplicar quieres ver?: ");
        int tabla = sc.nextInt();
        
        int i = 1;
        System.out.println("Tabla del " + tabla + ":");
        while(i<11){
            System.out.println(tabla + " x " + i + " = " + tabla*i);
            i++;
        }
    }
}