// p75_CuadroCaracter - Imprime un cuadro de renglones x columnas del caracter especificado; Usando una función.

import java.util.Scanner;
public class p75_CuadroCaracter {
    public static void Cuadro(int ren, int col, char car) {
        for (int i = 1; i <= ren; i++) {
            for (int j = 1; j <= col; j++)
                System.out.printf("%c ", car);

            System.out.println();
        }
    }
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int ren, col;
        char car;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Renglones: ");
        ren = obj.nextInt();
        System.out.print("Columnas: ");
        col = obj.nextInt();
        System.out.print("Caracter: ");
        car = Character.toUpperCase(obj.next().charAt(0));
        Cuadro(ren, col, car);
        Cuadro(3,4,'#');
        Cuadro(10,23,'&');
    }
}