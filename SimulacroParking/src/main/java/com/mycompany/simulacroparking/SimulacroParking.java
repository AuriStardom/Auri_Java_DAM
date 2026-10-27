/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulacroparking;
import java.util.Scanner;

/**
 *
 * @author auristar
 */
public class SimulacroParking {

    public static void main(String[] args) {
        
        boolean[][] parking = new boolean[4][10];
        int option;
        Scanner scan = new Scanner (System.in);
        int planta;
        int plaza;
        boolean loop = true;
        
        do {  
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Ocupar una plaza");
            System.out.println("2. Liberar una plaza");
            System.out.println("3. Mostrar estado del Parking");
            System.out.println("4. Plazas libres y ocupadas por planta");
            System.out.println("5. Salir del sistema ");
            System.out.println("--------------------------------");
            System.out.print("Please enter an opción: ");
            option = scan.nextInt();
            if (option<1||option>5) {
                System.out.println("Opción invalida");
            }
            switch (option) {
                case 1:
                    do {
                    System.out.println("A que planta desea aparcar? 1-4");
                    planta = scan.nextInt();
                    if (planta<1||planta>4) {
                            System.out.println("planta invalida");}
                    } while (planta<1||planta>4);
                            
                    plaza = 1;
                    
                    while (plaza <=10 && parking[planta-1][plaza-1]) {
                        plaza++;
                    }
                    if(plaza <=10) {
                        parking[planta-1][plaza-1] = true;
                        System.out.println("\nVehículo aparcado en la planta "+planta+", en la plaza "+plaza);
                    } else System.out.println("No hay plazas disponibles en la planta "+planta);
                    break;
                    
                case 2:
                    do {
                    System.out.println("Por favor introduzca la planta:");
                    planta = scan.nextInt();
                    if (planta<1||planta>4) {
                            System.out.println("planta invalida");}
                    } while (planta<1||planta>4);
                    System.out.println("Por favor introduzca la plaza: ");
                    do {
                    plaza= scan.nextInt();
                    if (plaza<1||plaza>10) {
                            System.out.println("plaza invalida");}
                    } while (plaza<1||plaza>10);
                    
                    if (parking[planta-1][plaza-1]){
                        parking[planta-1][plaza-1]=false;
                        System.out.println("La plaza "+plaza+" en la planta "+planta+" se ha liberado.");
                    }else System.out.println("La plaza ya está libre.");
                    break;
                    
                    
                case 3:
                    planta = 4;
                    plaza = 10;
                    
                    for (int i=0; i < planta; i++) {
                        System.out.print("\nplanta "+(i+1) + ": ");
                        for (int j=0; j < plaza; j++) {
                            String texto = parking[i][j] ? "ocupada" : "libre";
                            System.out.print(texto+", ");
                        }
                    }
                    System.out.println();
                break;
                
                case 4:
                    
                    plaza=10;
                    int ocupadasum=0;
                    int liberadasum=0;
                    do {
                    System.out.println("Por favor, eliga la planta. 1-4");
                    planta = scan.nextInt();
                    if (planta <1 || planta > 4) {
                        System.out.println("Planta invalida");
                    }
                    } while (planta < 1 || planta > 4);
                    
                        for(int i=0; i<plaza;i++) {
                            if(parking[planta-1][i]==true){
                                ocupadasum++;
                            }
                            else liberadasum++;
                       }
                    System.out.println("Planta "+planta+"- Ocupadas: "+ocupadasum+"|Libres: "+liberadasum);
                    break;
                case 5:
                    loop = false;
                    
            }
        } while (loop);
        System.out.println(); 
        System.out.println("Saliendo del sistema");
        
        
        
        
        
        
        
        
        
    }
}
