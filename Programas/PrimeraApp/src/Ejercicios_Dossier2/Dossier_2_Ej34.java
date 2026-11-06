/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Dossier2;

/**
 *
 * @author Kirian Amador Guillén
 */

/*
Hacer un programa que muestre la secuencia de números: 71, 65,59,.., y que
pare cuando ya sean negativos
*/

public class Dossier_2_Ej34 {
    public static void main(String[] args) {
        int i;
        for(i = 71;i>=0; i = i-=6){
            System.out.println(i);
        }
    }
}
