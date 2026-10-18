/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sim_seguros;

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
        
        double empleado = 32.75;
        int min = 100;
        int max = 250;
        int range = max - min + 1;
        int empleados = (int) (Math.random() * range) + min;
        int cuota = 50;
        
        double coste = (empleados * empleado) + cuota;
        System.out.println("El coste final de las pólizas es de: " + coste);
        
        
    }
    
}
