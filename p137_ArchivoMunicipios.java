import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] deportes = { "Fresnillo", "El Salto", "Guadalupe", "Zacatecas", "Sombrerete"};
        File archivo = new File("deportes.txt");

        if (archivo.exists()) {
            System.out.println("El archivo ya existe!");
        } else {
            try {
                BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo));
                for (String deporte : deportes) {
                    escritor.write(deporte + "\n");
                }
                escritor.close();
                System.out.println("Datos escritos en el archivo con éxito.");

            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo para escribir.");
                System.out.println(e);
            }
        }

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            System.out.println("\nContenido del archivo:");
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivo para leer.");
            System.out.println(e);
        }

        System.out.println("\nLongitud final del archivo escrito: " + archivo.length() + " bytes");
    }
}
