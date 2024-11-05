//p06_PromedioCalificaciones - Calcula la suma y el promedio de 3 calicaciones

import java.util.Scanner;

public class p06_PromedioCalificaciones {

    public static void main(String[] args) {
        float cal1, cal2, cal3;
        float suma, prom, min, max;
        Scanner obj = new Scanner(System.in);

        System.out.println("Calculando el promedio de 3 calificaiones, también la mayor y la menor de ellas \n");
        System.out.println("Dame la calificación 1: "); cal1 = obj.nextFloat();
        System.out.println("Dame la calificación 2: "); cal2 = obj.nextFloat();
        System.out.println("Dame la calificación 3: "); cal3 = obj.nextFloat();

        suma = cal1 + cal2 + cal3;
        prom = suma/3;
        max = Math.max(Math.max(cal1,cal2),cal3);
        min = Math.min(Math.min(cal1,cal2),cal3);
        System.out.printf("\nLos valores de las calificaciones son %.2f, %.2f, %.2f", cal1, cal2, cal3);
        System.out.printf("La suma de las calificaciones es %.2f\n", suma);
        System.out.printf("El promedio es:  %.2f\n", prom);
        System.out.printf("Máximo valor: %.2f\n", max);
        System.out.printf("Mínimo valor %.2f\n", min);
        obj.close();
    }
}