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
Hacer un programa que recibe un número entero mayor o igual a 10 y menor
o igual a 99 ( si el usuario introduce un número no válido se le pedirá que repita hasta que
lo haga bien ) , y se le muestre el número con las cifras invertidas. Por ej. si 34 se mostraría
en pantalla 43
*/

public class Dossier_2_Ej39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num < 10 || num > 99){
            System.out.println("Elija un numero entre 10 y 99 ambos inclusive: ");
            num = sc.nextInt();
            if(num < 10 || num > 99){
                System.out.println("Numero no valido, elija otro.");
            }
        }
        int decena = num / 10;
        int unidad = num % 10;
        
        int invertido = unidad * 10 + decena;
        System.out.println("El numero elejido invertido es: " + invertido);
        //Si el usuario introduce 10, no he conseguido que muestre "01" en lugar de "1".
    }
}
