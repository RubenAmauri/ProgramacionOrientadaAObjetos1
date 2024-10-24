package p115_Telefono;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Telefono mitelefono = new Telefono();
        mitelefono.obtenerCoordenadas();
        mitelefono.iniciarRadio();
        mitelefono.detenerRadio();
    }
}