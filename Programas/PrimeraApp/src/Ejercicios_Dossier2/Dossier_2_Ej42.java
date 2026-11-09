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
Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
siguiente número de horas:
10, 100, 100, 20, 20
Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
trabajada a: 40€
 Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
la cuadrilla y el número de horas que haya realizado cada uno de los participantes
*/

public class Dossier_2_Ej42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero total se pagara por el encargo?: ");
        int dineroTotal = sc.nextInt();
        System.out.println("Cuantos trabajadores han participado?: ");
        int cantidadTrabajadores = sc.nextInt();
        int horasTrabajadores;
        int totalHoras = 0;
        
        for(int i = 1; i <= cantidadTrabajadores; i++){
            System.out.println("Cuantas horas ha trabajado el trabajador " + i + "?:");
            horasTrabajadores = sc.nextInt();
            totalHoras += horasTrabajadores;
        }
        
        System.out.println("Cada hora de trabajo sale " + dineroTotal/totalHoras);
    }
}
