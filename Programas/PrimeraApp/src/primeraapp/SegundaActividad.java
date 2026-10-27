package primeraapp;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class SegundaActividad {
    
    
    public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Dame la ");
    int b = sc.nextInt();
    System.out.println("Dame la altura: ");
    int a = sc.nextInt();

    
    int resultado=b*a/2;
    System.out.println(resultado);
    
    
    }
}
