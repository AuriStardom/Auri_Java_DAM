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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Elige una categoría: Económico (1), EJecutivo (2), Independencia (3)");
        int categoriaVehiculo = sc.nextInt();
        boolean contrato = true;
        boolean valid = (categoriaVehiculo >=1 && categoriaVehiculo <=3);
        boolean Final = contrato && valid;
        
        System.out.println("Su respuesta es: " + Final);
        
        
    }
    
}
