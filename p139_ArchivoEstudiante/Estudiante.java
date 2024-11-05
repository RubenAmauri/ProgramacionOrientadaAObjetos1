package p139_ArchivoEstudiante;
import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private int edad;
    private double promedio;
    private char sexo;

    public Estudiante(String nombre, int edad, double promedio, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPromedio() { return promedio; }
    public char getSexo() { return sexo; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio + ", Sexo: " + sexo;
    }
}
