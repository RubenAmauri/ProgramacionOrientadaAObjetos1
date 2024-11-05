// p30_ DiaSemana - Dado un número entre 1 y 7, nos imprime el día de la semana correspondiente

import java.util.Scanner;
public class p30_DiaSemana {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.err.println("Elige un número del 1 al 7");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunes"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Miércoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Ese número no es válido");
        }
    }
}
