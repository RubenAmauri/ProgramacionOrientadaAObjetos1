import java.util.Scanner;
import java.util.InputMismatchException;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Número de niños en el barrio: ");
            int numNinos = scanner.nextInt();

            System.out.print("Cantidad de dulces existente: ");
            int cantidadDulces = scanner.nextInt();

            int dulcesPorNino = cantidadDulces / numNinos;
            System.out.println("A cada niño le tocan " + dulcesPorNino + " dulces.");
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas.");
        } catch (ArithmeticException e) {
            System.out.println("Si no hay dulces, no puedo repartir dulces.");
        } finally {
            scanner.close();
        }
    }
}
