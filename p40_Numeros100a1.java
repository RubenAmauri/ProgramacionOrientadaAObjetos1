// p40_Numeros100a1 - Imprime una lista descendiente de números dependiendo de lo que solicite el usuario

import java.util.Scanner;
public class p40_Numeros100a1 {
    public static void main(String[] args) {
        int c;
        c=100;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Desde dónde deseas descender? (Mayor que 0) ");
        c = new Scanner(System.in).nextInt();
        System.out.print("\n¿Con paso de? ");
        int d = new Scanner(System.in).nextInt();

        while( c >= 1 ) {
        System.out.print(c+" ");
        c=c-d;
        }
    }
}