/**
 * p28_LeyDeNewton - Calcula la segunda ley de Newton
 */
import java.util.Scanner;
public class p28_LeyDeNewton {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        float fuerza, masa, aceleracion;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.println("Elige la opción a calcular");
        System.out.println("[F]uerza (f = m * a)");
        System.out.println("[M]asa (m = f / a)");
        System.out.println("[A]celeración (a = f / m)");
        System.out.println("[S]alir");
        System.out.print("Elige una opción: "); op = obj.next().charAt(0);

        if (op=='F'){
            System.out.print("Ingresa la masa: "); masa = obj.nextFloat();
            System.out.print("Ingresa la aceleración: "); aceleracion = obj.nextFloat();
            fuerza = masa * aceleracion;
            System.out.printf("La fuerza es %.2f", fuerza);
        } else if (op == 'M') {
            System.out.print("Ingresa la fuerza: "); fuerza = obj.nextFloat();
            System.out.print("Ingresa la aceleración: "); aceleracion = obj.nextFloat();
            masa = fuerza / aceleracion;
            System.out.printf("La masa es %.2f", masa);
        } else if (op=='A') {
            System.out.print("Ingresa la fuerza: "); fuerza = obj.nextFloat();
            System.out.print("Ingresa la masa: "); masa = obj.nextFloat();
            aceleracion = fuerza / masa;
            System.out.printf("La aceleración es %.2f", aceleracion);
        } else {
            System.out.println("Saliendo...");
        }
    }
}
