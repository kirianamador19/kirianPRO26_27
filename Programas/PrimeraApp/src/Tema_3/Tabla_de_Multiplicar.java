/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3;

import java.util.Scanner;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Tabla_de_Multiplicar {
    public static String tablaDeMultiplicar(int num){
        String texto = "";
        int resultado;
        for (int i = 1; i <= 10; i++) {
            resultado = num*i;
            texto += String.format("%d x %02d = %02d\n", num, i, resultado);
        }
        return texto;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabla de multiplicar.");
        int num;
        do{
            System.out.println("Dame un numero entre 2 y 10: ");
            num = sc.nextInt();sc.nextLine();
        }while(num < 2 || num > 10);
        
        String comprobacion = tablaDeMultiplicar(num);
        System.out.println(comprobacion);
    }
}
