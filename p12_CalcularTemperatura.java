//p12_CalcularTemperatura - Convierte una cantidad de grados fahrenheit en grados celsius

import java.util.Scanner;
public class p12_CalcularTemperatura {
    public static void main(String[] args){
        System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
        double fahrenheit = new Scanner(System.in).nextDouble();
        double celsius = (fahrenheit-32);
        celsius = celsius * 5/9;
        System.out.println(fahrenheit +" grados Fahrenheit son igual a " + celsius + " grados celsius");
    }
    
}
