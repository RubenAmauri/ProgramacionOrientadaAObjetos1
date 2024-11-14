package p147_TercerExamenParcial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UtileriaJugador {
    
    public static void guardarJugadores(List<Jugador> jugadores, String archivo) {
        try (var oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(jugadores);
        } catch (IOException ex) {
            System.err.println("Error al guardar los jugadores: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")

    public static List<Jugador> cargarJugadores(String archivo) {
        List<Jugador> jugadores = new ArrayList<>();
        try (var ois = new ObjectInputStream(new FileInputStream(archivo))) {
            jugadores = (List<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error al cargar los jugadores: " + ex.getMessage());
        }
        return jugadores;
    }
}
