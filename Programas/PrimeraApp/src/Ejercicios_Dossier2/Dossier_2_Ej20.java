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
Hacer un programa que se le pase un número entero
y que devuelva los siguientes mensajes:
- Si es impar: “El número: x es impar”
- Si es par: “El número x es par”
Donde x es el número introducido por el usuario
*/

public class Dossier_2_Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("El numero: " + num + " es par");
        }else{
            System.out.println("El numero: " + num + " es impar");
        }
    }
}
