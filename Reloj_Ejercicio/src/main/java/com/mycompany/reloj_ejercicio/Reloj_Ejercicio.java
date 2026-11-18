/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reloj_ejercicio;
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author auristar
 */
public class Reloj_Ejercicio {

    public static void main(String[] args) {
        
        int[] reloj = new int[4];
        int opc;
        iniciarReloj(reloj);
        Scanner sc = new Scanner(System.in);
        
        do {            
            mostrarReloj(reloj);
            opc = menu(sc);
            switch (opc) {
                case 1: adelantarHora(reloj); break;
                case 2: retrasarHora(reloj); break;
                case 3: adelantarMinuto(reloj); break;
                case 4: retrasarMinuto(reloj); break;
            }
            
        } while (opc !=0);
        
        
    
     }
    
    public static void mostrarReloj(int[] reloj) {
        System.out.println("" + reloj[0] + reloj[1] + ":" + reloj[2] + reloj[3]);
    }
    public static void iniciarReloj(int[] reloj) {
        Arrays.fill(reloj, 0);
    }
    public static void adelantarHora(int[] reloj) {
        
        int hora = (reloj[0] * 10 + reloj[1]);
        hora = (hora+1) % 24;
        reloj [0] = hora/10;
        reloj [1] = hora%10;
    }
    public static void adelantarMinuto(int[] reloj) {
        
        int minuto = (reloj[2] * 10 + reloj[3]);
        minuto = (minuto+1) % 60;
        reloj[2] = minuto/10;
        reloj[3] = minuto%10;
    }
    public static void retrasarHora(int[] reloj) {
        
        int hora = (reloj[0] * 10 + reloj[1]);
        if (hora == 0) {
        hora = 23;
        }
        else hora = (hora-1) % 24;
        reloj [0] = hora/10;
        reloj [1] = hora%10;
    }
    public static void retrasarMinuto(int[] reloj) {
        
        int minuto = (reloj[2] * 10 + reloj[3]);
        if (minuto == 0) {
            minuto = 59;
        }
        else minuto = (minuto-1) % 60;
        reloj[2] = minuto/10;
        reloj[3] = minuto%10;
    }
    public static int menu (Scanner sc) {
        
        int op = 0;
        op = sc.nextInt();
        
        return op;
    }
    
    
}
