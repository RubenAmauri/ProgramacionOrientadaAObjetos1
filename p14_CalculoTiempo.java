//p14_CalculoTiempo - Calcula el número de días, minutos y segundos que se encuentran dentro de un número dado de horas

import java.util.Scanner;
public class p14_CalculoTiempo {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        System.out.println("Ingresa la cantidad de horas: ");
        int horas = new Scanner(System.in).nextInt();
        int dias = horas/24;
        int minutos = horas*60;
        int segundos = minutos*60;
        System.out.println(horas + " horas equivalen a " + dias + " dias, " + minutos + " minutos y " + segundos + " segundos");
    }
}
