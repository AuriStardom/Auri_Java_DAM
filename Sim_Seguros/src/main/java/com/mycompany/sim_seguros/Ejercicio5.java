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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("introduce el valor de las 3 reclamaciones:");
        int reclam_1 = sc.nextInt();
        int reclam_2 = sc.nextInt();
        int reclam_3 = sc.nextInt();
        
        int suma = reclam_1 + reclam_2 + reclam_3;
        
        int media = (reclam_1 + reclam_2 + reclam_3) / 3;
        
        boolean superaLimit = suma > 600;
        boolean polizaActiva = true;
        boolean sinFraude = true;
        
        boolean valid = (superaLimit && polizaActiva && sinFraude);
        
        System.out.println("La póliza es válida para pago: " + valid);
        
    }
    
}
