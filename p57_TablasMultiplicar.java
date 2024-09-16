
/**
 * p57_TablasMultiplicar - Se le solicita al usuario un primer número para definir hasta qué tabla (desde la del 1) se va a imprimir
 * Y se le solicita un segundo número para definir hasta qué número se van a multiplicar dichas tablas
 */

 import java.util.Scanner;
public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        int i, j, n, m;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("Ingrese la tabla hasta las que se quiera imprimir: ");
            n = obj.nextInt();
            System.out.print("Ingrese el número hasta el que se multiplicarán las tablas: ");
            m = obj.nextInt();
            for (i = 1; i <= n; i++) {
                System.out.printf("Tabla del %d\n", i);
                for (j = 1; j <= m; j++) {

                    System.out.printf("%d x %d = %d\n", i, j, i * j);

                }
            }
            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
    }
}