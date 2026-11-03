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
public class PrimerSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 7: ");
        int dia = sc.nextInt();
        
        System.out.println("El dia " + dia + " de la semana es:");
        
        //switch únicamente soporta int, char, short, byte, y String
        
        switch (dia) {
            case 1: System.out.println("Lunes");break;
            case 2: System.out.println("Martes");break;
            case 3: System.out.println("Miercoles");break;
            case 4: System.out.println("Jueves");break;
            case 5: System.out.println("Viernes");break;
            case 6: System.out.println("Sabado");break;
            case 7: System.out.println("Domingo");break;
            default: System.out.println("no contemplo ese numero");break;
        }
    }
}
