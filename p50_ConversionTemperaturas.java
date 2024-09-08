// p50_ConversionTemperaturas - Se le solicita al usuario un rango de números y se utilizará ese rango para convertir temperaturas en centigrados a fahrenheit

import java.util.Scanner;
public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar='s';

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.print("Introduce la temperatura inicial en °C: ");
            int tempInicial = scanner.nextInt();
            
            System.out.print("Introduce la temperatura final en °C: ");
            int tempFinal = scanner.nextInt();
            
            if (tempFinal < tempInicial) {
                System.out.println("Error: La temperatura final no puede ser menor que la inicial.");
                continue;
            }

            System.out.println("------------------------------------");
            System.out.println("Centígrados     Farenheit");
            System.out.println("------------------------------------");

            for (int i = tempInicial; i <= tempFinal; i++) {
                double fahrenheit = (i * 9.0 / 5.0) + 32;
                System.out.printf("%d \t\t %.1f\n", i, fahrenheit);
            }

            System.out.println("------------------------------------");
            
            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));

        } while (continuar != 'N');
        
    }
}
