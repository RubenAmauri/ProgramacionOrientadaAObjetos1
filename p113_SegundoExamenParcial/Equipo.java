package p113_SegundoExamenParcial;

import java.util.ArrayList;
public class Equipo {
    private String Nombre;
    private String Liga;
    ArrayList<Jugador> Jugadores;
    
    public Equipo() {
    }

    public Equipo(String nombre, String liga) {
        Nombre = nombre;
        Liga = liga;
        Jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }
    public void agregarJugador(Jugador jugador) {
        Jugadores.add(jugador);
    }

    public double getTotalBono(){
        double Total = 0;
        for (Jugador jugador : Jugadores) {
            Total += jugador.getBono();
        }
        return Total;
    }
    public double getTotal() {
        double total = 0;
        for (Jugador jugador : Jugadores) {
            total += jugador.getTotal();
        }
        return total;
    }

    public int getTotalH(){
        int TotalHombres=0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H'){
                TotalHombres++;
            }
        }
        return TotalHombres;
    }
    public int getTotalM() {
        int TotalMujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M') {
                TotalMujeres++;
            }
        }
        return TotalMujeres;
    }
    public void reporte() {
        System.out.println(this.toString());
        System.out.println("\n");
        for (Jugador jugador : Jugadores) {
            System.out.println("- " + jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + ", Bono=" + getTotalBono() + ", Total=" + getTotal() + ", Hombres=" + getTotalH() + ", Mujeres=" + getTotalM() + "]";
    }
    
}
