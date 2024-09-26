// p74_Factorial - El usuario ingresa un número y el prograna cálcula el factorial de ese número; Usando una función.

import java.util.Scanner;
public class p74_Factorial {
    public static double Factorial(int n) {
        double f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;

        return f;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingresa el número del que se quiere saber el factorial: ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("\nEl factorial de %d es %.0f\n", n, Factorial(n));
    }
}