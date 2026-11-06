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
Sabiendo que:
    char letra = 'a';
    letra++;
    System.out.println(letra);
nos muestra la letra ‘b’ tenemos una forma para ir mostrando las diferentes letras
incrementando una variable. Usar un bucle for y mostrar en pantalla la secuencia de las 10
primeras letras del abecedario ( todas en minúscula)
*/

public class Dossier_2_Ej35 {
    public static void main(String[] args) {
        for(char letra = 'a'; letra<'a'+10;letra++){
            System.out.println(letra);
        }
    }
}
