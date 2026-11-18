/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pokedex_ejercicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author auristar
 */
public class Pokedex_Ejercicio {

    public static void main(String[] args) {
        String[] pokedex = new String[156];
        int opc=0;
        Scanner sc = new Scanner(System.in);
        
        do {            
            
            
            System.out.println("-----------------");
            System.out.println("Pokedex Generation V");
            System.out.println("");
            System.out.println("1. Fill Pokedex Auto");
            System.out.println("2. Add Pokemon");
            System.out.println("3. Add Pokemon at position n");
            System.out.println("4. Delete Pokemon");
            System.out.println("5. Delete Pokemon at position n");
            System.out.println("6. Find Pokemon");
            System.out.println("7. Show all Pokemon");
            System.out.println("8. Get Pokemon at position n");
            System.out.println("9. Count Pokemon");
            System.out.println("10. Hack Pokedex");
            System.out.println("11. Erase Pokedex info");
            System.out.println("12. Exit");
            System.out.println("-----------------");
            opc=menu(sc);
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    
                    break;
                case 11:
                    
                    break;
                    
                default:
                    System.out.println("Option not valid");
            }
            
        } while (opc!=12);
    }
    
    public static int menu (Scanner sc){
        int op = sc.nextInt();
        
        return op;
    }
}
