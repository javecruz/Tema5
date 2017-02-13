package ActividadCompania;

import java.time.Year;

public class Empleado {
    
    private String nombre;
    private String dni;
    private char estadoCivil;
    private int anioIngreso;
    private float sueldoBruto;
    int year = Year.now().getValue();
    
    
    public Empleado (String nombre, String dni, char estadoCivil, int anioIngreso, float sueldoBruto){
    
    this.nombre = nombre;
    this.dni = dni;
    this.estadoCivil = estadoCivil;
    this.anioIngreso = anioIngreso;
    this.sueldoBruto = sueldoBruto;
    
    }

    
    // te dice la antigüedad
    public int antiguedad (int anioActual){
     // para mi anioIntroducido lo trato como si fuera año actual
        int anti = anioActual-anioIngreso;
       
    /*
        if(anti<=0){
    
        System.out.println("La antigüedad es de: 0"  );
    }else {
        
        System.out.println("La antigüedad es de: " + (anioIntroducido-anioIngreso));
        
    }
        */
  
    return anti;
    }
    
    //sube sueldo
    public void subeSueldo(float incremento){
    // me da un float de 0 a 100
    float aux = incremento/100;
    
        System.out.println("El sueldo sin incrementar es de: " + sueldoBruto);
    sueldoBruto = sueldoBruto * (1 + aux);
        System.out.println("El sueldo INCREMENTADO es de: " + sueldoBruto);
    
    
    }
    
    
    
    
    // el imprimir de toda la vida
    @Override
    public String toString() {
    
    return "Nombre: " + nombre + "\nDni: " + dni + "\nEstado Civil: " + estadoCivil + "\nAño de Ingreso: " + anioIngreso + "\nSueldo Bruto: " + sueldoBruto + "\nAntigüedad: " + antiguedad(year);
    
    
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

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the estadoCivil
     */
    public char getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the anioIngreso
     */
    public int getAnioIngreso() {
        return anioIngreso;
    }

    /**
     * @param anioIngreso the anioIngreso to set
     */
    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    /**
     * @return the sueldoBruto
     */
    public float getSueldoBruto() {
        return sueldoBruto;
    }

    /**
     * @param sueldoBruto the sueldoBruto to set
     */
    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
