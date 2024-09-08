/**
 * p32_PagoEstacionamiento - El usuario elije un tipo de estacionamiento el cual tiene un
impuesto según la zona donde se ubica:
• Estacionamiento Norte - 3%
• Estacionamiento Sur - 5%
• Estacionamiento Este - 10%
• Estacionamiento Oeste - 20%
Luego ingresa el pago por estacionamiento, Finalmente calcular y mostrar el pago total en base al estacionamiento seleccionado y el impuesto aplicado al pago.
 */

 import java.util.Scanner;
public class p32_PagoEstacionamiento {
    public static void main(String [] args){
        int op;
        float tasa=0, impuesto=0, pago=0, total=0;
        String salida = "";
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige el estacionamiento en el que se estacionará\n");
        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");
        System.out.print("Elige opción: "); op =obj.nextInt();
        System.out.print("Pago efectuado: "); pago = obj.nextFloat();

        switch (op){
            case 1 : tasa = 0.03f;break;
            case 2 : tasa = 0.05f;break;
            case 3 : tasa = 0.10f;break;
            case 4 : tasa = 0.15f;break;
            default : System.out.println("Opción Inválida");break;
        }
        impuesto = pago*tasa;
        total = pago + impuesto;
        salida = String.format("\nElegiste el estacionamiento %d \n" +
        "Pagaste %.2f por el tiempo de uso \n" +
        "Corresponde un impuesto de %,.2f \n" +
        "El pago total es de %,.2f",op,pago,impuesto,total);
        System.out.println(salida);
    }
    
}
