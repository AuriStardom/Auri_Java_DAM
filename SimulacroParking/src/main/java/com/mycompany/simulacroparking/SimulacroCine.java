/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.simulacroparking;


import java.util.Scanner;

/**
 *
 * @author auristar
 */
public class SimulacroCine {




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int numButacas = 10;
        int numSalas = 5;
        int[][] arrayCine = new int [numSalas][numButacas];
        int option = 0;
        int butaca = 0;
        int sala = 0;
        boolean loop = true;
        
        for (int i=0; i< arrayCine.length; i++) {
            for (int j=0; j< arrayCine[i].length; j++) {
                arrayCine[i][j] = 0;
            }
        }
        
        do {
        System.out.println();
        System.out.println("Por favor elije una opción:");
        System.out.println("1. Comprar entrada");
        System.out.println("2. Cancelar entrada");
        System.out.println("3. Mostrar estado de las salas");
        System.out.println("4. Sala con más butacas ocupadas");
        System.out.println("5. Salir del menú");
        System.out.println();
            System.out.print("introduzca la opción aqui: ");
            
        option = sc.nextInt();
        
        switch (option) {
            case 1:
                System.out.println("Por favor introduzca la sala (1-5)");
                sala = sc.nextInt();
                System.out.println("Por favor introduzca la butaca (1-10");
                butaca = sc.nextInt();
                
                if (arrayCine[sala-1][butaca-1] == 0) {
                    arrayCine[sala-1][butaca-1] = 1;
                    System.out.println("Entrada vendida. Butaca " + butaca + " de la sala " + sala + " ahora está ocupada.");
                }
                else if (arrayCine[sala-1][butaca-1] == 1) {
                    System.out.println("La butaca " + butaca + " de la sala " + sala + "ya está ocupada.");
                }
                
                break;
                
            case 2:
                 System.out.println("Por favor introduzca la sala (1-5");
                sala = sc.nextInt();
                System.out.println("Por favor introduzca la butaca (1-10");
                butaca = sc.nextInt();
                
                if (arrayCine[sala-1][butaca-1] == 1) {
                    arrayCine[sala-1][butaca-1] = 0;
                    System.out.println("Entrada cancelada. Butaca " + butaca + " de la sala " + sala + " ahora está libre.");
                }
                else if (arrayCine[sala-1][butaca-1] == 0) {
                    System.out.println("La butaca " + butaca + " de la sala " + sala + "ya estaba libre.");
                }
                
                break;
                
            case 3:
                
                for (int i=0; i< arrayCine.length; i++) {
                    System.out.print("Sala" + (i+1) + ": ");
                    for (int j=0; j< arrayCine[i].length; j++) {
                        System.out.print(arrayCine[i][j]);
                        System.out.print(", ");
                    }
                    System.out.println();
                }
                
                
                break;
                
            case 4:
                
                int salaSum = 0;
                int filaMax = 0;
                
                
                for (int i=0; i< arrayCine.length; i++) {
                   int contador = 0;
                    for (int j=0; j< arrayCine[i].length; j++) {
                        if (arrayCine[i][j] == 1) {
                            contador++;
                        }
                    }
                    
                    if (contador >= salaSum) {
                        salaSum = contador;
                        filaMax = i;
                    }
                    
                }
                System.out.println("La fila con más butacas es la fila " + filaMax);
                break;
                
            case 5:
                
                System.out.println("Saliendo del sistema.");
                loop = false;
                
                break;
                
                
            default:
                System.out.println("Respuesta inválida");
            }
        
        
        }    while (loop);
        
        
        
        
        
    }
    
}
