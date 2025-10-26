import java.util.ArrayList;

//Clase principal que maneja el sistema de renta de películas
public class SistemaRenta {
    private ArrayList<Pelicula> catalogo;   //Lista de todas las películas
    private ArrayList<Pelicula> rentadas; //Lista de películas actualmente rentadas

    //Constructor
    public SistemaRenta(){
        catalogo = new ArrayList<>();
        rentadas = new ArrayList<>();
    }

    //Agrega una nueva película al catálogo
    public void agregarPelicula(String codigo, String titulo, int duracion, String genero, int cantidad){
        catalogo.add(new Pelicula(codigo, titulo, duracion, genero, cantidad));
        System.out.println("Película agregada: " + titulo);
    }
}
