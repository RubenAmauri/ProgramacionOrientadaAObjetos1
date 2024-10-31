package p131_ExcepcionTemperatura;

import java.util.Scanner;
import java.util.InputMismatchException;
public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            try {
                System.out.print("Dame una temperatura en centigrados: ");
                celsius = scanner.nextDouble();
                double fahrenheit = convertirACelsius(celsius);
                System.out.printf("%.2f grados centigrados, equivale a %.2f grados fahrenheit\n", celsius, fahrenheit);
                break;
            } catch (InputMismatchException e) {
                System.out.println("La temperatura a convertir, debe ser un valor numérico");
                scanner.next(); // Descartar entrada inválida
            } catch (TemperaturaExcesiva e) {
                System.out.println("Error: " + e);
            }
        }
        scanner.close();
    }

    public static double convertirACelsius(double celsius) throws TemperaturaExcesiva {
        if (celsius > 100) {
            throw new TemperaturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        }
        return (celsius - 32) * 5 / 9;
    }
}