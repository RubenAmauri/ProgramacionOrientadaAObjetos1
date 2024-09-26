/**
 * p91_MayoresPromedio - Pide al usuario una cantidad de calificaciones a ingresar
 * y crea un arreglo con esas calificaciones, luego cálcula el promedio de esas calificaciones
 * y después muestra cuáles de ellas fueron mayores al promedio
 */
import java.util.Scanner;

public class p91_MayoresPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int n = scanner.nextInt();

        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la calificación %d: ", i + 1);
            calificaciones[i] = scanner.nextFloat();
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (float cal : calificaciones) {
            System.out.printf("%.2f ", cal);
        }

        float suma = 0;
        for (float cal : calificaciones) {
            suma += cal;
        }

        float promedio = suma / n;

        System.out.printf("\n\nLa suma de las calificaciones es: %.2f", suma);
        System.out.printf("\nEl promedio es: %.2f\n", promedio);

        System.out.println("\nCalificaciones mayores al promedio:");
        int contadorMayores = 0;
        for (float cal : calificaciones) {
            if (cal > promedio) {
                System.out.printf("%.2f ", cal);
                contadorMayores++;
            }
        }

        System.out.printf("\n\nCantidad de calificaciones mayores al promedio: %d\n", contadorMayores);
    }
}
