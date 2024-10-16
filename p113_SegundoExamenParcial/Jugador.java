package p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected String Descripcion;
    protected double Salario;
    protected double Total;

    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        Nombre = nombre;
        Sexo = sexo;
        Descripcion = descripcion;
        Salario = salario;
    }
    
    public abstract double getBono();
    
    public char getSexo() {
        return Sexo;
    }

    public double getTotal() {
        return Total;
    }

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario
                + ", Total=" + Total + "]";
    }

}
