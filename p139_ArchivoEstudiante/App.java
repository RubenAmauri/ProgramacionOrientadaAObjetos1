package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String archivo = "estudiantes.dat";
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Capturar datos de estudiantes");
            System.out.println("2. Grabar datos en archivo");
            System.out.println("3. Leer datos de archivo");
            System.out.println("4. Mostrar datos de estudiantes");
            System.out.println("5. Calcular promedio de calificaciones");
            System.out.println("6. Calcular promedio de edades");
            System.out.println("7. Contar cantidad de hombres");
            System.out.println("8. Contar cantidad de mujeres");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    Procesa.capturaDatos(estudiantes);
                    break;
                case 2:
                    try {
                        Procesa.grabarDatos(archivo, estudiantes);
                        System.out.println("Datos guardados correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error al guardar los datos en el archivo.");
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        estudiantes = Procesa.leerDatos(archivo);
                        System.out.println("Datos cargados correctamente.");
                    } catch (Exception e) {
                        System.out.println("Error al leer los datos desde el archivo.");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    Procesa.mostrarDatos(estudiantes);
                    break;
                case 5:
                    System.out.printf("Promedio de calificaciones: %.2f\n", Procesa.calcularPromedioCalificaciones(estudiantes));
                    break;
                case 6:
                    System.out.printf("Promedio de edades: %.2f\n", Procesa.calcularPromedioEdades(estudiantes));
                    break;
                case 7:
                    System.out.println("Cantidad de hombres: " + Procesa.contarHombres(estudiantes));
                    break;
                case 8:
                    System.out.println("Cantidad de mujeres: " + Procesa.contarMujeres(estudiantes));
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}

