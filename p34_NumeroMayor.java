// p34_NumeroMayor - Se le piden al usuario tres números enteros y se determina cuál es el mayor

import java.util.Scanner;
public class p34_NumeroMayor {
    public static void main(String[] args){
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Ingresa los tres números en orden");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        if (n1>=n2 && n1>=n3) System.out.print(n1 + " es el número mayor"); else if (n2>=n1 && n2>=n3) System.out.print(n2 + " es el número mayor"); else if (n3>=n1 && n3>=n2) System.out.print(n3 + " es el número mayor");
    }
}