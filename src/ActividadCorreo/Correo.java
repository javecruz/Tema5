package ActividadCorreo;

public class Correo {
    private String origen;
    private String destino;
    private String asunto;
    private String mensaje;

    
    // Constructor con sus parametros
    public Correo(String o, String d, String a, String m){
    origen = o;   // no hace falta usar this.origen porque se llaman distinto los parametros y los atributos de clase
    destino = d;
    asunto = a;
    mensaje = m;
    
    
    }
    
    // este es el imprimir tipico de toa la bidah teteh
    @Override
    public String toString() {
        // devuelve todo en el formato que pide el ejercicio
        return "Origen. - " + origen + "\n" + "Destino. - " + destino + "\n" + "Asunto. - " + asunto + "\n" + "Mensaje. - " + mensaje;
    }

    
    // ESTE SE HA CREADO AUTOMATICAMENTE, YO LE HE CAMBIADO EL NOMBRE POR EL QUE PIDE EL EJERCICIO
    public String el_Origen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
