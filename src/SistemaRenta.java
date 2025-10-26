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

    //Elimina una película del catálogo por código
    public void eliminarPelicula(String codigo){
        for (int i = 0; i < catalogo.size(); i++){
            if (catalogo.get(i).getCodigo().equals(codigo)){
                System.out.println("Película eliminada: " + catalogo.get(i).getTitulo());
                catalogo.remove(i);
                return;
            }
        }
        System.out.println("Película no encontrada");
    }

    //Renta una película por código
    public void rentarPelicula(String codigo){
        for (Pelicula p : catalogo){
            if (p.getCodigo().equals(codigo)){
                if (p.getCantidadDisponible() > 0){
                    p.setCantidadDisponible(p.getCantidadDisponible() - 1); //Reduce disponibilidad
                    p.incrementarRentas(); //Incrementa contador
                    //Verifica si ya está en la lista de rentadas
                    boolean yaRentada = false;
                    for (Pelicula r : rentadas){
                        if (r.getCodigo().equals(codigo)){
                            yaRentada = true;
                            break;
                        }
                    }
                    if (!yaRentada){
                        rentadas.add(p); //Agrega a la lista de Rentadas
                    }
                    System.out.println("Película rentada: " + p.getTitulo());
                    return;
                }else{
                    System.out.println("No hay copias disponibles");
                    return;
                }
            }
        }
        System.out.println("Película no encontrada");
    }

    //Devuelve una película rentada
    public void devolverPelicula(String codigo){
        for (Pelicula p : catalogo){
            if (p.getCodigo().equals(codigo)){
                p.setCantidadDisponible(p.getCantidadDisponible() + 1); //Incrementa disponibilidad
                //Remueve de la lista de rentadas
                for (int i = 0; i < rentadas.size(); i++){
                    if (rentadas.get(i).getCodigo().equals(codigo)){
                        rentadas.remove(i);
                        break;
                    }
                }
                System.out.println("Película devuelta: " + p.getTitulo());
                return;
            }
        }
        System.out.println("Película no encontrada");
    }

    //Muestra películas con copias disponibles
    public void mostrarDisponibles(){
        System.out.println("\n=== Películas Disponibles ===");
        for (Pelicula p : catalogo){
            if (p.getCantidadDisponible() > 0){
                System.out.println(p);
            }
        }
    }

    //Muestra películas actualmente rentadas
    public void mostrarRentadas(){
        System.out.println("\n=== Películas Rentadas ===");
        for (Pelicula p : rentadas){
            System.out.println(p.getCodigo() + " - " + p.getTitulo());
        }
    }

    //Muestra películas que han sido rentadas al menos una vez
    public void mostrarMasRentadas(){
        System.out.println("\n=== Películas más rentadas ===");
        for (Pelicula p : catalogo){
            if (p.getVecesRentada() > 0){
                System.out.println(p.getTitulo() + " - " + p.getVecesRentada() + " veces");
            }
        }
    }

    
}
