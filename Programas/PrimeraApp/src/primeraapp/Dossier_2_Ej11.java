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
Introducir en un código java de NetBeans las siguientes líneas:
int x,y;
        x= 3;
        y= 4;
        y *= ++x;
        System.out.println("x=" + x +" y=" + y);
        /*
        ¿ qué resultado sale para los valores x e y ?
        
        Sale x=4 y=16
*/
public class Dossier_2_Ej11 {
    public static void main(String[] args) {   
        /*
        Escribe las líneas de código equivalentes si no
        usáramos el operador incremento: ++ ni el operador
        de asignación combinado: *=
        */
        
        int x,y;
        x= 3;
        y= 4;
        x= x+1;
        y = y*x;
        System.out.println("x=" + x +" y=" + y);
        
    }
}
