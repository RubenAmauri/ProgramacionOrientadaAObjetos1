// p60_SumaTerminos - Imprime la suma de 1 / n!

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
                System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Número de factorial:"); int n = new Scanner(System.in).nextInt();

        float s=0;
        for (int i=1; i<=n; i++){
            float f=1;
            System.out.printf("1 / ", i);
            for (int j=1; j<=i; j++){
                System.out.printf("%d ", j);
                f=f*j;
            }
            System.out.printf("= %,.0f", f);
            System.out.println();

        }
    }
    
}