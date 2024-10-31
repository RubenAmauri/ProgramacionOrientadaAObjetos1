import java.util.Scanner;

public class p122_Excepcion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Dame un valor : ");
            int val = scanner.nextInt();
            val = val + 5;
            System.out.println("El nuevo valor es " + val);
        } catch (Exception e) {
            System.out.println("Debes introducir un número");
        } finally {
            scanner.close(); // Cerramos el Scanner en el bloque finally
        }
    }
}
