package ActividadCompania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proceso {

    public static void main(String[] args) {

        Empresa Carrefour = new Empresa();
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        int opt = 0;

        do {
            do {
                System.out.println("***** MENÚ PRINCIPAL *****");
                System.out.println("1 = Añadir empleado");
                System.out.println("2 = Eliminar empleado");
                System.out.println("3 = Subir sueldo 10% a mayor 10 años antigüedad");
                System.out.println("4 = Imprime lista de la empresa con todos los empleados");
                System.out.println("5 = Ordena los empleados por antigüedad y los imprime // MANTIENE el array original si luego imprimes la opcion 4");
                System.out.println("6 = Salir del programa");
                System.out.println("*********** FIN ***********");
                try {
                    opt = Integer.parseInt(tec.readLine());
                } catch (IOException ex) {
                    Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (opt < 1 || opt > 6) {
                    System.out.println("ERROR, vuelva introducir número");
                }
            }while(opt<1 || opt>6);
            

            switch (opt) {

                case 1:
                    String nombre = null;
                    System.out.println("Dame el nombre del empleado");
                     {
                        try {
                            nombre = tec.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    String dni = null;
                    System.out.println("Dame el dni");
                     {
                        try {
                            dni = tec.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    char estado = 0;
                    System.out.println("Estado Civil: S = Soltero o C = Casada ");
                     {
                        try {
                            // Cómo leer char con buffered scanner.
                            estado = tec.readLine().charAt(0);
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    int anioIngreso = 0;
                    System.out.println("Dame el año de ingreso de empleado");
                     {
                        try {
                            anioIngreso = Integer.parseInt(tec.readLine());
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    float sueldo = 0;
                    System.out.println("Dame el sueldo bruto del empleado");
                     {
                        try {
                            sueldo = Float.parseFloat(tec.readLine());
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    Empleado emp = new Empleado(nombre, dni, estado, anioIngreso, sueldo);
                    //llamo al método
                    Carrefour.añadirE(emp);

                    break;

                case 2:
                    String eli = null;
                    System.out.println("Dame el dni del empleado que quieras eliminar, esta vez soy bueno y lo voy a validar vale? :DDD no te acostumbres");
                     {
                        try {
                            eli = tec.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    Carrefour.eliminarE(eli);
                    break;
                case 3:
                    Carrefour.vienenLosReyesMagos();
                    break;
                    
                    
                case 4:
                    Carrefour.imprimir();
                    break;
                    
                case 5:
                    Carrefour.imprimirOrdenados();
                    break;
                case 6:
                    System.out.println("FIN DEL PROGRAMA, AGUR, GOOD BYE, SAYONARA BEIBI, FINS UN ALTRA NEN");
                    System.exit(0);
                    break;
                    
                
              

            }

        } while (opt > 0 && opt < 7);
        System.out.println("FIN DEL PROGRAMA");
    }

}
