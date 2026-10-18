/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1auristela;
import java.util.Random;

/**
 *
 * @author auristar
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                Random random = new Random();

        
        double daily = 42.75;
        int alquiler = random.nextInt(10)+5;
        int gestion = 35;
        
        double precio_final = (daily * alquiler) + gestion;
        System.out.println("el precio final del alquiler es de: " + precio_final + "€");
        
        
        
    }
    
}
