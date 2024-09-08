//p10_HipotenusaTriangulo - Calcula la hipotenusa de un triángulo dados sus lados

import java.util.Scanner;
public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.println("Ingrese la longitud 1: ");
        double long1 = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese la longitud 2: ");
        double long2 = new Scanner(System.in).nextDouble();
        double hipotenusa = Math.pow((long1*long1+long2*long2), 2);
        System.out.printf("La hipotenusa es: " + hipotenusa);
    }
}
