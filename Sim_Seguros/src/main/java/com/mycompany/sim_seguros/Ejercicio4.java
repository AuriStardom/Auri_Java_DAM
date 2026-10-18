/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sim_seguros;
import java.util.Scanner;

/**
 *
 * @author auristar
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Seleccione su cobertura: Básica(1), Estándar (2), o Premium (3)");
      
       int tipoCobertura = sc.nextInt();
       
       boolean respuesta = (tipoCobertura >= 1 && tipoCobertura <= 3);
       
       System.out.println("La selección es: " + respuesta);
       
        
        
    }
    
}
