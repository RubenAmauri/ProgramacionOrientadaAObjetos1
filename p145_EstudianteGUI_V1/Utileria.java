package p145_EstudianteGUI_V1;

import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Estudiante> inicializarDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Brusli López", 18, 22.5, "bruslopez@gmail.com"));
        datos.add(new Estudiante("Carlos Fuentes", 30, 22.5, "cfuentes@msn.com"));
        return datos;
    }
}