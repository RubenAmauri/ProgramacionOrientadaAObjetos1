/*
 * p62_SecuenciaNumeros2 - Se le solicita al usuario un número y el programa imprimirá una píramide hasta ese número de manera ascendente desde el 1 en cada renglón
 */
import java.util.Scanner;
public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i, j, n;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Ingrese el número de renglones que tendrá la pirámide ");
            n = obj.nextInt();
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {

                    System.out.print(j);

                }
                System.out.println();
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}