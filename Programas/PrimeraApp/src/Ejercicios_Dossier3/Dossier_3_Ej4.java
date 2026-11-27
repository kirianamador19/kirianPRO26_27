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
public class Dossier_3_Ej4 {

    /**
     * La función verifica que el número sea entre 20 y 50, y sea múltiplo de 3.
     * 
     * @param num recibe numero entero introducido por el usuario.
     * @return boolean que diga si el número cumple con los requisitos.
     */
    
    public static boolean numeroValido(int num){
        boolean valido = num >= 20 && num <= 50 && num % 3 == 0;
        
        return valido;
    }
    
    public static void main(String[] args) {
        int num;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println(
            "Introducir un número: ");
            num = cin.nextInt();
        } while (!numeroValido(num));
        System.out.println(
        "El número cumple los requisitos.Se puede continuar");
 }
}