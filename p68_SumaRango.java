// p68_SumaRango - Suma un rango de números enteros especificados por un inicio y un final

import java.util.Scanner;
public class p68_SumaRango {
    public static int SumaRango(int inicio, int fin){
        int suma=0;
        for (int i = inicio; i <= fin; i++){
            suma = suma + i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int suma = 0, ini, fin;

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        do { 
            System.out.print("Dame el inicio: "); ini = obj.nextInt();
            System.out.print("Dame el fin: "); fin = obj.nextInt();
            
        } while (ini > fin);
        suma = SumaRango(ini, fin);
        System.out.println("\nLa suma del rango es: " + suma);
    }
    
}
