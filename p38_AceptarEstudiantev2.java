// p38_AceptarEstudiantev2 - Dadas las especificaciones de un estudiante, se determina si es aceptado en la universidad

import java.util.Scanner;
public class p38_AceptarEstudiantev2 {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        String nombre;
        char sexo;
        int edad;
        double c1, c2, c3, promedio;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Universidad Kitty Kat SA\nSistema de admisión");
        System.out.print("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.print("Sexo (h/m): "); sexo = Character.toUpperCase(obj.next().charAt(0));
        System.out.print("Dame tu edad: "); edad = obj.nextInt();

        if (sexo != 'M' || edad < 21) {
            System.out.println("No cumples con los requisitos de sexo o edad.");
        } else {
            System.out.print("Dame la calificación 1: "); c1 = obj.nextFloat();
            System.out.print("Dame la calificación 2: "); c2 = obj.nextFloat();
            System.out.print("Dame la calificación 3: "); c3 = obj.nextFloat();
            
            promedio = (c1 + c2 + c3) / 3;
            
            if (promedio < 8 || promedio > 9.5) {
                System.out.println("No cumples con el promedio requerido para entrar.");
            } else {
                System.out.println(nombre + ", has sido aceptada.");
            }
        }
        System.out.println("\nTerminado");
    }
}
