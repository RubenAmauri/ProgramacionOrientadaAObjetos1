import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            double numero = scanner.nextDouble();
            if (numero < 0) {
                throw new IllegalArgumentException("No puedo calcular la raíz cuadrada de un número negativo.");
            }
            double raiz = Math.sqrt(numero);
            System.out.printf("El resultado es: %.2f%n", raiz);
        } catch (Exception e) {
            System.out.println("Error: no puedo calcular la raíz cuadrada");
        } finally {
            scanner.close();
        }
    }
}
