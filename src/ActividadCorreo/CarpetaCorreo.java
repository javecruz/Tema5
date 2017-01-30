package ActividadCorreo;

public class CarpetaCorreo {

    private Correo[] carpeta = new Correo[40];
    

    public CarpetaCorreo() {
        
    }

    //añade correo al final del array de correos de la carpeta
    public void añadirC(Correo c) {
        int i = 0;
        for (i = 0; i < carpeta.length && carpeta[i] != null; i++) {
            // saldra cuando encuentré el primer nullo, la posicion quedara guardada en i

        }
        carpeta[i] = c;

    }

    //elimina y devuelve el correo que ocupa la posicion i del array, admeás el array se compacta
    public Correo borrarC(int i) {
        // aux guardará el objeto borrado para luego pasarlo a la carpeta eliminados
        Correo aux = carpeta[i];
        int j = 0;
     
        for(j=i;j < carpeta.length && carpeta[j] != null;j++){
            carpeta[j] = carpeta[j+1];
        
        }
        // pondra a nulo, solo sirve en el caso del último
        carpeta[j] = null;
        
        return aux;
    }

    //devuelve primer correo del array de correos cuyo origen coincida con orig o devuelve null si no existe
    public Correo busca(String orig) {
        int aux = 0;
    for(int i=0;i < carpeta.length && carpeta[i].el_Origen().equalsIgnoreCase(orig)==false;i++){
        if( carpeta[i+1].el_Origen().equalsIgnoreCase(orig)){
            aux = i+1;
    
        }
    }
        
        return carpeta[aux];
    }
    
    public void imprimir() {
        System.out.println("******** MENSAJES ********");
    for(int i=0;i < carpeta.length && carpeta[i] != null;i++){
        System.out.println("Correo nº" + (i+1));
        System.out.println(carpeta[i].toString());
            //carpeta[i].toString();
    
        }
    System.out.println("**************** FIN ****************");
        System.out.println("\n");

    /**
     * @return the carpeta
     */
    

}

    /**
     * @return the carpeta
     */
    public Correo[] getCarpeta() {
        return carpeta;
    }

    /**
     * @param carpeta the carpeta to set
     */
    public void setCarpeta(Correo[] carpeta) {
        this.carpeta = carpeta;
    }
}