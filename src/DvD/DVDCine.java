package DvD;

public class DVDCine {

    String titulo;
    String actoresPrincipales;
    String director;
    String genero;
    int duracion;
    String resumen;

    public DVDCine(String titulo, String actores, String director, String genero, int duracion, String resumen) {

        this.titulo = titulo;   // se pone this cuando se llaman igual
        actoresPrincipales = actores;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;

    }

    void muestraDVDCine(int duracionPelicula) {

        System.out.println(titulo);
        System.out.println("De: " + director);
        System.out.println("Con: " + actoresPrincipales);
        System.out.println(genero + ": " + duracionPelicula + " min");
        System.out.println(resumen);

    }

    public int muestraDuracion() {

        return duracion;
    }

    public boolean esThriller(String genero) {
        boolean sw = false;

        if (genero.equalsIgnoreCase("Thriller")) {
            sw = true;
        }

        return sw;
    }
    
    public boolean tieneResumen(String resumen) {
        boolean sw = false;

        if (resumen.length()>0) {
            sw = true;
        }

        return sw;
    }
    
    

}
