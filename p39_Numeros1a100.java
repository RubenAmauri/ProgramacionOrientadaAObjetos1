// p39_Numeros1a100 - Imprime los números del 1 al 100 usando ciclo while
public class p39_Numeros1a100 {
    public static void main(String[] args) {
        int c;
        c=1;
        System.out.print("\033[H\033[2J"); System.out.flush();
        while( c <= 100 ) {
        System.out.print(c+" ");
        c++;
        }
    }
}