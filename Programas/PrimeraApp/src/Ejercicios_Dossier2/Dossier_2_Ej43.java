/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */

/*
Escribir un programa donde se genera un número secreto mayor o igual a 1 y
menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
informa de si el número secreto es mayor o menor que el que él ha introducido. El
programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
intentos que ha necesitado para acertar.
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29
*/

public class Dossier_2_Ej43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int secreto = rnd.nextInt(99) + 1;
        int num = 0;
        int intentos = 0;
        
        while(num != secreto){
            System.out.println("Introduce un numero entre 1 y 99:");
            num = sc.nextInt();
            intentos++;

            if(num < secreto){
                System.out.println("El numero secreto es mayor.");
            }else if(num > secreto){
                System.out.println("El numero secreto es menor.");
            }
            
            System.out.println("Correcto, has acertado el numero.");
            System.out.println("Numero de intentos: " + intentos);
        }
    }
}
