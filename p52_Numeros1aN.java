// p52_Numeros1aN - Numeros de 1 a n con paso de p

import java.util.Scanner;
public class p52_Numeros1aN {
    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        int i;

        System.out.println("Imprime los numeros de 1 a n usando for\n");
        System.out.print("Ingrese el límite: "); int n = new Scanner(System.in).nextInt();
        System.out.print("En paso de: "); int p = new Scanner(System.in).nextInt();
        for ( i = 1; i <= n; i += p) {

            System.out.printf("%d ", i);

        }
    }
}