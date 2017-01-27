package ActividadCorreo;

public class CarpetaCorreo {

    private Correo[] carpeta = new Correo[40];
    

    public CarpetaCorreo() {
        
    }

    //añade correo al final del array de correos de la carpeta
    public void añadirC(Correo c) {

        for (int i = 0; i < getCarpeta().length && getCarpeta()[i] != null; i++) {
            // busco el primer null y meto el correo, i +1 porque sino salria del bucle antes de que esta condicion se cumpliera
            if (getCarpeta()[i+1] == null) {
                getCarpeta()[i+1] = c;
            }

        }

    }

    //elimina y devuelve el correo que ocupa la posicion i del array, admeás el array se compacta
    public Correo borrarC(int i) {
        // aux guardará el objeto borrado para luego pasarlo a la carpeta eliminados
        Correo aux = getCarpeta()[i];
        
     
        for(int j=i;j < getCarpeta().length && getCarpeta()[j] != null;j++){
            getCarpeta()[j] = getCarpeta()[j+1];
        
        }
     
        return aux;
    }

    //devuelve primer correo del array de correos cuyo origen coincida con orig o devuelve null si no existe
    public Correo busca(String orig) {
        int aux = 0;
    for(int i=0;i < getCarpeta().length && getCarpeta()[i].el_Origen().equalsIgnoreCase(orig)==false;i++){
        if( getCarpeta()[i+1].el_Origen().equalsIgnoreCase(orig)){
            aux = i+1;
    
        }
    }
        
        return getCarpeta()[aux];
    }
    
    public void imprimir() {
        System.out.println("******** MENSAJES RECIBIDOS ********");
    for(int i=0;i < getCarpeta().length && getCarpeta()[i] != null;i++){
        System.out.println("Correo nº" + i);
            getCarpeta()[i].toString();
    
        }
    System.out.println("**************** FIN ****************");
    

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