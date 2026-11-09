/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier2;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Kirian Amador Guillén
 */

/*
Hacer un programa que se emule un juego de lanzar 3 dados. En cada
iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza y
muestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5
*/

public class Dossier_2_Ej36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 'c';
        int dado1,dado2,dado3;
        int acumulado = 0;
        int sumaTotal = 0;
        int tiradas = 0;
        Random rnd = new Random();
        
        while(continuar!='f'&&continuar!='F'){
            dado1 = rnd.nextInt(6)+1;
            dado2 = rnd.nextInt(6)+1;
            dado3 = rnd.nextInt(6)+1;
            
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Dado 3: " + dado3);  
            acumulado = dado1 + dado2 + dado3;
            System.out.println("En esta tirada has acumulado " + acumulado + " puntos");
            sumaTotal += dado1 + dado2 + dado3;
            tiradas++;
            
            System.out.println("Desea seguir jugando?(F para rechazar): ");
            continuar = sc.next().charAt(0);
        }
        System.out.println("La suma total de puntos de todas las tiradas ha sido: " + sumaTotal + " puntos");
    }
}
