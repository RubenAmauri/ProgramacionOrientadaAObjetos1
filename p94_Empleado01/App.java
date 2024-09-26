package p94_Empleado01;

// Programa principal
public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); //Instanciar
        empleado1.Nombre = "Luis Brusli Gutiérrez"; //Asignar valores
        empleado1.Edad = 25;
        Empleado empleado2 = new Empleado();
        empleado2.Nombre = "Brusla Lopez";
        empleado2.Edad = 45;

        Empleado empleado3;
        empleado3 = new Empleado(); //Instanciar
        empleado3.Nombre = "Bruslito"; //Asignar valores
        empleado3.Edad = 15;

        System.out.println("Empleado 1 nombre: " + empleado1.Nombre);
        System.out.println("Empleado 1 edad: " + empleado1.Edad);
        System.out.println(empleado1.toString()); //Invocar método toString() del objeto
        System.out.println("Empleado 2 nombre: " + empleado2.Nombre);
        System.out.println("Empleado 2 edad: " + empleado2.Edad);
        System.out.println(empleado2.toString()); //Invocar método toString() del objeto
        System.out.println("Empleado 3 nombre: " + empleado3.Nombre);
        System.out.println("Empleado 3 edad: " + empleado3.Edad);
        System.out.println(empleado3.toString()); //Invocar método toString() del objeto
    }
}
