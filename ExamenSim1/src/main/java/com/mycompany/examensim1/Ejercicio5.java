package com.mycompany.examensim1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("introduce los 3 pedidos:");
        
        double domici1 = scanner.nextDouble();
        double domici2 = scanner.nextDouble();
        double domici3 = scanner.nextDouble();
        
        double suma = domici1+domici2+domici3;
        double media = suma/3;
       
        System.out.printf("mediana: %.2f euros \n ", media);
        
        boolean preciofinal = suma > 80;
        
        System.out.println("El gasto total ha superado los 80€: " + preciofinal);
        
        
    }
}