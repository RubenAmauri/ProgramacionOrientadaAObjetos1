/** p36_CompraPizza
 * Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%.
Depende del total de la compra, el programa imprimirá el tamaño de la compra, la cantidad, el total neto,
el descuento y el total con descuento
 */

import java.util.Scanner;
public class p36_CompraPizza {
    @SuppressWarnings("resource")

    public static void main(String[] args){
        String tam; //Tamaño de la pizza
        double descuento = 0;
        double total=0;
        double precio=0;
        double cantidad;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("Elige el tamaño de la pizza (Chica, mediana o grande)");
        tam = obj.nextLine();
        System.out.println("Elige la cantidad que va a comprar");
        cantidad = obj.nextDouble();
        switch (tam) {
            case "Chica":
                precio = 5;
                break;
            case "Mediana":
                precio=10;
                break;
            case "Grande":
                precio=20;
                break;
            default: System.out.println("Escriba una opción válida de tamaño");
                break;
        }
        total = precio * cantidad;
        if (total >=2000) {
            descuento = total*0.85;
        }
        System.out.printf("Se encargaron %.0f pizzas con un precio total de %.2f, se le aplicó un descuento de %.2f, y con descuento aplicado fueron %.2f\n", 
                          cantidad, total, (total*0.15), descuento);
    }
    
}
