
// p66_PromedioNumeros - Calcula el promedio de tres números usando una función

import java.util.Scanner;
public class p66_PromedioNumeros {
    public static float promedio(float n1, float n2, float n3) {
        float suma, promedio;
        suma = n1 + n2 + n3;
        promedio = suma /3;
        return promedio;
    }

    @SuppressWarnings("resource")

    public static void main(String[] args) {
        float n1, n2, n3, prom;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Dados tres números flotantes, obtener su promedio");
        System.out.print("Dame el primer número: ");
        n1 = obj.nextFloat();
        System.out.print("Dame el segundo número: ");
        n2 = obj.nextFloat();
        System.out.print("Dame el tercer número: ");
        n3 = obj.nextFloat();
        prom = promedio(n1, n2, n3);
        System.out.printf("\nEl promedio es %.2f", prom);
    }

}