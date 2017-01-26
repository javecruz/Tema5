/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author AlumMati
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private int anoDeNacimiento;
    private int numeroPersonal;
    private String grupo;
    private char horario; //’M’: mañana, ‘T’: tarde
    private float notaSelect;
    
    public Alumno() {
    }
    
    public Alumno(String nombre, String apellidos, int anoDeNacimiento, int numeroPersonal, String grupo, char horario, float notaSelect){
    
        this.nombre = nombre;       // this.nombre es el de la clase alumno y nombre es el del parametro del constructor alumno
        this.apellidos = apellidos;
        this.anoDeNacimiento = anoDeNacimiento;
        this.numeroPersonal = numeroPersonal;
        this.numeroPersonal = numeroPersonal;
        this.grupo = grupo;
        this.horario = horario;
        this.notaSelect = notaSelect;
        
        
    }
    
    void imprimir(){
    
        System.out.println("        Datos del alumno");
        System.out.println("        =================");
        System.out.println("Nombre:                 "+ getNombre());
        System.out.println("Apellidos               "+ getApellidos());
        System.out.println("Año de Nacimiento:      "+ getAnoDeNacimiento());
        System.out.println("Número Personal:        "+ getNumeroPersonal());
        System.out.println("Grupo:                  "+ getGrupo());
        System.out.println("Horario:                "+ getHorario());
        System.out.println("Nota Selectividad:      "+ getNotaSelect());
    
    
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the anoDeNacimiento
     */
    public int getAnoDeNacimiento() {
        return anoDeNacimiento;
    }

    /**
     * @param anoDeNacimiento the anoDeNacimiento to set
     */
    public void setAnoDeNacimiento(int anoDeNacimiento) {
        this.anoDeNacimiento = anoDeNacimiento;
    }

    /**
     * @return the numeroPersonal
     */
    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    /**
     * @param numeroPersonal the numeroPersonal to set
     */
    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    /**
     * @return the grupo
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the horario
     */
    public char getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(char horario) {
        this.horario = horario;
    }

    /**
     * @return the notaSelect
     */
    public float getNotaSelect() {
        return notaSelect;
    }

    /**
     * @param notaSelect the notaSelect to set
     */
    public void setNotaSelect(float notaSelect) {
        this.notaSelect = notaSelect;
    }
    
}


