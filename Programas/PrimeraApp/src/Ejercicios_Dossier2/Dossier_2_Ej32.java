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
Hacer un programa que reciba dos números enteros positivos del usuario y
muestre la suma de todos los números que hay entre esos dos números.
Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
5,6,7,8,9,10
y la suma de esos números es:
45
Hacer uso de un bucle for para este programa
*/

public class Dossier_2_Ej32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero entero: ");
        int num2 = sc.nextInt();
        int incremento;
        int suma = 0;
        System.out.println("Los numeros entre " + num1 + " y " + num2 + " son:");
        
        for(incremento = num1;incremento<=num2;incremento++){
            System.out.println(incremento);
            suma += incremento;
        }
        System.out.println("Y la suma total de estos numeros es: " + suma);
    }
}
