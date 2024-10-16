package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total=Salario+getBono();
    }

    @Override
    public double getBono(){
        double Bono=(Salario * 0.15)+ (Proyectos * 100)+ (Subordinados * 10);
        return Bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() +  " Bono= " + getBono() + " Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + " Total=" + (Salario+getBono()) + "]";
    }
    
}
