package ActividadCorreo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidaciónCorreo {

    public static void main(String[] args) {

        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        String correo = null;

        System.out.println("Dame el correo, este tiene que tener un @, un punto despues del arroba y 3 carácteres despues del punto");
        try {
            correo = tec.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ValidaciónCorreo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        boolean sw = true;
        boolean sww = false;
        // primero miro si hay @
        if (correo.indexOf('@') > 0) {
            //miro que no haya una segunda @
            int aux = correo.indexOf("@");
            if (correo.indexOf('@', aux+1) > 0) {
                System.out.println("Hay mas de un arroba");
                sw = false;

            }
            // miro si hay punto despues del arroba
            if(correo.indexOf('.', aux+1)==(correo.length()-4) || correo.indexOf('.', aux+1)==(correo.length()-3) && sw==true){
            // si entra es que ha encontrado un punto, cambiar el aux+1 por la cantidad de caracteres que quieres que haya entre el arroba y el punto final
            sww = true;
            int auxx = correo.indexOf('.', aux+1);
            
            
           //voy a ver que no haya más puntos
            /*
           if(correo.indexOf(auxx)>auxx+1){
                System.out.println("ha encontrado más de 1 punto despues del arroba");
                sw = false;
            }
           */
            
            
            
            
            }
        }

        
        
            if(sww==true){
            
                System.out.println("esta bien");}else{
                System.out.println("esta mal");
            }
    }

}
