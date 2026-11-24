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
public class Decorador_Textos {
    public static String decorarTexto (String texto){
        String asteriscos = "";
        for (int i = 0; i < texto.length()+2; i++) {
            asteriscos += "*";
        }
        
        String textoDecorado = asteriscos + "\n*" + texto + "*\n" + asteriscos;
        return textoDecorado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un texto para decorarlo: ");
        String texto = sc.nextLine();
        
        String textoDecorado = decorarTexto(texto);
        System.out.println(textoDecorado);
    }
}
