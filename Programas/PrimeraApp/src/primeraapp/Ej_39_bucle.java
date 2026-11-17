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
public class Ej_39_bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Revertir numero
        /*System.out.println("Dame un numero: ");
        int restante = sc.nextInt();
        int cifra;
        int inverso = 0;
        
        while(restante != 0){
            cifra = restante % 10;
            restante /= 10;
            inverso = inverso * 10 + cifra;
        }
        System.out.println("El numero inverso es: " + inverso);*/
        
        //Revertir texto
        System.out.println("Escribe un texto corto: ");
        String texto = sc.nextLine();
        String inverso = "";
        
        for(int i = texto.length() - 1; i >= 0; i--){
            inverso += texto.substring(i, i + 1);
        }
        System.out.println("Texto invertido: " + inverso);
    }
}
