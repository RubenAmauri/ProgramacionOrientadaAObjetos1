/** p93_ParesImpares
 * Muestre elementos del arreglo
 * Muestre solo los elementos que son pares y los cuente
 * Muestre solo los elementos que son impares y los cuente
 * Muestre la cuenta de pares
 * Muestre la cuenta de impares
 */
import java.util.Random;

public class p93_ParesImpares {
    public static void main(String[] args) {
        final int MAX = 100;
        
        int[] a = new int[MAX];
        int[] b = new int[MAX];
        
        Random random = new Random();
        
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(21);
        }

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Elementos del arreglo a[]:");
        for (int i = 0; i < MAX; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        
        int cuentaPares = 0;
        int cuentaImpares = 0;

        System.out.println("\nElementos pares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 == 0) {
                System.out.printf("%d ", a[i]);
                cuentaPares++;
            }
        }
        System.out.println("\nTotal de pares: " + cuentaPares);
        
        System.out.println("\nElementos impares:");
        for (int i = 0; i < MAX; i++) {
            if (a[i] % 2 != 0) {
                System.out.printf("%d ", a[i]);
                cuentaImpares++;
            }
        }
        System.out.println("\nTotal de impares: " + cuentaImpares);
    }
}
