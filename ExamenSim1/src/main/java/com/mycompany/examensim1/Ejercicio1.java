package com.mycompany.examensim1;
public class Ejercicio1 {
    public static void main(String[] args) {
        //escribe aqui tu codigo
        
        double IVA = 0.21;
        double menu = 18.50;
        
        double final_price = menu + (menu * IVA);
        
        System.out.printf("Precio final con IVA: %.2f €", final_price);
        
        
    }
}
