// p37_CalculoNotas - Se le pide al usuario 5 calificaciones y muestra un mensaje de acuerdo al promedio obtenido

import java.util.Scanner;
public class p37_CalculoNotas {
    @SuppressWarnings("resource")

    public static void main(String[] args) {
        int n;
        float cal, suma, promedio;
        Scanner obj = new Scanner(System.in);
        cal=suma=promedio=0;
        n=1;
        System.out.print("\033[H\033[2J"); System.out.flush();
        while (n<=5){
            System.out.printf("\nIngresa la calificación %d: ", n);
            cal = obj.nextFloat();
            suma = suma+cal;
            n++;
        }
        promedio=suma/5;
        if (promedio >=0 && promedio<=6) System.out.printf("\nTienes promedio de %.2f, quedas reprobado", promedio);
        else if (promedio>6 && promedio<=7) System.out.printf("\nTienes promedio de %.2f, pasas de panzaso", promedio);
        else if (promedio>7 && promedio<=8) System.out.printf("\nTienes promedio de %.2f, muy bien, puedes mejorar", promedio);
        else if (promedio>8 && promedio<=9) System.out.printf("\nTienes promedio de %.2f, Excelente sigue así", promedio);
        else if (promedio>9 && promedio<=10) System.out.printf("\nTienes promedio de %.2f, Perfecto, tu esfuerzo valió la pena", promedio);
    }
    
}
