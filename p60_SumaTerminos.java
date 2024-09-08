// p60_SumaTerminos - Imprime la suma de 1 / n!

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
        int i, j, n;
        float f, r;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            r = 0;
            System.out.print("Ingrese el valor del que se quiere saber la suma y división del factorial: ");
            n = obj.nextInt();
            for (i = 1; i <= n; i++) {
                f = 1;
                for (j = 1; j <= i; j++) {
                    f *= j;

                }
                System.out.printf(" 1 / %,.2f +\n", f);
                r += (1 / f);
            }
            System.out.printf("= %,.2f\n", r);
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}