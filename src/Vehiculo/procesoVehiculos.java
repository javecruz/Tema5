package Vehiculo;

import java.util.Scanner;

public class procesoVehiculos {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        Vehiculo vehArray[] = new Vehiculo[10];
        int traccion;
        
        System.out.println("Dame modelo, si quieres acabar escribe fin");
        String mod = tec.nextLine();
        
        for (int i = 0; i < vehArray.length && mod.equalsIgnoreCase("FIN")==false; i++) {
            Vehiculo veh = new Vehiculo(mod);
            System.out.println("Dame potencia");
            veh.setPotencia(tec.nextDouble());
            System.out.println("Es tracción a las 4 ruedas? SI = 1 // NO = 2");
            traccion = tec.nextInt();
            while (traccion < 1 || traccion > 2) {
                System.out.println("Error, escribe 1 si tiene tracción a las cuatro ruedas o 2 si no lo tiene");
                traccion = tec.nextInt();
                
            }
            
            if (traccion == 1) {
                veh.setcRuedas(true);
            } else {
                veh.setcRuedas(false);
            }
            
            
            vehArray[i] = veh;
            
            System.out.println("Dame modelo, si quieres acabar escribe fin");
            mod = tec.nextLine();
            mod = tec.nextLine();
        }


        for(int i=0;i<vehArray.length && vehArray[i]!=null;i++){
        
        vehArray[i].imprimir();
        }
        
    }
    // BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
}
