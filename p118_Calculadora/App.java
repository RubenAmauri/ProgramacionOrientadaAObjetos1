package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora maizoro = new Calculadora();

        System.out.println("\033[H\033[2J");
        maizoro.sumar(10, 30);
        maizoro.restar(100, 50);
        maizoro.multiplicar(100, 100);
        maizoro.dividir(150000, 25);
    }
}
