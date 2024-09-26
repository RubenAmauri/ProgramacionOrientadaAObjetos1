package p97_Empleado04;

public class Empleado {
    private String Nombre;
    private int Edad;
    private char Sexo;
    private boolean Casado;

    //Constructores
    public Empleado() {}
    public Empleado(String nombre, int edad, char sexo, boolean casado) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        Casado = casado;
    }

    //Setters y getters
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
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char sexo) {
        Sexo = sexo;
    }
    public boolean isCasado() {
        return Casado;
    }
    public void setCasado(boolean casado) {
        Casado = casado;
    }

    //Método toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Edad=").append(Edad);
        sb.append(", Sexo=").append(Sexo);
        sb.append(", Casado=").append(Casado);
        sb.append('}');
        return sb.toString();
    }
}
