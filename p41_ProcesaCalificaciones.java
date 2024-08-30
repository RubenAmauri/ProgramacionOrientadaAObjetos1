// p41_ProcesaCalificaciones - El usuario introduce n calificaciones, el programa las suma y saca el promedio

import java.util.Scanner;
public class p41_ProcesaCalificaciones {
    public static void main(String[] args){
        int c, d;
        float calificacion, suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("¿Cuántas calificaciones ingresará? ");
        c = obj.nextInt();

        d=1;
        while (d<=c) {
            System.out.printf("Calificacion  #%d: ", d);
            calificacion  = obj.nextFloat();
            suma = suma + calificacion;
            d++;
        }
        promedio = suma / c;
        System.out.printf("La suma es: %.2f", suma); 
        System.out.printf("\nEl promedio es: %.2f", promedio); 
    }
}
