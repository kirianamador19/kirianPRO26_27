/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier2;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */

/*
Escribir un programa que el usuario escriba una cadena de texto y se le
muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto.
*/

public class Dossier_2_Ej41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String texto = sc.nextLine();
        String invertido = "";
        
        for(int i = texto.length() - 1; i >= 0; i--){
            invertido += texto.substring(i, i + 1);
        }
        System.out.println("Texto invertido: " + invertido);
    }
}
