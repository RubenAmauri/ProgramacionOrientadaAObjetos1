//p07_OperadoresAsignacion - Efectúa diferentes operaciones usando los diferentes operadores de asignación

import java.util.Scanner;
public class p07_OperadoresAsignacion {
    public static void main(String[] args){
        System.out.print("\033 [H033[2J"); System.out.flush(); //Borra el contenido en la terminal
        System.out.println("Dame un número entero");
        float  num = new Scanner(System.in).nextFloat();

        System.out.printf("El número es: %.2f\n", num);
        System.out.printf("Incrementar en 1: %.2f\n", ++num);
        System.out.printf("Sumar 80: %.2f\n", num+=80);
        System.out.printf("Restar 35: %.2f\n", num-=35);
        System.out.printf("Multiplicar por 15: %.2f\n", num*=15);
        System.out.printf("Dividir entre 4: %.2f\n", num/=4);
        System.out.printf("Decrementar en 1: %.2f\n", num-=1);
    }
}
