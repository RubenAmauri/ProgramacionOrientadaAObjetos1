/**
 * p76_NumeroMenor - El usuario ingresa cuatro números y el programa
 *  determina cuál de esos cuatro es el menor; Usando una función.
 */
import java.util.Scanner;
public class p76_NumeroMenor {
    /**
     * Función que evalua los números ingresados y determina cuál es el menor
     * @param n1 (int) El primer número ingresado
     * @param n2 (int) El segundo número ingresado
     * @param n3 (int) El tercer número ingresado
     * @param n4 (int) El cuarto número ingresado
     * @return (int menor) El valor que guarda el menor número ingresado
     */
    public static int Menor(int n1, int n2, int n3, int n4) {
        int menor = n1;
        if (n2 < menor)
            menor = n2;
        if (n3 < menor)
            menor = n3;
        if (n4 < menor)
            menor = n4;

        return menor;
    }

    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Ingresa los cuatro números enteros separados por un espacio o por un salto de línea: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        n4 = obj.nextInt();

        System.out.printf("\nEl menor de los cuatro números es: %d\n", Menor(n1, n2, n3, n4));
    }
}
