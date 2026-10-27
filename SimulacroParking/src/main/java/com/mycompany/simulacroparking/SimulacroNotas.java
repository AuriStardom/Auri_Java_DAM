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
public class SimulacroNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaraciones
        int numAlumnos = 10;
        int numModulos = 4;
        int[][] arraynotas = new int [numModulos][numAlumnos];
        int option;
        int base =-1;
        int modulo;
        
        boolean loop =true;
        Scanner sc=new Scanner(System.in);
        
        for (int i=0; i<arraynotas.length; i++) {
            for (int j=0; j<arraynotas[i].length; j++) {
                arraynotas[i][j] = base;
              }
        }
        
        //Programa
        
        do {            
            
            System.out.println();
            System.out.println("--------------------------------");
            System.out.println("1. Añadir nota");
            System.out.println("2. Media de notas x modulo");
            System.out.println("3. Alumno con nota más alta x modulo");
            System.out.println("4. Porcentaje de aprovados");
            System.out.println("5. Salir del sistema");
            System.out.println("6. estado lista");
            System.out.println("--------------------------------");
            System.out.print("Por favor, introduzca una opción:"); 
            option = sc.nextInt();
            
            
            switch (option) {
                case 1:
                   int numAlumno = 0;
                       System.out.println("Ingrese numero de alumno(1-10) o 0 para sortir");
                       numAlumno = sc.nextInt();
                       
                       if(numAlumno == 0) break;
                       
                       if (numAlumno < 1 || numAlumno > 10) {
                           System.out.println("Numero de alumno no valido :(");
                       }
                       int idAlumno = numAlumno - 1; //Just Dejar claro esta resta bb
                       String opcionContinuar;
                       
                       do {
                           modulo = 0;
                           
                           while (true) {
                               System.out.println("Ingrese modulo");
                               modulo = sc.nextInt();
                               if (modulo >= 1 &&  modulo <4) break;
                           }
                           int nota = 0;
                           
                           while (true) {
                               System.out.println("Ingrese nota");                               
                               nota = sc.nextInt();
                               if (nota >= 1 &&  modulo <=10) break;
                           }
                           
                           arraynotas[modulo-1][idAlumno] = nota;
                           System.out.println("Guardada Notal");
                           
                           while (true){
                               System.out.println("Desea Asignar otra nota a este estudiante? S o N: ");
                               opcionContinuar = sc.next().trim().toUpperCase();
                           
                               if(opcionContinuar.equals("S")){
                                   opcionContinuar ="S";
                                   break;
                               } else if (opcionContinuar.equals("N")){
                                   opcionContinuar = "N";
                                   break;
                               }
                               System.out.println("S o N Si us plau");
                           
                           }
                       }while(opcionContinuar.equalsIgnoreCase("S"));
                break;
                
                case 2:
                    
                    int veces = 0;
                    double avgsum = 0.0;
                    
                    System.out.println("Por favor eliga el módulo: (1-4)");
                    
                    modulo = sc.nextInt();
                    
                    for (int i=0; i< arraynotas[modulo-1].length; i++) {
                        
                        System.out.println(arraynotas[modulo-1][i]);
                        
                        if(arraynotas[modulo-1] [i]>-1) {
                            avgsum += arraynotas[modulo-1][i];
                            veces++;
                        }
                    }
                    System.out.println("Veces " +  veces + "Avgsum " + avgsum);
                    double avgalumnos = avgsum/veces;
                    System.out.println("La nota media del modulo " + modulo + " es " + avgalumnos);
                    
                    break;
                    
                case 3:
                    System.out.println("Por favor eliga el módulo: (1-4)");
                    
                    modulo = sc.nextInt();
                    
                    int notaAlta = arraynotas[modulo-1][0];
                    
                    for (int i= 0; i< numAlumnos; i++) {
                        if (arraynotas[modulo-1][i] > notaAlta) {
                            notaAlta= arraynotas[modulo-1][i];
                        }
                    }
                    System.out.println("La nota más alta del módulo es " + notaAlta);
                    
                    break;
                    
                case 4:
                    System.out.println("Por favor eliga el módulo: (1-4)");
                    
                    modulo = sc.nextInt();
                    double alumnosum = 0;
                    
                    for (int i= 0; i< numAlumnos; i++) {
                        if (arraynotas[modulo-1][i]>= 5) {
                            alumnosum++;
                            System.out.println(alumnosum);
                        }     
                    }
                    double porcentaje = (alumnosum/numAlumnos)*100;
                    
                    System.out.println("El procentaje de aprobados del módulo " + modulo + " es del "+ porcentaje + "%");
                    
                    break;
                    
                case 5:
                    System.out.println("Saliendo del sistema.");
                    loop = false;
                    
                    
                    break;
                    
                default:
                    System.out.println("Respuesta inválida");
                
                case 6:
                    
                    for (int i=0; i < numModulos; i++) {
                        System.out.print("\nmodulo "+(i+1) + ": ");
                        for (int j=0; j < numAlumnos; j++) {
                             System.out.print(arraynotas[i][j]);
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                break;
            }
            
            
        } while (loop);
        
        
        
        
    }
    
}
