
// p46_TablaConversion - Imprime tabla de conversión de peso a dolar en un rango determinado

import java.util.Scanner;
public class p46_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        float tc = 18.74f, te=25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime una tabla de conversion de $peso a $$dolar\n");
            do {
                System.out.print("Ingresa el inicio : ");
                ini = obj.nextInt();
                System.out.print("Ingrese el fin : ");
                fin = obj.nextInt();
            } while (fin < ini);
            c = ini;
            System.out.println("Peso\tDolar\tEuro");
            System.out.println("---------------------");
            while (c <= fin) {
                System.out.printf("%d\t%.2f\t%.2f\n", c, c / tc, c/te);
                c++;
            }
            System.out.println("---------------------");
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}