// p71_MayorTresNumeros - El usuario ingresa tres números y el programa determina cuál de esos tres es el mayor; Usando una función.

import java.util.Scanner;
public class p71_MayorTresNumeros {
    public static float Mayor(float n1, float n2, float n3) {
        float mayor = 0;
        if (n1 > n2 && n1 > n3)
            mayor = n1;
        else if (n2 > n1 && n2 > n3)
            mayor = n2;
        else if (n3 > n1 && n3 > n2)
            mayor = n3;
        return mayor;
    }
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingresa los tres números separados por un espacio o por un salto de línea: ");
        n1 = obj.nextFloat();
        n2 = obj.nextFloat();
        n3 = obj.nextFloat();
        System.out.printf("\nEl mayor de los tres números es : %.2f", Mayor(n1, n2, n3));
    }
}