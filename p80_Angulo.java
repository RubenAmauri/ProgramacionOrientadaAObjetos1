/**
 * p80_Angulo - Determina el tipo de ángulo en base a su longitud
 * <90 Agudo, =90 recto, >90 y <180 obtuso, =180 llano, >180 y <360 concavo, =360 completo
 * Usando una función
 */
import java.util.Scanner;
public class p80_Angulo {

    /**
     * Determina el nombre del ángulo recibido
     * @param angulo (int) Valor numérico del ángulo a evaluar
     * @return El tipo de ángulo en letra
     */
    public static String tipoDeAngulo(int angulo) {
        if (angulo < 90) {
            return "Agudo";
        } else if (angulo == 90) {
            return "Recto";
        } else if (angulo > 90 && angulo < 180) {
            return "Obtuso";
        } else if (angulo == 180) {
            return "Llano";
        } else if (angulo > 180 && angulo < 360) {
            return "Cóncavo";
        } else if (angulo == 360) {
            return "Completo";
        } else {
            return "Ángulo no válido"; // Nunca se alcanzará este caso, porque se valida antes
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int angulo;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Ingresa un ángulo entre 0 y 360 grados: ");
        angulo = obj.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("Ingrese un número válido");
        } else {
            System.out.printf("El ángulo es: %s\n", tipoDeAngulo(angulo));
        }
        obj.close();
    }
}
