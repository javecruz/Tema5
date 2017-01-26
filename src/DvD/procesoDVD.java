package DvD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class procesoDVD {
    
    
    public static void main(String[] args){
    
        try {
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            //String titulo, String actores, String director, String genero, int duracion, String resumen
            System.out.println("Dame el titulo de la peli");
            String titulo = tec.readLine();
            System.out.println("Dame los actores en este formato: Actor1, actor2, actor3...");
            String actores = tec.readLine();
            System.out.println("Dame el director");
            String director = tec.readLine();
            System.out.println("Dame el género");
            String genero = tec.readLine();
            System.out.println("Dame la duración");
            int dur = Integer.parseInt(tec.readLine());
            System.out.println("Dame el resumen");
            String resumen = tec.readLine();
            System.out.println("");
            
            //creo objeto
            DVDCine pel = new DVDCine(titulo, actores, director, genero, dur, resumen);
            
            //uso metodo imprimir del objeto
            pel.muestraDVDCine(dur);
            
            //es Thriller?
            System.out.println("Es thriller?");
            if(pel.esThriller(genero)==true) {
                System.out.println("La peli es un thriller");
            }else {
                System.out.println("La peli NO es un thriller");
            }
            System.out.println("");
            
            System.out.println("Tiene resumen?");
            if(pel.tieneResumen(resumen)==true){
                System.out.println("Pues claro que tiene resumen no lo has visto ya justo unas lineas más arriba?");
            }
            else{
                System.out.println("No tiene resumen..");
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(procesoDVD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
}
