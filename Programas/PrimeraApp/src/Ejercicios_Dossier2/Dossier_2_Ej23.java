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
Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
se mostrará el mensaje: “no hay solución real”
Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada
*/

public class Dossier_2_Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a resolver una ecuacion de segundo grado.");
        System.out.println("Dame el numero a: ");
        double a = sc.nextDouble();
        System.out.println("Dame el numero b: ");
        double b = sc.nextDouble();
        System.out.println("Dame el numero c: ");
        double c = sc.nextDouble();
        
        double interiorRaiz = (b * b) - (4 * a * c);
        
        if(interiorRaiz < 0){
            System.out.println("No hay solicon real.");
        }else{
            double x1 = (-b + Math.sqrt(interiorRaiz)) / (2 * a);
            double x2 = (-b - Math.sqrt(interiorRaiz)) / (2 * a);
            System.out.println("Solucion x1 = " + x1);
            System.out.println("Solucion x2 = " + x2);
        }
        
    }
}
