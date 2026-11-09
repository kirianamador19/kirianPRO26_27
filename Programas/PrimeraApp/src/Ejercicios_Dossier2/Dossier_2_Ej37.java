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
Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
que tiene en billetes.
*/

public class Dossier_2_Ej37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int billetes500,billetes200,billetes100,billetes50,billetes20,billetes10,billetes5;
        
        System.out.println("Cuantos billetes de 500 tiene?: ");
        billetes500 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 200 tiene?: ");
        billetes200 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 100 tiene?: ");
        billetes100 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 50 tiene?: ");
        billetes50 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 20 tiene?: ");
        billetes20 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 10 tiene?: ");
        billetes10 = sc.nextInt();
        
        System.out.println("Cuantos billetes de 5 tiene?: ");
        billetes5 = sc.nextInt();
        
        int resultado = (billetes500*500) + (billetes200*200) + (billetes100*100) + (billetes50*50) + (billetes20*20) + (billetes10*10) + (billetes5*5);
        System.out.println("Tiene " + resultado + " euros acumulados en billetes.");
    }
}
