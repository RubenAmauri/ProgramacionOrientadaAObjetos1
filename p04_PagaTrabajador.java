// p04_PagaTrabajador - Calcula la paga de un trabajador

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando la paga de un trabajador\n");
        // Entrada
        System.out.print("Nombre del trabajador: ");
        nombre = obj.nextLine();
        System.out.print("Horas trabajadas: ");
        horas = obj.nextInt();
        System.out.print("Paga por hora: ");
        paga = obj.nextDouble(); 

        tasa = 0.03;
        // Proceso
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        // Salida
        System.out.println(String.format("El trabajador %s trabajó %d horas con una paga de %.2f pesos y una tasa de %.2f", nombre, horas, paga, tasa));
        System.out.println(String.format("Paga bruta: %.2f", pagabruta));
        System.out.println(String.format("Impuesto: %.2f", impuesto));
        System.out.println(String.format("Paga neta: %.2f", paganeta));

        obj.close(); 
    }
}