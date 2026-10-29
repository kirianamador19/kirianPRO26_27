/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Dossier_2_Ej18 {
    public static void main(String[] args) {
        int euroHora = 18;
        
        System.out.println("Cuántas horas ha trabajado esta semana?: ");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
        
        int salario = euroHora * horas;
        System.out.println("Su salario semanal es: " + salario);
    }
}