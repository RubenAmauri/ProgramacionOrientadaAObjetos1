//p13_VolumenCilindro - Calcula el volumen de un cilindro dados el radio y la altura

import java.util.Scanner;
public class p13_VolumenCilindro {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        System.out.println("Ingrese el radio: ");
        double radio = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = new Scanner(System.in).nextDouble();
        double volumen = Math.PI * ((radio*radio)*altura);
        System.out.println("El volumen es: " + volumen);
    }
    
}
