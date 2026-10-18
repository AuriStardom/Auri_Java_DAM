/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.examen1auristela;
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
        
        System.out.println("introduzca sus 3 alquileres:");
        
        int alquiler1 = sc.nextInt();
        int alquiler2 = sc.nextInt();
        int alquiler3 = sc.nextInt();
        
        int alquiler_media = (alquiler1 + alquiler2 +alquiler3) / 3;
        int alquiler_suma = alquiler1+alquiler2+alquiler3;
        boolean superaLimite = (alquiler_suma > 600);
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        
        boolean Final = superaLimite && contratoFirmado && sinMultas;
        
        System.out.println("la media de los alquileres es de: " + alquiler_media + "€");
        System.out.println("El cliente puede realizar nuevas reservas: " + Final);
        
        
    }
    
}
