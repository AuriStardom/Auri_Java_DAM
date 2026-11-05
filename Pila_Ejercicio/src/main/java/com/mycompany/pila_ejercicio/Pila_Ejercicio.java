/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pila_ejercicio;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author auristar
 */
public class Pila_Ejercicio {

    public static void main(String[] args) {
        int array[] = new int[10];
        Arrays.fill(array, -1);
        int opc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Selecciona una opción (1-4) o 0 para salir:");
        System.out.println();
        System.out.println("1.- Apilar");
        System.out.println("2.- Desaplilar");
        System.out.println("3.- Mostrar Primero");
        System.out.println("4.- Mostrar Último");
        System.out.println("-------------------");
        
        do {            
            opc = menu();
            switch (opc) {
                case 1: //apilar(array); 
                    break;
                    
                case 2: //desapilar(array); 
                    break;
                    
                case 3: //mostrarPrimero(array); 
                    break;
                    
                case 4: //mostrarUltimo(array); 
                    break;
                     
            }
            
        } while (opc != 0);
    }

    public static int menu() {
        int op=0;
        Scanner sc = new Scanner(System.in);
        op = sc.nextInt();
        System.out.println(op);
        return op;
    }
}
