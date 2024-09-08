// p42_TablaMultiplicar - Pide al usuario un número e imprime su tabla de multiplicar del 1 al numero que el usuario elija

import java.util.Scanner;
public class p42_TablaMultiplicar {
    public static void main(String[] args) {
        int t, c, n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Elija la tabla de multiplicar a imprimir: ");
        t = obj.nextInt();
        System.err.print("\nElija el número hasta el que se multiplicará: ");
        n = obj.nextInt();
       
        c=1;
        while (c<=n) {
            System.out.printf("%d * %d = %d\n", t, c, t*c);
            c++;
        }
    }
    
}
