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
        
        int pila_total = 10;
        int cima = -1;
        
        
        int[] pila = new int[pila_total];
        Arrays.fill(pila, -1);
        int opc;
        Scanner sc = new Scanner(System.in);
        
        
         do {   
        
        System.out.println("Selecciona una opción (1-4) o 0 para salir:");
        System.out.println();
        System.out.println("1.- Apilar");
        System.out.println("2.- Desaplilar");
        System.out.println("3.- Mostrar Primero");
        System.out.println("4.- Mostrar Último");
        System.out.println("-------------------");
        
                
            opc = menu(sc);
            switch (opc) {
                case 1: //apilar(array);
                    
                    cima= apilar(pila,cima, sc);
                    
                break;
                    
                    
                case 2: //desapilar(array); 
                    
                    cima = desapilar(pila,cima);

                    
                    break;
                    
                case 3: //mostrarPrimero(array); 
                    
                    mostrarPrimero(pila, cima);
                    break;
                    
                case 4: //mostrarUltimo(array); 
                    
                    
                    mostrarUltimo(pila, cima);
                    break;
                     
            }
            
        } while (opc != 0);
    }

    public static int menu(Scanner sc) {
        int op=0;
        op = sc.nextInt();
        return op;
    }
    public static int apilar(int[] pila, int cima, Scanner sc) {
                    
                    if (cima < pila.length-1) {
                        System.out.println("Introduce un número:");
                        int pila_apilar = sc.nextInt();
                        cima++;
                        pila[cima] = pila_apilar;
                            }
                    else {
                        System.out.println("La pila está llena");
                        }
                    
                    return cima;
                    }
    
    public static int desapilar(int[] pila, int cima) {
        
        if (cima > -1) {
            pila[cima] = -1;
            cima--;
        }
        else {
            System.out.println("La pila está vacía");
        }
        return cima;
    }
    
    public static void mostrarPrimero(int[] pila, int cima) {
        if(cima == -1) {
            System.out.println("La pila está vacia.");
        }
        else{
        System.out.println(pila[0]);
        }
    }
    public static void mostrarUltimo(int[] pila, int cima) {
         if(cima == -1) {
            System.out.println("La pila está vacia.");
        }
        else{
        System.out.println(pila[cima]);
        }
    }
    
    
    
}
