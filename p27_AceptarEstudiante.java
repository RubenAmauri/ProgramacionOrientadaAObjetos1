/**
 * p27_AceptarEstudiante - Acepta un estudiante en base a su edad y calificaciones
 * Edad >=18, Calificaciones c1>8 y c2 >8
 */
import java.util.Scanner;
public class p27_AceptarEstudiante {
    public static void main(String [] args){
        String nombre;
        int edad;
        double c1, c2;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Universidad\nSistema de admisión");
        System.out.print("Dame tu nombre: "); nombre = obj.nextLine();
        System.out.print("Dame tu edad: "); edad = obj.nextInt();

        if (edad <18) System.out.println("No se aceptan menores de edad");
        else {
            System.out.print("Dame la calificacion 1: "); c1 = obj.nextFloat();
            System.out.print("Dame la calificacion 2: "); c2 = obj.nextFloat();
            if (c1 <8 || c2 <8) System.out.print("No cumples con la calificación mínima para entrar");
            else System.out.print(nombre + " has sido aceptado");
        }
        System.out.println("\nTerminado");
    }
    
}
