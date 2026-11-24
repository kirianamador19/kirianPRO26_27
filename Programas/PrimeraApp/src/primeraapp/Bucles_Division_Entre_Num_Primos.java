/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraapp;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Bucles_Division_Entre_Num_Primos {
    public static void main(String[] args) {
        int num = 120;
        int cociente = num;
        int divisor = 2;
        String resultado = "";
        //Punto de ruptura en la siguiente línea para Traza
        while(cociente > 1){
            while(cociente % divisor == 0){
                cociente /= divisor;
                resultado += divisor;
                if(cociente > 1){
                    resultado+= " x ";                
                }
            }
            divisor++;
        }
        System.out.println(num + " = " + resultado);
    }
}