package ActividadCorreo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorCorreo {

    public static void main(String[] args) {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));

        int opt = 0;
        int optDos = 0;
        int optTres = 0;

        /**
         * // Elección de carpeta y bucle System.out.println("********* MENU
         * CARPETAS **********"); System.out.println("Selecciona la opción
         * deseada tecleando el número en cuestión"); do { //validación do {
         * System.out.println("1 = CREAR CARPETA"); System.out.println("2 =
         * ELIMINAR CARPETA"); System.out.println("3 = GESTIONAR CARPETAS");
         * System.out.println("4 = SALIR DEL PROGRAMA"); try { opt =
         * Integer.parseInt(tec.readLine()); } catch (IOException ex) {
         * Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE,
         * null, ex); } // informa del error if (opt > 4 || opt < 1) {
         * System.out.println("ERROR, vuelve a introducir el número"); }
         *
         * } while (opt <= 4 && opt >= 1); // HA SALIDO DEL BUCLE, HA
         * SELECCIONADO UNA OPCIÓN CORRECTA
         *
         * switch(opt){
         *
         * case 1: System.out.println("Escribe el nombre de la carpeta"); String
         * carpetaNom = tec.readLine(); break; case 2:
         *
         * }
         *
         *
         * } while (opt != 4);
         *
         */
        CarpetaCorreo Recibidos = new CarpetaCorreo();
        CarpetaCorreo Eliminados = new CarpetaCorreo();

        // Elección de carpeta y bucle
        do {
            // validación
            do {
                System.out.println("Selecciona la carpeta deseada tecleando el número en cuestión y pulsando enter");
                System.out.println("********* MENU CARPETAS **********");
                System.out.println("1 = Recibidos");
                System.out.println("2 = Eliminados");
                System.out.println("3 = SALIR DEL PUTO PROGRAMA");
                System.out.println("4 = REFRAN DEL DIA");
                System.out.println("********* XXXXXXXXXXXXX **********");
                try {
                    opt = Integer.parseInt(tec.readLine());
                } catch (IOException ex) {
                    Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (opt > 4 || opt < 1);
            // ha salido del bucle = ha elegido una opción correcta

            switch (opt) {
                case 1:
                    // validación
                    do {
                        System.out.println("Enhorabuena el programa aún no ha petado, estas en la carpeta ***Recibidos***");
                        System.out.println("Selecciona qué quieres hacer dentro de esta carpeta y recuerda rezar para que no pete el programa");
                        System.out.println("****** MENU ******");
                        System.out.println("1 = Mostrar correos");
                        System.out.println("2 = Añadir un correo");
                        System.out.println("3 = Borrar un correo");
                        System.out.println("4 = Buscar un correo");
                        System.out.println("5 = Intentar salir de esta carpeta sano y salvo(en realidad sale si escribes cualquier cosa menos las opciones de 1 a 4)");
                        System.out.println("********************");
                        System.out.println("\n");
                        try {
                            optDos = Integer.parseInt(tec.readLine());
                        } catch (IOException ex) {
                            Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    

                    switch (optDos) {

                        case 1:
                            Recibidos.imprimir();
                            break;

                        case 2:
                            System.out.println("Pa empezar, no voy a validar tus putas entradas, asi que si me trolleas y escribes algo mal por inutil y peta, te jodes.");
                            System.out.println("Escribe el origen del correo, o sea tu email");
                            String origen = null;
                            try {
                                origen = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el destino del correo");
                            String destino = null;
                            try {
                                destino = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el asunto del correo");
                            String asunto = null;
                            try {
                                asunto = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el mensaje, recuerda que esto no es twitter y puedes escribir lo que te salga de la..");
                            String mensaje = null;
                            try {
                                mensaje = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            Correo c = new Correo(origen, destino, asunto, mensaje);

                            Recibidos.añadirC(c);
                            break;

                        case 3:
                            System.out.println("\n");
                            System.out.println("Recuerda que debes saber la posicion del correo, empezamos desde el 1 siendo el primero");
                            System.out.println("Sabes la posicion? ESCRIBELA y borraré ese correo, no hace falta que me des las gracias");
                            System.out.println("NO LA VOY A VALIDAR, no la cagues");
                            int auxx = 0;
                             {
                                try {
                                    auxx = Integer.parseInt(tec.readLine());
                                } catch (IOException ex) {
                                    Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                             
                             // ojo al dato a la siguiente linea, vas a tirarte un buen rato hasta entenderla, al menos yo tarde..
                            Eliminados.añadirC(Recibidos.borrarC(auxx - 1));
                            break;

                        case 4:
                            String auxOrigen = "";
                            System.out.println("\n");
                            System.out.println("Dime el origen del correo que quieres buscar");
                             {
                                try {
                                    auxOrigen = tec.readLine();
                                } catch (IOException ex) {
                                    Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            // imprime el correo que ha buscado el de arriba
                            System.out.println(Recibidos.busca(auxOrigen).toString());
                            //Recibidos.busca(auxOrigen).toString();

                            break;
                            
                        default:
                            System.out.println("\n");
                            System.out.println("has entrado en case default");
                        break;

                    }
                        System.out.println("\n");
                        System.out.println("HECHO");
                        System.out.println("\n");
                    } while (optDos != 5);
                  
                    break;
                    
                    
                    
                    
                case 2:
                    //Reseteo todo
                    optDos = 0;
                    
                    
                    // validación
                    do {
                        System.out.println("\n");
                        System.out.println("Enhorabuena el programa aún no ha petado, estas en la carpeta ***Eliminados***");
                        System.out.println("Selecciona qué quieres hacer dentro de esta carpeta y recuerda rezar para que no pete el programa");
                        System.out.println("****** MENU ******");
                        System.out.println("1 = Mostrar correos");
                        System.out.println("2 = PAGA LA COCA, PRIMER AVISO");
                        System.out.println("3 = Borrar un correo");
                        System.out.println("4 = Buscar un correo");
                        System.out.println("5 = Intentar salir de esta carpeta sano y salvo(en realidad sale si escribes cualquier cosa menos las opciones de 1 a 4)");
                        System.out.println("********************");
                        System.out.println("\n");
                        try {
                            optDos = Integer.parseInt(tec.readLine());
                        } catch (IOException ex) {
                            Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    

                    switch (optDos) {

                        case 1:
                            Eliminados.imprimir();
                            break;

                        case 2:
                            System.out.println("\n");
                            System.out.println("Pa empezar, no voy a validar tus putas entradas, asi que si me trolleas y escribes algo mal por inutil y peta, te jodes.");
                            System.out.println("Escribe el origen del correo, o sea tu email");
                            String origen = null;
                            try {
                                origen = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el destino del correo");
                            String destino = null;
                            try {
                                destino = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el asunto del correo");
                            String asunto = null;
                            try {
                                asunto = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Escribe el mensaje, recuerda que esto no es twitter y puedes escribir lo que te salga de la..");
                            String mensaje = null;
                            try {
                                mensaje = tec.readLine();
                            } catch (IOException ex) {
                                Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            Correo c = new Correo(origen, destino, asunto, mensaje);

                            Eliminados.añadirC(c);
                            break;

                        case 3:
                            System.out.println("\n");
                            System.out.println("Recuerda que debes saber la posicion del correo, empezamos desde el 1 siendo el primero");
                            System.out.println("Sabes la posicion? ESCRIBELA y borraré ese correo, no hace falta que me des las gracias");
                            System.out.println("NO LA VOY A VALIDAR, no la cagues");
                            int auxx = 0;
                             {
                                try {
                                    auxx = Integer.parseInt(tec.readLine());
                                } catch (IOException ex) {
                                    Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                             
                             // ojo al dato a la siguiente linea, vas a tirarte un buen rato hasta entenderla, al menos yo tarde..
                            Eliminados.borrarC(auxx - 1);
                            break;

                        case 4:
                            String kjhg = "";
                            System.out.println("\n");
                            System.out.println("Dime el origen del correo que quieres buscar");
                             {
                                try {
                                    kjhg = tec.readLine();
                                } catch (IOException ex) {
                                    Logger.getLogger(GestorCorreo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            // imprime el correo que ha buscado el de arriba
                            System.out.println(Eliminados.busca(kjhg).toString());

                            break;
                            
                        default:
                            System.out.println("\n");
                            System.out.println("has entrado en case default");
                        break;

                    }
                    
                        System.out.println("HECHO");
                    } while (optDos != 5);
                    
                    break;
                    
                case 4:
                    System.out.println("\n");
                    System.out.println("En boca cerrada no entran moscas pero caben pollas como roscas.");
                    System.out.println("\n");
                    break;

            }

        } while (opt != 3);

    }

}
