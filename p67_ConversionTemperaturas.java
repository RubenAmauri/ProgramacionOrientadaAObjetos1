// p67_ConversionTemperaturas - Convierte de grados Celsius a Fahrenheit y viceversa usando funciones

import java.util.Scanner;

public class p67_ConversionTemperaturas {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int op;
        float temp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        do {
            System.out.println("Conversión de temperaturas");
            System.out.println("1.- Celsius a Fahrenheit\n2.- Fahrenheit a Celsius\n3.-Salir");
            System.out.print("Opción: ");
            op = obj.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Celsius a Fahrenheit");
                    System.out.print("Ingrese la temperatura en grados Celsius: ");
                    temp = obj.nextFloat();
                    System.out.printf("El resultado es: %.2f\n\n", convertirAFahrenheit(temp));
                    break;
                case 2:
                    System.out.println("Fahrenheit a Celsius");
                    System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                    temp = obj.nextFloat();
                    System.out.printf("El resultado es: %.2f", convertirACelsius(temp));
                case 3:
                    System.out.println("Saliendo...");
            
                default:
                    if (op!=3) System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (op != 3);
    }

    public static float convertirACelsius(float t) {
        return (t - 32) * 5 / 9;
    }

    public static float convertirAFahrenheit(float t) {
        return (t * 9) + 32;
    }

}
