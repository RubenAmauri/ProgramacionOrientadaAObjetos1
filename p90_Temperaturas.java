/**
 * p90_Temperaturas - Este programa inicializará arreglos con valores fijos y mostrará en pantalla lo siguiente:
 * El primer elemento
* Al tercer elemento
* Los elementos del arreglo
* Ponga a 0 todos los elementos mayores a 10
* Muestre nuevamente los elementos del arreglo
 */
public class p90_Temperaturas {

    public static void main(String[] args) {
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("El primer elemento es: " + temperaturas[0]);

        System.out.println("El tercer elemento es: " + temperaturas[2]);

        System.out.println("\nElementos del arreglo:");
        for (float temp : temperaturas) {
            System.out.printf("%.2f ", temp);
        }

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }

        System.out.println("\n\nElementos del arreglo después de poner a 0 los mayores a 10:");
        for (float temp : temperaturas) {
            System.out.printf("%.2f ", temp);
        }
    }
}
