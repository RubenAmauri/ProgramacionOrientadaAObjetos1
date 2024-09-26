package p94_Empleado01;


public class Empleado {
    public String Nombre;
    public int Edad;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Edad=").append(Edad);
        sb.append('}');
        return sb.toString();
    }


}
