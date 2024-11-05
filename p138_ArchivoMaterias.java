import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class p138_ArchivoMaterias {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();
        String archivoNombre = "materias.txt";
        File archivo = new File(archivoNombre);

        System.out.println("Introduce una lista de materias cursadas (deja vacío para terminar):");
        while (true) {
            System.out.print("Materia: ");
            String materia = scanner.nextLine();
            if (materia.isEmpty()) break;
            materias.add(materia);
        }

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
            for (String materia : materias) {
                escritor.write(materia + "\n");
            }
            escritor.close();
            System.out.println("Materias guardadas en el archivo con éxito.");
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo para escribir.");
            System.out.println(e);
        }

        if (!archivo.exists()) {
            System.out.println("El archivo no existe!");
        } else {
            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                String linea;
                System.out.println("\nMaterias guardadas en el archivo:");
                while ((linea = lector.readLine()) != null) {
                    System.out.println(linea);
                }
                lector.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo para leer.");
                System.out.println(e);
            }
        }

        System.out.println("\nLongitud final del archivo: " + archivo.length() + " bytes");

        scanner.close();
    }
}
