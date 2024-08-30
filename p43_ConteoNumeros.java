// p43_ConteoNumeros - Cuenta los números introducidos por el usuario

import java.util.Scanner;
public class p43_ConteoNumeros {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int c, n, suma, contadorP, contadorN, contadorC;
        c=n=contadorP=suma=contadorN=contadorC=0;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Cuenta los números introducidos por el usuario" +
        "\nIntroduzca 999 para salir");
        do {
            System.out.print("Introduzca un número: ");
            n = obj.nextInt();
            if (n!=999){
                c++; suma+=n;
                if (n>0) contadorP++; else if (n<0) contadorN++; else if (n==0) contadorC++;
            } 
        } while (n !=999);
        System.out.printf("\nSe contaron %d números", c);
        System.out.printf("\nLa suma es: %d ", suma);
        System.out.printf("\nSe contaron %d números positivos", contadorP);
        System.out.printf("\nSe contaron %d números negativos", contadorN);
        System.out.printf("\nSe contaron %d cero(s)", contadorC);
    }
    
}
