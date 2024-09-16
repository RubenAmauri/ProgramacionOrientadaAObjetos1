
// Calificación con letra
import java.util.Scanner;

public class p70_CalificacionLetra {
    public static char CalifLetra(float prom) {
        char letra = 'X';
        if (prom >= 90 && prom <= 100)
            letra = 'A';
        else if (prom >= 80 && prom < 90)
            letra = 'B';
        else if (prom >= 70 && prom < 80)
            letra = 'C';
        else if (prom >= 60 && prom < 70)
            letra = 'D';
        else if (prom >= 0 && prom < 60)
            letra = 'F';

        return letra;
    }

    public static void main(String[] args) {
        float cal;
        char letra;
        System.out.print("\033[H\033[2J");
        do {
            System.out.print("Dame tu calificacion (0-100) ? ");
            cal = new Scanner(System.in).nextFloat();
        } while (cal < 0 || cal > 100);
        letra = CalifLetra(cal);
        System.out.printf("\nTu calificación de %.2f en letra es %c\n", cal, letra);
    }
}