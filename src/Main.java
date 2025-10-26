import java.util.Scanner;

//Clase principal
public class Main {
    public static void main(String[] args) {
        SistemaRenta sistema = new SistemaRenta();
        Scanner sc = new Scanner(System.in);

        //Agregar películas de ejemplo
        sistema.agregarPelicula("001", "La Guerra de los Mundos", 116, "Ciencia Ficción", 10);
        sistema.agregarPelicula("002", "Gladiador", 155, "Acción", 8);
        sistema.agregarPelicula("003", "Monsters University", 104, "Comedia", 5);

        int opcion;
        //Menú principal del sistema
        do{
            System.out.println("\n=== Sistema de Renta de Películas ===");
            System.out.println("1. Agregar Película");
            System.out.println("2. Eliminar Película");
            System.out.println("3. Rentar Película");
            System.out.println("4. Devolver Película");
            System.out.println("5. Ver Disponibles");
            System.out.println("6. Ver Rentadas");
            System.out.println("7. Ver Más Rentadas");
            System.out.println("8. Ver Menos Rentadas");
            System.out.println("9. Ver por Género");
            System.out.println("0. Salir");
            System.out.println("Ingrese su Opción: ");

            opcion = sc.nextInt();

        } while (opcion != 0);
        sc.close();
    }
}