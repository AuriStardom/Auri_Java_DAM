/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1auristela;


/**
 *
 * @author auristar
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double precio_base = 95.00;
       double IVA = 0.21;
       
       double precio_final = precio_base + (precio_base * IVA);
       System.out.println("EL precio final es: " + precio_final + "€");
        
        
    }
    
}
