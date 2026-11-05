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
Hacer un programa que el usuario vaya introduciendo números enteros. El
programa finaliza cuando el usuario introduce el número 0. En ese momento se le muestra
la suma total de los números positivos y la suma total de los números negativos
*/

public class Dossier_2_Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numPositivos = 0;
        int numNegativos = 0;
        boolean fin = false;
        
        while(fin!=true){
            System.out.println("Dame un numero entero: ");
            int num = sc.nextInt();
            
            if(num==0){
                fin = true;
            }else if(num<0){
                numNegativos = numNegativos + num;
            }else if(num>0){
                numPositivos = numPositivos + num;
            }
        }
        
        if(numPositivos>0 || numNegativos<0){
            System.out.println("Suma de numeros positivos: " + numPositivos);
            System.out.println("Suma de numeros negativos: " + numNegativos);
        }else{
            System.out.println("No se ha introducido ningun numero positivo ni negativo");
        }
    }
}