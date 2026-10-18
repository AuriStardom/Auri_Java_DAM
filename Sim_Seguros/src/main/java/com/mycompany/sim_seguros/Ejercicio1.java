/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sim_seguros;

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
        
        int prima_base = 45;
        int cobertura_add = 8;
        double IVA = 0.21;
        
        double prima_final = ((prima_base + cobertura_add)*IVA)+(prima_base + cobertura_add);
        System.out.println("El precio final es: " + prima_final);
        
        
    }
    
}
