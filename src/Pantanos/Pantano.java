package Pantanos;

public class Pantano {

    private String nombre;
    private int capacidadTotal;
    private int capacidadActual;

    public Pantano(String nom, int capTotal, int capActual) {
        nombre = nom;
        capacidadTotal = capTotal;  // no uso this. porque no se llaman igual
        capacidadActual = capActual;

    }
    
    public Pantano() {
    }
    
    public int ocupacion() {
        //saca la proporcion de 1 pantano
        int proporcion = (getCapacidadActual() * 100) / getCapacidadTotal();    // dentro de esta clase da igual usar getAtributo o poner simplemnte atributo

        return proporcion;
    }

    public void imprimir(int proporcion) {

        System.out.println(getNombre() + "\t" + getCapacidadActual() + "\t" + getCapacidadTotal() + "\t" + proporcion + "%");

    }
    
    public void aumentaCapacidad(int cantidad){
        // a modo de ejemplo, no voy a usar los get aqui, para ver que también se puede prescindir de ellos en la misma clase.
    capacidadActual = capacidadActual + cantidad;
    
    }
    
    
    
    
    
    
    
    

    /**
     * @return the capacidadTotal
     */
    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    /**
     * @param capacidadTotal the capacidadTotal to set
     */
    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    /**
     * @return the capacidadActual
     */
    public int getCapacidadActual() {
        return capacidadActual;
    }

    /**
     * @param capacidadActual the capacidadActual to set
     */
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
