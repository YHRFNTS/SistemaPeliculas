//Clase que representa una película en el sistema
public class Pelicula {
    //Atributos de la película
    private String codigo;
    private String titulo;
    private int duracion;
    private String genero;
    private int cantidadDisponible;
    private int vecesRentada;

    public Pelicula(String codigo, String titulo, int duracion, String genero, int cantidadDisponible, int vecesRentada) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.cantidadDisponible = cantidadDisponible;
        this.vecesRentada = vecesRentada;
    }

    
}
