/**
 * p92_MayorMenor - El usuario ingresa un valor de números a ingresar, el programa crea un arreglo y solicita al usuario
 * número por número a ingresar al arreglo, luego calcula cuál es el mayor y el menor número dentro del arreglo
 */
import java.util.Scanner;

public class p92_MayorMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese el número %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros ingresados:");
        for (int num : numeros) {
            System.out.printf("%d ", num);
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.printf("\n\nEl número mayor es: %d", mayor);
        System.out.printf("\nEl número menor es: %d\n", menor);
    }
}
