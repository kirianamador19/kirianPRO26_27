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
Escribir un programa que reciba un número entero mayor o igual a 0 y menor
o igual a 999 y muestre cuántas cifras tiene
*/

public class Dossier_2_Ej40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        while(num < 0||num > 999){
            System.out.println("Introduce un numero entre 0 y 999:");
            num = sc.nextInt();

            if(num < 0||num > 999){
                System.out.println("Numero no valido, elija otro.");
            }
        }
        
        if(num < 10){
            System.out.println("El numero tiene 1 cifra.");
        }else if(num < 100){
            System.out.println("El numero tiene 2 cifras.");
        }else{
            System.out.println("El numero tiene 3 cifras.");
        }
    }
}
