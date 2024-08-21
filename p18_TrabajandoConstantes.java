//p18_TrabajandoConstantes - Uso de constantes
public class p18_TrabajandoConstantes {
    static final double DESCUENTO = 0.10;
    static final int VELOCIDADLUZ = 3000;
    static final float TASA = 0.5f;
    static final byte SEPARADOR = 113; //El valor de una constante no puede ser modificado después de la primera asignación
    public static void main(String[] args){
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nEl valor de las constantes declaradas es: ");
        System.out.printf("DESCUENTO x 2: %.2f\n", DESCUENTO * 2);
        System.out.printf("VELOCIDAD / 2: %d\n", VELOCIDADLUZ / 2);
        System.out.printf("TASA : %.2f\n", TASA);
        System.out.printf("SEPARADOR : %d\n", SEPARADOR);
    }
}