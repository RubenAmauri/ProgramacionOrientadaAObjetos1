// p49_ParesDescendente - Se le pide a un usuario un número menor que 100 y se tomará como límite para imprimir los números pares desde 100 a n 

import java.util.Scanner;
public class p49_ParesDescendente {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int n, c, s, contador;
        char resp='s';
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Elija el número hasta el que deseas ver los pares (menor o igual a 100): ");
            n = obj.nextInt();

            if (n > 100) {
                System.out.println("El número debe ser menor o igual a 100.");
                continue;
            }

            if (n % 2 != 0) n--;

            s = 0;
            contador = 0;
            c = 100;

            while (c >= n) {
                System.out.printf("%d ", c);
                s += c;
                contador++;
                c -= 2;
            }

            if (contador > 0) {
                double promedio = (double) s / contador;
                System.out.printf("\nLa suma es %d", s);
                System.out.printf("\nEl promedio es %.2f", promedio);
            } else {
                System.out.println("\nNo hay números pares en el rango.");
            }

            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');

    }
}
