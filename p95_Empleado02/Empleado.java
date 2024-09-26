package p95_Empleado02;

public class Empleado {
    private String Nombre;
    private int Edad;

    //Crear método para modificar el nombre
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }    

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
