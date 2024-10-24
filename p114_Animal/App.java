package p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Gato migato = new Gato();
        migato.sonido();
        migato.dormir();
    }
}