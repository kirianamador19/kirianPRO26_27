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
public class Factorial_en_Funcion {
    public static int abs(int num){
        if(num < 0){
            num *= -1;
        }
        
        return num;
    }
    
    /**
     * 
     * @param num
     * @return 
     */
    public static int factorial(int num){
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
            // factorial(5) 1*2*3*4*5
            //5*4*3*2
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de factorial");
        System.out.println("Dame un numero entero: ");
        int num = sc.nextInt(); sc.nextLine();
        num = abs(num);
        
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}
