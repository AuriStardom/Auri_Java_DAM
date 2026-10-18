package com.mycompany.examensim1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione su asiento: Terraza (1), Interior (2), VIP (3)");
        
        int tipoMesa = scanner.nextInt();
        
        boolean respuesta = (tipoMesa >=1 && tipoMesa <= 3);
        
        
        System.out.println("Su mesa es válida: " + respuesta);
        
        
        
    }
}