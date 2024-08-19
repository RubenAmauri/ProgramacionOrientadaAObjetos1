//p11_CalcularAngulo - Calcula el ángulo de un triángulo dados sus otros ángulos
import java.util.Scanner;
public class p11_CalcularAngulo {
    public static void main(String[] args){
        System.out.println("Ingresa el ángulo 1: ");
        double ang1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingresa el ángulo 2: ");
        double ang2 = new Scanner(System.in).nextDouble();
        double ang3 = 180 - (ang1+ang2);
        System.out.println("El angulo 3 es: " + ang3);
    }
}
