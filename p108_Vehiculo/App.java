package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Vehiculo[] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        vehiculos[1] = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        vehiculos[2] = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        vehiculos[3] = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        System.out.println("Datos de los Vehículos de la flota");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }

        System.out.println("Calculando el total de precio de todos los vehículos ...");
        double sumaPrecios = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getPrecio());
            sumaPrecios += vehiculo.getPrecio();
        }

        System.out.println("La suma de precios es: " + sumaPrecios);
    }
}