//p15_ConvertirADolares - Convierte una cantidad x de pesos en dólares

import java.util.Scanner;
public class p15_ConvertirADolares {
    public static void main(String[] args) {
        System.out.println("Cuántos pesos quiere convertir? ");
        double pesos = new Scanner(System.in).nextDouble();
        double dolares = pesos * 0.053;
        System.out.println(pesos + " pesos equivalen a " + dolares + " dólares");
    }
    
}
