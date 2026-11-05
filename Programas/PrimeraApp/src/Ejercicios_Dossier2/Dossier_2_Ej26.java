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
Escribe un programa que pida por teclado un día de
la semana ( ún número entero del 1 al 5 que representa
de lunes a viernes ) y que diga qué asignatura toca a primera
hora ese día.
*/

public class Dossier_2_Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un dia de la semana entre Lunes y Viernes(1-5): ");
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1: System.out.println("A primera hora el lunes toca SSF.");break;
            case 2: System.out.println("A primera hora el martes toca LND.");break;
            case 3: System.out.println("A primera hora el miercoles toca BAE.");break;
            case 4: System.out.println("A primera hora el jueves toca IKL.");break;
            case 5: System.out.println("A primera hora el viernes toca LND.");break;
            default: System.out.println("Dia lectivo no valido");break;
        }
    }
}
