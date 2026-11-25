/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_3;

/**
 *
 * @author Kirian Amador Guillén
 */
public class Funcion_Comprobar_Edad {

    /**
     * la funcion trata de comprobar si una persona es mayor de edad o no
     * @param ed representa la edad de la persona
     * @return 
     */
    
    public static boolean esMayorEdad(int ed){
        boolean esMayorDeEdad;
        
        if(ed >= 18){
            esMayorDeEdad = true;
        }else{
            esMayorDeEdad = false;
        }
        
        return esMayorDeEdad;
    }
    
    public static void main(String[] args) {
        int ed = 15;
        System.out.println(esMayorEdad(ed));
    }
}