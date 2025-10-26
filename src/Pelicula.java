//Clase que representa una película en el sistema
public class Pelicula {
    //Atributos de la película
    private String codigo;  //Código único de identificación
    private String titulo;  //Título de la película
    private int duracion;   //Duración en minutos
    private String genero;  //Género de la película
    private int cantidadDisponible; //Copias disponibles para renta
    private int vecesRentada;   //Contador de veces que se ha rentado

    //Constructor
    public Pelicula(String codigo, String titulo, int duracion, String genero, int cantidadDisponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.cantidadDisponible = cantidadDisponible;
        this.vecesRentada = 0;  //Inicia en 0
    }

    //Métodos Getter
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public int getVecesRentada() {
        return vecesRentada;
    }

    //Métodos Setter

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void incrementarRentas(){
        this.vecesRentada++;
    }   //Incrementa contador de rentas

    //Representación en texto de la película
    @Override
    public String toString(){
        return codigo + " - " + titulo + " - " + " (" + genero + ") - " + duracion + " min - Disponible: " + cantidadDisponible;
    }
}
