/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3;

import java.util.Date;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Clase2026_11_25 {
    
    public static String saludo(){
        String texto = "Buenos dias, hoy comenzamos la actividad a las: " + new Date();
        return texto;
    }
    
    public void mostrarMensajeEnPantalla(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        System.out.println(saludo());
    }
}
