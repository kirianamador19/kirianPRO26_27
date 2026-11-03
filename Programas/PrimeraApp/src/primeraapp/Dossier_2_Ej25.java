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

/*
Hacer un Programa que le pida al usuario que intrroduzca una letra y por
medio de una estructura switch, evitando el mayor número de sentencias break
posibles, muestre en pantalla el mensaje: "es una vocal" cuando el usuario
haya introducido una vocal (ya sea minúscula o mayúscula) y el mensaje:
"no es una vocal" si no lo fuera.
*/
public class Dossier_2_Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una letra: ");
        String texto = sc.nextLine();
        char letra = texto.charAt(0);
        
        switch (letra){
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println("Es una vocal");break;
            default: System.out.println("No es una vocal");break;
        }
        
        
    }
}
