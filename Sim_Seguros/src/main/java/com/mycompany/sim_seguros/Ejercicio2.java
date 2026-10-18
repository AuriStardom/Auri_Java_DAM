/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sim_seguros;

/**
 *
 * @author auristar
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int euro = 1;
        double dollar = 1.15;
        double impuesto= 2.50;
        double conversion = (euro * 150 - impuesto) * dollar;
        System.out.printf("La conversión saldria a %.2f dólares", conversion);
        
        
    }
    
}
