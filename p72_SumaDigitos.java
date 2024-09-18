// p72_SumaDigitos - El usuario ingresa un número y el programa suma los dígitos de dicho número; Usando una función.

import java.util.Scanner;
public class p72_SumaDigitos {
    public static long SumaDigitos(long n) {
        long suma = 0, digito;
        while (n != 0) {
            digito = n % 10;
            n = n / 10;
            suma += digito;
        }
        return suma;
    }

    public static void main(String[] args) {
        long numero;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese un número: ");
        numero = obj.nextLong();
        System.out.printf("\nLa suma de digitos es : %d", SumaDigitos(numero));
    }
}