package Vehiculo;

public class Vehiculo {
    

    String modelo;
    private double potencia;
    private boolean cRuedas;
    
    
    public Vehiculo(String modelo) {
    
    this.modelo = modelo;
    
    }
    
    
    void imprimir() {
    
    
        System.out.println("        Datos del vehículo");
        System.out.println("        =================");
        System.out.println("Modelo:                 "+ modelo);   // no se usa this porque haria referencia a este que siempre esta vacio.
        System.out.println("Potencia:               "+ getPotencia());
        
        if(iscRuedas()){
        System.out.println("Tracción 4 ruedas:         SI" );
        }else {
        System.out.println("Tracción 4 ruedas:         NO" );
        }
        System.out.println("\n\n");
        
    
    
    }

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cRuedas
     */
    public boolean iscRuedas() {
        return cRuedas;
    }

    /**
     * @param cRuedas the cRuedas to set
     */
    public void setcRuedas(boolean cRuedas) {
        this.cRuedas = cRuedas;
    }
}
