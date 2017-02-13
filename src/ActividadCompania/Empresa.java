package ActividadCompania;

import java.time.Year;

public class Empresa {

    //atributo de clase que va a ser un array de tipo empleado, en este caso no hace falta ponerlo privado, lo he puesto para hacer unas pruebas...
    private Empleado[] empresa = new Empleado[100];
    // año actual, lo necesito en varios métodos, esta private por unas pruebas, no hace falta en este caso
    private int year = Year.now().getValue();
    
    
    // constructor
    public Empresa() {

    }

    /*
    Añadir un nuevo empleado, siempre que haya espacio en el array. En caso contrario,
    se escribirá un mensaje en la salida estándar indicando que la incorporación del empleado no ha sido posible.
     */
    public void añadirE(Empleado e) {
        int i = 0;
        for (i = 0; i < getEmpresa().length && getEmpresa()[i] != null; i++) {
            // saldra cuando encuentré el primer nullo, la posicion quedara guardada en i

        }

        if (i <= 100) {
            getEmpresa()[i] = e;
        } else {
            System.out.println("La empresa está llena de empleados");
        }
    }

    
    /*
    Dado un número de DNI, eliminar el empleado con dicho número de DNI,
    si existe. Si no existe, el método no tendrá ningún efecto.
    */
    public void eliminarE(String dni) {
        boolean sw = false;
        
       
        
        
        
        
        // getEmpresa()[i].getDni().equalsIgnoreCase(dni)==false &&
        // metodo que elimina, valida y corre el resto hacia la izkierda, es el método multiusos, el metodo suizo, hace todo en 1
        for (int i = 0; i < getEmpresa().length &&  getEmpresa()[i] != null && sw==false; i++) {
            //System.out.println("ha entrado en el primer for");
            
            //miro si el que hay que borrar esta en primera posición, sino pongo esto peta ya que comparo i+1
            if (getEmpresa()[i].getDni().equalsIgnoreCase(dni) && i==0) {
                //System.out.println("ha entrado en el segundo for");
                sw = true;
                for (int j = i;j<getEmpresa().length && getEmpresa()[j] != null;j++ ) {
                    getEmpresa()[j] = getEmpresa()[j+1];
                }
                //si el que hay que borrar no esta en primera posicion...
            }else if (getEmpresa()[i + 1].getDni().equalsIgnoreCase(dni)) {
                //System.out.println("ha entrado en el segundo for");
                sw = true;
                for (int j = i+1;j<getEmpresa().length && getEmpresa()[j] != null;j++ ) {
                    getEmpresa()[j] = getEmpresa()[j+1];
                }
            
            
            }

        }
        

        if(sw==false){
            System.out.println("El empleado introducido no trabaja en esta empresa");
        }

    }
    
    
    
    //Incrementar en un 10% el sueldo de aquellos empleados que lleven 10  ó más años en la compañía.
    public void vienenLosReyesMagos(){
    
        // método que he buscao por ahi que me devuelve en un int el año actual
        
        
        for(int i=0;i<getEmpresa().length && getEmpresa()[i] != null;i++){
        
            // compara la antiguedad de cada uno, si es mayor a 10 o igual le subo sueldo 
        if( getEmpresa()[i].antiguedad(getYear())>=10){
                getEmpresa()[i].subeSueldo(10);
        
        }
        
        }
    
    
    }
    
    
    /*
    Crear una String correspondiente al listado de todos los empleados (método toString).
    La información de los distintos empleados debe estar separada por el carácter de salto de línea.
    */
    
    public void imprimir() {
        System.out.println("******** EMPLEADOS ********");
    for(int i=0;i < getEmpresa().length && getEmpresa()[i] != null;i++){
        System.out.println("\nEmpleado nº" + (i+1));
        System.out.println(getEmpresa()[i].toString());
            
        }
    System.out.println("**************** FIN ****************");
        System.out.println("\n");
    
    }
    
    /*
    Mostrar en la salida estándar la información de todos los empleados,
    ordenados de mayor a menor antigüedad, es decir, por año de ingreso.
    El método debe dejar inalterado el array de empleados de la compañía
    (se podrá usar una variable local array de empleados, como copia auxiliar de trabajo del método).
    */
    
    
    public void imprimirOrdenados(){
    
    // copia del array original , ya que necesito mantenerlo
    Empleado[] copiaEmpresa = empresa.clone();
    
    
    
    //copia auxiliar de objeto empleado
    Empleado aux;
    
    // voy a ordenar el array creado por antigüedad
    for (int i=0;i<copiaEmpresa.length-1 && copiaEmpresa[i] !=null;i++){
        
        for(int j = i+1;i<copiaEmpresa.length && copiaEmpresa[j] != null;j++){
            
            if(copiaEmpresa[i].antiguedad(getYear())<copiaEmpresa[j].antiguedad(getYear())){
                aux = copiaEmpresa[i];
                copiaEmpresa[i] = copiaEmpresa[j];
                copiaEmpresa[j] = aux;
            
            }
        }
    }
    
    // imprimo el array ordenado
    
    System.out.println("******** EMPLEADOS ORDENADOS POR ANTIGÜEDAD ********\n");
    for(int i=0;i < copiaEmpresa.length && copiaEmpresa[i] != null;i++){
        System.out.println("\nEmpleado nº" + (i+1));
        System.out.println(copiaEmpresa[i].toString());
            
        }
    System.out.println("\n**************** FIN ****************");
        System.out.println("\n");
    
    
    
    }

    /**
     * @return the empresa
     */
    public Empleado[] getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empleado[] empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    

}
