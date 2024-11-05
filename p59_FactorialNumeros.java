// p59_FactorialNumeros - Imprime el factorial de n números

import java.util.Scanner;
public class p59_FactorialNumeros {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Número de factorial:"); int n = new Scanner(System.in).nextInt();

        for (int i=1; i<=n; i++){
            float f=1;
            System.out.printf("%d! = ", i);
            for (int j=1; j<=i; j++){
                System.out.printf("%d %s ", j, (i==j ? " " : "*"));
                f=f*j;
            }
            System.out.printf("= %,.0f", f);
            System.out.println();

        }
    }
    
}
