/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier3;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Dossier_3_Ej1 {
    public static int mcd(int a, int b){
        int resultado = 0;
        
        do {
            int aux1 = b;
            int aux2 = a % b;
            a = aux1;
            b = aux2;
        }while(b != 0);
        
        resultado = a;
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculo de MCD para dos numeros");
        System.out.println("Numero 1: ");
        int a = sc.nextInt(); sc.nextLine();
        System.out.println("Numero 2: ");
        int b = sc.nextInt(); sc.nextLine();
        
        System.out.println("El mcd es: " + mcd(a,b));
    }
}
