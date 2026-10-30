/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaprog;

/**
 *
 * @author Kirian Amador Guillén
 */

/*
Se tienen tres variables, a, b y c. Escribe las asignaciones
necesarias para intercambiar sus valores, sean cuales sean,
de manera que:
b tome el valor de a
c tome el valor de b
a tome el valor de c
*/
public class Dossier_2_Ej12 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int aux = a;
        a = c;
        c = b;
        b = aux;
    }
}
