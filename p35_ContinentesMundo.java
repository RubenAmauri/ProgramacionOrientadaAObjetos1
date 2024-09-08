// p35_ContinentesMundo - Pide al usuario un número entre 1 a 7 y muestra el continente al que corresponde tal número

import java.util.Scanner;
public class p35_ContinentesMundo {
    public static void main(String[] args){
        int op;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Ingresa un número en el rango de 1-7");
        op = obj.nextInt();
        switch (op) {
            case 1:
                System.out.println("Asia");
                break;
            case 2:
                System.out.println("África");
                break;
            case 3:
                System.out.println("América del norte");
                break;
            case 4:
                System.out.println("América del sur");
                break;
            case 5:
                System.out.println("Antártica");
                break;
            case 6:
                System.out.println("Europa");
                break;
            case 7:
                System.out.println("Oceanía");
                break;
            default: System.out.println("Error: ese número no es válido8");
                break;
        }
    }
    
}
