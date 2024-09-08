// p33_NumerosConsecutivos - Pide al usuario tres números y determina si son consecutivos

import java.util.Scanner;
public class p33_NumerosConsecutivos {
    public static void main(String[] args){
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Ingresa los tres números en orden");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();

        if (n1==n2-1 && n2==n3-1){
            System.out.print("Los números " + n1 + ", " + n2 +" y " + n3 + " son consecutivos");
        } else System.out.print("Esos números no son consecutivos");
    }
    
}
