// p58_Piramide - Imprimir una piramide de *

import java.util.Scanner;
public class p58_Piramide{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuántos renglones?"); int r = obj.nextInt();
        System.out.print("¿Con cuál carácter?"); char c = obj.next().charAt(0);

        for (int i=1; i<=r; i++){
            System.out.print(c);
        }
    }
}