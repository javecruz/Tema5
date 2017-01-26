package Pantanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PantanoProceso {

    public static void main(String[] args) {

        try {
            
            BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
            Pantano pantArray[] = new Pantano[10];
            
            String nom = "";
            int total;
            int actual;
            
            
            //empiezo a rellenar el array
            System.out.println("Dame el nombre del pantano, si quieres parar pon FIN");
            try {
                nom = tec.readLine();
            } catch (IOException ex) {
                Logger.getLogger(PantanoProceso.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (int i = 0; i < pantArray.length && nom.equalsIgnoreCase("fin")==false; i++) {
                
                try {
                    
                    //guardo los datos en variables porque el constructor requiere de parametros
                    System.out.println("Dame la capacidad total del pantano");
                    total = Integer.parseInt(tec.readLine());
                    System.out.println("Dame la cantidad actual de agua del pantano");
                    actual = Integer.parseInt(tec.readLine());
                    
                    //creo objeto con las variables anteriores como parametros
                    Pantano pant = new Pantano(nom, total, actual);
                    
                    //asigno objeto al indice del array
                    pantArray[i] = pant;
                    
                    System.out.println("Dame el nombre del pantano, si quieres parar pon FIN");
                    nom = tec.readLine();
                    
                } catch (IOException ex) {
                    Logger.getLogger(PantanoProceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println("DATOS SIN ORDENAR");
            for(int i=0;i<pantArray.length && pantArray[i]!=null;i++){
                
                // metodo imprimir pide parametro del % de ocupacion del pantano, y eso lo saco del método ocupacion.
                pantArray[i].imprimir(pantArray[i].ocupacion());
                
            }
            System.out.println("");
            
            
            
            
            ordenar(pantArray);
            
            System.out.println("DATOS ORDENADOS");
            for(int i=0;i<pantArray.length && pantArray[i]!=null;i++){
                
                // metodo imprimir pide parametro del % de ocupacion del pantano, y eso lo saco del método ocupacion.
                pantArray[i].imprimir(pantArray[i].ocupacion());
                
            }
            System.out.println("");
            //ahora aumentara la capacidad
            String pantIncre = "";
            int cantidad = 0;
            
            System.out.println("Quieres incrementar al agua actual de algun pantano? SI o NO");
            String aux1 = tec.readLine();
            
            
            
            if (aux1.equalsIgnoreCase("si")) {
            do{
                System.out.println("De qué pantano quieres aumentar , dime el NOMBRE del pantano, fijate en la lista impresa anteriormente");
                pantIncre = tec.readLine();
                System.out.println("Escribe la cantidad que quieras incrementar");
                cantidad = Integer.parseInt(tec.readLine());
                
                for(int i=0;i<pantArray.length && pantArray[i]!=null;i++){
                    if(pantArray[i].getNombre().equalsIgnoreCase(pantIncre) && pantArray[i].getCapacidadActual() + cantidad <= pantArray[i].getCapacidadTotal()){
                    
                        // ahora modifico la cantidad actual, si se cumple la condicion anterior, es decir, que coincida el nombre introducido y que la cantidad actual más la que se quiere incrementar no superere la total, para ello utilizo el metodo set ya que los atributos de clase son privados y es la única forma de hacerlo
                        pantArray[i].setCapacidadActual(cantidad+pantArray[i].getCapacidadActual());
                        
                    }
                
                    
                }
                
                
                
                
            System.out.println("Quieres incrementar al agua actual de algun otro pantano? SI o NO");
            aux1 = tec.readLine();
            }while (aux1.equalsIgnoreCase("si"));
            
            }
            System.out.println("");
            
            
            // como he podido modificar las cantidades actuales vuelvo a ordenar e imprimir
            ordenar(pantArray);
            for(int i=0;i<pantArray.length && pantArray[i]!=null;i++){
                
                // metodo imprimir pide parametro del % de ocupacion del pantano, y eso lo saco del método ocupacion.
                pantArray[i].imprimir(pantArray[i].ocupacion());
                
            }
            
            
            
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(PantanoProceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    

    }
    
    
    public static void ordenar(Pantano pantArray[]){
    
    Pantano aux; // esto o Pantano aux = new Pantano(); es lo mismo, he creado el constructor sin parametros sólo para esto ya que si no lo creo coge por defecto el otro, pero si no creo ninguno por defecto está el normal, sin parametros.
        // ORDENO EL ARRAY
        for(int i=0;i<pantArray.length-1 && pantArray[i]!=null;i++){
            for(int j=i+1;j<pantArray.length && pantArray[j]!=null;j++){
                
                if(pantArray[i].getCapacidadActual()>pantArray[j].getCapacidadActual()){
                aux = pantArray[i];
                pantArray[i] = pantArray[j];
                pantArray[j]= aux;
                    
                }
            
            }
        
        }
    
        
        
    
    }
    
   
    

}
