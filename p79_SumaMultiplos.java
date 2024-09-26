/**
 * p79_SumaMultiplos - El programa cálcula la suma de los múltiplos de 3 o 4
 * (según decida el usuario) en un rango específicado por el usuario
 */
import java.util.Scanner;
public class p79_SumaMultiplos {

    /**
     * 
     * @param ini (int) Inicio del rango
     * @param fin (int) Fin del rango
     * @param multiplo (int) Calcula los múltiplos dentro del rango especificado
     * @return La suma de los múltiplos
     */
    public static int sumarMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, multiplo, suma;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Inicio del rango: ");
        ini = obj.nextInt();
        System.out.print("Fin del rango: ");
        fin = obj.nextInt();

        if (ini >= fin) {
            System.out.println("El rango no es válido (inicio debe ser menor que fin)");
            return; 
        }

        System.out.println("\nSuma de múltiplos de:\n[3] Múltiplos de 3\n[4] Múltiplos de 4");
        multiplo = obj.nextInt();

        if (multiplo != 3 && multiplo != 4) {
            System.out.println("Opción no válida. Debe elegir 3 o 4.");
            return;
        }

        suma = sumarMultiplos(ini, fin, multiplo);
        System.out.printf("\nLa suma de los múltiplos de %d es: %d\n", multiplo, suma);
    }
}
