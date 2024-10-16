package p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int Partidos;
    private int Goles;

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        Partidos = partidos;
        Goles = goles;
        Total=Salario+getBono();
    }

    @Override
    public double getBono() {
        double Bono = (Salario * 0.10) + (Partidos * 50) + (Goles * 5);
        return Bono;
    }

    @Override
    public String toString() {
        return "JugadorActivo [" + super.toString() + " Bono=" + getBono() + "Partidos=" + Partidos + ", Goles=" + Goles + " Total=" + (Salario+getBono()) + "]";
    }
}
