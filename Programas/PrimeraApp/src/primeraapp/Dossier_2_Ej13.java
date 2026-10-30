/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprog;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */

//Sea el siguiente pgrograma:

public class Dossier_2_Ej13 {
    public static void main(String[] args) {
       Scanner cin = new Scanner(System.in);
       System.out.println("Introduzca un número mayor que 5 ");
       int numero = cin.nextInt();
       boolean comparaCon5;
       comparaCon5 = numero > 5;
       System.out.println("Es " + comparaCon5 + " que el número sea mayor que 5"); 
    
    /*
       Ejecutarlo e introducir un número mayor que 5 ¿ qué
       mensaje muestra ? Ahora introduce un número menor
       que 5 ¿ qué mensaje muestra ahora ?.
       
       Muestra: Es true que el número es mayor que 5
       Muestra: Es false que el número es mayor que 5
       
       */
    
    }
}
