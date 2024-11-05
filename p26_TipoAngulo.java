/** 
 * p26_TipoAngulo - Determina el tipo de ángulo en base a su longitud
 * <90 Agudo, =90 recto, >90 y <180 obtuso, =180 llano, >180 y <360 concavo, =360 completo
*/
import java.util.Scanner;
public class p26_TipoAngulo {
    @SuppressWarnings("resource")

    public static void main(String [] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Ingresa un ángulo entre 0 y 360 grados");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo <0 || angulo >360) {
            System.out.println("Ingrese un número válido");
        } else {
            System.out.print("El ángulo es: ");
            if (angulo<90) System.out.println("Agudo");
            if (angulo == 90) System.out.println("Recto");
            if (angulo > 90 && angulo <180) System.out.println("Obtuso");
            if (angulo == 180) System.out.println("Llano");
            if (angulo >180 && angulo<360) System.out.println("Concavo");
            if (angulo == 360) System.out.println("Completo");
        }
    }
}
