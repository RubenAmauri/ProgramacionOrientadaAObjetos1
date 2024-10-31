import java.util.Scanner;
import java.util.InputMismatchException;

public class p130_ExcepcionEdades {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");
        for (int i = 0; i < edades.length; i++) {
            boolean edadValida = false;
            while (!edadValida) {
                try {
                    System.out.print("Edad persona " + (i + 1) + ": ");
                    edades[i] = scanner.nextInt();
                    edadValida = true; // Marca la entrada como válida si no hay excepción
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero");
                    scanner.next(); // Descarta la entrada incorrecta para permitir un nuevo intento
                }
            }
        }

        System.out.print("Captura terminada, las edades son: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        scanner.close();
    }
}
