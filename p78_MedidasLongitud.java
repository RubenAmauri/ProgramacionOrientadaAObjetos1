/**
 * p70_MedidasLongitud - Convierte de centímetros a pulgadas y 
 * de metros a pies; Usando una función.
 */
import java.util.Scanner;
public class p78_MedidasLongitud {
    public static void main(String[] args) {
        int op;
        float medida;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            // Mostrar el menú
            System.out.println("Conversión de Unidades");
            System.out.println("1.- Pulgadas a Centímetros\n2.- Metros a Pies\n3.- Salir");
            System.out.print("Opción: ");
            op = obj.nextInt();

            // Procesar la opción seleccionada
            switch (op) {
                case 1:
                    System.out.println("Pulgadas a Centímetros");
                    System.out.print("Ingrese la medida en pulgadas: ");
                    medida = obj.nextFloat();
                    System.out.printf("El resultado es: %.2f cm\n\n", convertirACentimetros(medida));
                    break;
                case 2:
                    System.out.println("Metros a Pies");
                    System.out.print("Ingrese la medida en metros: ");
                    medida = obj.nextFloat();
                    System.out.printf("El resultado es: %.2f pies\n\n", convertirAPies(medida));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (op != 3);
        obj.close();
    }

    /**
     * Convierte pulgadas a centímetros
     * @param pulgadas (float) Recibe un valor en pulgadas
     * @return El valor de las pulgadas convertidas en centímetros
     */
    public static float convertirACentimetros(float pulgadas) {
        return pulgadas * 2.54f;
    }

    /**
     * 
     * @param metros (float) Recibe un valor en metros
     * @return El valor de los metros convertidas a pies
     */
    public static float convertirAPies(float metros) {
        return metros * 3.281f;
    }
}
