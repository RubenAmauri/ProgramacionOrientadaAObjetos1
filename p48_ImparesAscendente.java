// p48_ImparesAscendente - Solicita al usuario un número hasta el que se repetirán números impares de forma ascendente

import java.util.Scanner;
public class p48_ImparesAscendente {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int n, c, s, contador;
        char resp;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.print("Elija el número máximo para imprimir los impares: ");
            n = obj.nextInt();
            
            s = 0;
            c = 1;
            contador = 0;

            while (c <= n) {
                System.out.printf("%d ", c);
                s += c;
                contador++;
                c += 2;
            }

            if (contador > 0) {
                double promedio = (double) s / contador;
                System.out.printf("\nLa suma es %d", s);
                System.out.printf("\nEl promedio es %.2f", promedio);
            } else {
                System.out.println("\nNo hay números impares en el rango.");
            }

            System.out.print("\n¿Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            
        } while (resp != 'N');        
    }
}
