package Alumno;

import java.util.Scanner;

public class PruebaAlumnoConFor {
    
    
    public static void main (String[] args) {
    
    Scanner tec = new Scanner(System.in);
    
    
    Alumno aluArray[] = new Alumno[3];  // es para el array
    
    for(int i = 0 ;i<aluArray.length;i++){
        Alumno alu = new Alumno(); // me creara un objeto alumno por cada iteracion
        System.out.println("Grupo");
        alu.setGrupo(tec.nextLine());
        System.out.println("Dame nombre");
        alu.setNombre(tec.nextLine());
        System.out.println("Dame apellidos");
        alu.setApellidos(tec.nextLine());
        System.out.println("Horario");
        alu.setHorario(tec.nextLine().charAt(0));
        System.out.println("Dame año nacimiento");
        alu.setAnoDeNacimiento(tec.nextInt());
        System.out.println("Numero personal");
        alu.setNumeroPersonal(tec.nextInt());
        System.out.println("Dame nota selectividad");
        alu.setNotaSelect(tec.nextFloat());
        
        aluArray[i]= alu;
    
    }
    
    
    float notaMedia = 0;
    
    
    for (int i = 0;i<aluArray.length;i++) {     // incluido punto 3.
    notaMedia += aluArray[i].getNotaSelect();
    aluArray[i].imprimir();
    
    if(i==aluArray.length-1){   
        
        System.out.println("La nota media es " + notaMedia/aluArray.length);
    }
    
    }
    
    
    
    
    
    
    
    
    }
    
    
    
}
