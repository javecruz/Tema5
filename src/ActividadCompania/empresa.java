package ActividadCompania;

import java.time.Year;

public class empresa {

    //atributo de clase que va a ser un array de tipo empleado
    empleado[] empresa = new empleado[100];
    // año actual, lo necesito en varios métodos
    int year = Year.now().getValue();
    
    
    // constructor
    public empresa() {

    }

    /*
    Añadir un nuevo empleado, siempre que haya espacio en el array. En caso contrario,
    se escribirá un mensaje en la salida estándar indicando que la incorporación del empleado no ha sido posible.
     */
    public void añadirE(empleado e) {
        int i = 0;
        for (i = 0; i < empresa.length && empresa[i] != null; i++) {
            // saldra cuando encuentré el primer nullo, la posicion quedara guardada en i

        }

        if (i <= 100) {
            empresa[i] = e;
        } else {
            System.out.println("La empresa está llena de empleados");
        }
    }

    
    /*
    Dado un número de DNI, eliminar el empleado con dicho número de DNI,
    si existe. Si no existe, el método no tendrá ningún efecto.
    */
    public void eliminarE(String dni) {

        // metodo que elimina y corre el resto hacia la izkierda, es el método multiusos, el metodo suizo, hace todo en 1
        for (int i = 0; i < empresa.length && empresa[i].getDni().equalsIgnoreCase(dni) && empresa[i] != null; i++) {

            if (empresa[i + 1].getDni().equalsIgnoreCase(dni)) {
                for (int j = i;j<empresa.length && empresa[i] != null;j++ ) {
                    empresa[j] = empresa[j+1];
                }
            }

        }

    }
    
    
    
    //Incrementar en un 10% el sueldo de aquellos empleados que lleven 10  ó más años en la compañía.
    public void vienenLosReyesMagos(){
    
        // método que he buscao por ahi que me devuelve en un int el año actual
        
        
        for(int i=0;i<empresa.length && empresa[i] != null;i++){
        
            // compara la antiguedad de cada uno, si es mayor a 10 o igual le subo sueldo 
        if(empresa[i].antiguedad(year)>=10){
        empresa[i].subeSueldo(10);
        
        }
        
        }
    
    
    }
    
    
    /*
    Crear una String correspondiente al listado de todos los empleados (método toString).
    La información de los distintos empleados debe estar separada por el carácter de salto de línea.
    */
    
    public void imprimir() {
        System.out.println("******** EMPLEADOS ********");
    for(int i=0;i < empresa.length && empresa[i] != null;i++){
        System.out.println("Empleado nº" + (i+1));
        System.out.println(empresa[i].toString());
            
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
    
    
    public void imprimirOrdenados(empresa[] original){
    
    // copia del array original , ya que necesito mantenerlo
    empleado[] copiaEmpresa = empresa;
    
    //copia auxiliar de objeto empleado
    empleado aux;
    
    // voy a ordenar el array creado por antigüedad
    for (int i=0;i<copiaEmpresa.length && copiaEmpresa[i] !=null;i++){
        
        for(int j = i+1;i<copiaEmpresa.length && copiaEmpresa[i] !=null;j++){
            
            if(copiaEmpresa[i].antiguedad(year)<copiaEmpresa[j].antiguedad(year)){
                aux = copiaEmpresa[i];
                copiaEmpresa[i] = copiaEmpresa[j];
                copiaEmpresa[j] = aux;
            
            }
        }
    }
    
    // imprimo el array ordenado
    
    System.out.println("******** EMPLEADOS ORDENADOS POR ANTIGÜEDAD ********");
    for(int i=0;i < copiaEmpresa.length && copiaEmpresa[i] != null;i++){
        System.out.println("Empleado nº" + (i+1));
        System.out.println(copiaEmpresa[i].toString());
            
        }
    System.out.println("**************** FIN ****************");
        System.out.println("\n");
    
    
    
    }
    

}
