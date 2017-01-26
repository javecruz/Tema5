/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import java.util.Scanner;

/**
 *
 * @author AlumMati
 */
public class PruebaAlumno {
    
    
    public static void main (String[] args){
    
    Scanner tec = new Scanner(System.in);    
        
        
    Alumno alu1 = new Alumno();
    alu1.setNombre("Juan");
    alu1.setApellidos("García Fernández");
    alu1.setAnoDeNacimiento(1987);
    alu1.setNumeroPersonal(987465);
    alu1.setGrupo("4546");
    alu1.setHorario('M'); 
    alu1.imprimir();
    System.out.println("\n\n\n");
    
  
    
    Alumno alu2 = new Alumno("Ana", "Cardo", 654, 54, "1564", 'M',5.5f);
    alu2.imprimir();
        System.out.println("\n\n\n");
        
        
    Alumno alu3 = new Alumno();
        
        System.out.println("Grupo");
        alu3.setGrupo(tec.nextLine());
        System.out.println("Dame nombre");
        alu3.setNombre(tec.nextLine());
        System.out.println("Dame apellidos");
        alu3.setApellidos(tec.nextLine());
        System.out.println("Horario");
        alu3.setHorario(tec.nextLine().charAt(0));
        System.out.println("Dame año nacimiento");
        alu3.setAnoDeNacimiento(tec.nextInt());
        System.out.println("Numero personal");
        alu3.setNumeroPersonal(tec.nextInt());
        System.out.println("Dame nota selectividad");
        alu3.setNotaSelect(tec.nextFloat());
        
        alu3.imprimir();
        
        
        
    
     
    
    
    
        
        
        
    
    
    
    }
}
