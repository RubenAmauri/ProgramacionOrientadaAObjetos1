/**
 * p78_SumaParesImpares - El usuario ingresa un rango de números y luego el tipo de números que se sumaran (Pares o Impares); Usando una función.
 */
import java.util.Scanner;

public class p73_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (letra == 'P' && i % 2 == 0) {
                System.out.printf("%d ", i);
                suma += i;
            } else if (letra == 'I' && i % 2 != 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Inicio del rango: ");
        ini = obj.nextInt();
        System.out.print("Fin del rango: ");
        fin = obj.nextInt();
        System.out.print("\n[P]ares\n[I]Impares\n");
        poi = Character.toUpperCase(obj.next().charAt(0));
        suma = poi == 'P' ? SumaParImpar(ini, fin, 'P') : SumaParImpar(ini, fin, 'I');
        System.out.printf("\nLa suma es : %d", suma);
    }
}