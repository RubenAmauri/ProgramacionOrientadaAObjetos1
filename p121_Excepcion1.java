public class p121_Excepcion1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        try {
            int c = a/b;
            System.out.println("El resultado es : =" + c);
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero" + e.getMessage());
        } finally {
            System.out.println("Este mensaje se imprime se genere o no la excepción");
        }
        System.out.println("Ya no hay problema");
    }
}
