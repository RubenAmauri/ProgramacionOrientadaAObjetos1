package p97_Empleado04;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int h=0, m=0, casado=0, soltero=0;

        Empleado empleado1 = new Empleado("Luis Brusli Gutiérrez", 35, 'H', true);
        Empleado empleado2 = new Empleado("Brusla López", 34, 'M', false);
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(new Empleado("Brusli López", 18, 'H', false));
        empleados.add(new Empleado("Bruslita", 19, 'M', false));

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Todos los empleados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());

            if (empleado.getSexo()=='H') h++;
            if (empleado.getSexo()=='M') m++;

            if (empleado.isCasado()) casado++; else soltero++;
        }
        System.out.println("Hombres: " + h + "; Mujeres: " + m);
        System.out.println("Casados: " + casado + "; Solteros: " + soltero);
    }
}
