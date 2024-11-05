/**
 * p77_ DiaSemana - Dado un número entre 1 y 7, nos imprime el día de la semana correspondiente; Usando una función.
 */
import java.util.Scanner;
public class p77_DiaSemana {
/**
 * Evalúa el número ingresado y determina el día que corresponda al número
 * @param dia (int) El número a evaluar
 * @return El día de la semana en letra
 */
    public static String obtenerDiaSemana(int dia) {
        if (dia < 1 || dia > 7) {
            return "Ese número no es válido";
        }

        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Lunes";
            case 3:
                return "Martes";
            case 4:
                return "Miércoles";
            case 5:
                return "Jueves";
            case 6:
                return "Viernes";
            case 7:
                return "Sábado";
            default:
                return "Ese número no es válido"; // Redundante pero por seguridad
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.err.println("Elige un número del 1 al 7");
        int dia = obj.nextInt();

        String diaSemana = obtenerDiaSemana(dia);
        System.out.println(diaSemana);
        obj.close();
    }
}
