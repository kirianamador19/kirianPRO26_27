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
Se pretende imitar el comportamiento de un sistema de control por pin. El
usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
termina
Hacer 3 versiones de este código una con while, otra con do while y finalmente for
*/

public class Dossier_2_Ej33 {
    public static void main(String[] args) {
        //Comentar los bucles que no se quieran usar para la comprobación.
        Scanner sc = new Scanner(System.in);
        int pin = 2008;
        int intentos = 3;
        int intentoPin;
        boolean correcto = false;
        System.out.println("Tiene " + intentos + " intentos.");
        
        while(intentos!=0 && !correcto){
            System.out.println("Introduzca el pin de 4 digitos: ");
            intentoPin = sc.nextInt();
            
            if(intentoPin!=pin){
                System.out.println("Pin incorrecto, le quedan " + --intentos + " intentos.");
            }else{
                System.out.println("El codigo es correcto. Bienvenido");
                correcto = true;
            }
        }
        
        do{
            System.out.println("Introduzca el pin de 4 digitos: ");
            intentoPin = sc.nextInt();
            
            if(intentoPin!=pin){
                System.out.println("Pin incorrecto, le quedan " + --intentos + " intentos.");
            }else{
                System.out.println("El codigo es correcto. Bienvenido");
                correcto = true;
            }
        }while(intentos!=0 && !correcto);
        
        for(intentos=3;intentos>0&&!correcto;intentos--){
            System.out.println("Introduzca el pin de 4 digitos: ");
            intentoPin = sc.nextInt();
            
            if(intentoPin!=pin){
                System.out.println("Pin incorrecto, le quedan " + (intentos - 1) + " intentos.");
            }else{
                System.out.println("El codigo es correcto. Bienvenido");
                correcto = true;
            }
        }
    }
}