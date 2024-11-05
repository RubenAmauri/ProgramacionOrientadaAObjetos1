/*
 * p64_SumaTerminos2 - el usuario ingresará un número y se imprimirá una secuencia de términos de forma "1+11+111+..." y su suma
 */
import java.util.Scanner;
public class p64_SumaTerminos2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese el número hasta el que se sumarán los términos: ");
        int n = scanner.nextInt();

        int termino = 0; 
        int suma = 0;

        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            termino = termino * 10 + 1;
            if (i == 1) {
                System.out.print(termino);
            } else {
                System.out.print(" + " + termino);
            }
            suma += termino;
        }

        System.out.println("\nSuma: " + suma);
    }
}