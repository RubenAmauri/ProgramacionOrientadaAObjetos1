
/**
 * p69_TablaMultiplicar - Se le solicita al usuario un primer número para definir hasta qué tabla (desde la del 1) se va a imprimir
 * Y se le solicita un segundo número para definir hasta qué número se van a multiplicar dichas tablas - con funciones
 */

import java.util.Scanner;

public class p69_TablaMultiplicar {
    public static void tabla(int tabla, int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.printf("%d x %d = %d\n", tabla, i, tabla * i);
        }
    }

    public static void main(String[] args) {
        int t, n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.print("Que tabla quieres ? ");
        t = obj.nextInt();
        System.out.print("Hata donde la quieres ? ");
        n = obj.nextInt();
        tabla(t, n);
    }

}
