package p103_ClienteFactura;

import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static Factura Llenar(){
        Factura factura = new Factura();
        Cliente cliente = new Cliente();
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIngresa los datos de la factura y de cliente");
        System.out.print("\nID Factura: "); factura.setId(obj.nextInt());
        System.out.print("Monto: "); factura.setMonto(obj.nextDouble());
        System.out.print("ID Cliente: "); cliente.setId(obj.nextInt());
        System.out.print("Nombre cliente: "); obj.nextLine(); cliente.setNombre(obj.nextLine());
        System.out.print("Descuento cliente: "); cliente.setDescuento(obj.nextFloat());
        factura.setCliente(cliente);
        return factura;
    }
    public static void main(String[] args) {
        ArrayList<Factura> facturas = new ArrayList<>();

        Factura factura1 = new Factura(1, 1500, new Cliente(1, "Brusli Lopez", 0.03f));
        Factura factura2 = new Factura(2, 2300, new Cliente(2, "Kimberly Loaiza", 0.01f));
        facturas.add(factura1);
        facturas.add(factura2);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Factura factura3 = new Factura();
        factura3 = Llenar();
        System.out.println("Mi factura es: " + factura3.toString());
        facturas.add(factura3);
        
        Factura factura4 = new Factura();
        factura4 = Llenar();
        System.out.println("Mi otra factura es: " + factura4.toString());
        facturas.add(factura4);

        System.out.println("\nTodas las facturas:");
        for (Factura factura : facturas) {
            System.out.println("\nID Factura: " + factura.getId());
            System.out.println("Monto: " + factura.getMonto());
            System.out.println("ID Cliente: " + factura.getCliente().getId());
            System.out.println("Nombre cliente: " + factura.getCliente().getNombre());
            System.out.println("Descuento cliente: " + factura.getCliente().getDescuento());
        }
    }
}
