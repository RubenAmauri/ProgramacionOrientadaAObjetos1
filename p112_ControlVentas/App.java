package p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        Tienda mitienda = new Tienda("Brusli Store", "Brusli López", "Dubai.com");
        mitienda.agregarCliente(new Cliente("Mosillo", "Dubai 2", "aldojoto@gmail.com"));
        mitienda.agregarCliente(new Cliente("Grupo Firme", "5 de mayo", "grupofirme@gmail.com"));
        mitienda.agregarCliente(new Cliente("Kimberly Loaiza", "Las lomas", "kimloaiza@gmail.com"));
        mitienda.agregarCliente(new Cliente("kiki", "mi casas", "aldojoto69@gmail.com"));

        mitienda.getClientes().get(0).agregarVenta(new VentaContado("Martillo", 10, 60.50, 0, 0.10, "Sacabrocados"));
        mitienda.getClientes().get(0).agregarVenta(new VentaCredito("Pala", 2, 1170.55, 0, 3, 0.10 ));

        System.out.print("\033[H\033[2J");
        System.out.flush();
        mitienda.reporte();
    }
}