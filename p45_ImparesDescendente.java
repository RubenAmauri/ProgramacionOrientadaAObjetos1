// p44_ParesAscendente - Solicita al usuario un número desde el que se repetirán números impares de forma descendente

import java.util.Scanner;
public class p45_ImparesDescendente {
    public static void main(String[] args) {
        int n, c, s;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.print("Elija el número de impares a imprimir: ");
            n = obj.nextInt();
            //if(n%2 == 0) n++;
            c = (n%2==0 ? ++n: n);
            s = 0;
            c = 2;
            while (c >= 1) {
                System.out.printf("%d ", c);
                s += c;
                c -= 2;
            }
            System.out.printf("\nLa suma es %d", s);
            System.out.print("\nDeseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}