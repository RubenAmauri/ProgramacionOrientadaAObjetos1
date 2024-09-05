// p51_SerieFibonacci - Se le solicita un número al usuario y el programa imprime los números de la serie Fibonacci hasta el número indicado

import java.util.Scanner;
public class p51_SerieFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar='s';

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.print("¿Número de términos que deseas imprimir?: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("El número de términos debe ser mayor que 0.");
                continue;
            }

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:");

            int a = 0, b = 1, siguiente;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                siguiente = a + b;
                a = b;
                b = siguiente;
            }

            System.out.println();

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));

        } while (continuar != 'N');

    }
}
