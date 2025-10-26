import java.util.Scanner;

//Clase principal
public class Main {
    public static void main(String[] args) {
        SistemaRenta sistema = new SistemaRenta();
        Scanner sc = new Scanner(System.in);
        String codigo, titulo, genero;
        int duracion, cantidad;

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
            sc.nextLine();

            //Procesar opción seleccionada
            switch (opcion){
                case 1: //Agregar Película
                    System.out.println("Código: ");
                    codigo = sc.nextLine();
                    System.out.println("Título: ");
                    titulo = sc.nextLine();
                    System.out.println("Género: ");
                    genero = sc.nextLine();
                    System.out.println("Duración (Min): ");
                    duracion = sc.nextInt();
                    System.out.println("Cantidad Disponible: ");
                    cantidad = sc.nextInt();
                    sistema.agregarPelicula(codigo, titulo, duracion, genero, cantidad);
                    break;
                case 2: //Eliminar Película
                    System.out.println("Código a Eliminar: ");
                    codigo = sc.nextLine();
                    sistema.eliminarPelicula(codigo);
                    break;
                case 3: //Rentar Película
                    System.out.println("Código a Rentar: ");
                    codigo = sc.nextLine();
                    sistema.rentarPelicula(codigo);
                    break;
                case 4: //Devolver Película
                    System.out.println("Código a Devolver: ");
                    codigo = sc.nextLine();
                    sistema.devolverPelicula(codigo);
                    break;
                case 5: //Ver Disponibles
                    sistema.mostrarDisponibles();
                    break;
                case 6: //Ver Rentadas
                    sistema.mostrarRentadas();
                    break;
                case 7: //Ver Más Rentadas
                    sistema.mostrarMasRentadas();
                    break;
                case 8: //Ver Menos Rentadas
                    sistema.mostrarMenosRentadas();
                    break;
                case 9: //Ver por Género
                    sistema.mostrarPorGenero();
                    break;
                case 0: //Salir
                    System.out.println("Sistema finalizado");
                    break;
                default:
                    System.out.println("Opción Invalidad");
                    break;
            }

        } while (opcion != 0);
        sc.close();
    }
}