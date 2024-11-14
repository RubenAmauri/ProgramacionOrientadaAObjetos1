package p146_EstudianteGUI_V2;

import java.io.*;
import java.util.ArrayList;

public class Utileria {
    public static ArrayList<Estudiante> inicializarDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez", 22, 34.5, "jperez@gmail.com"));
        datos.add(new Estudiante("Brusli López", 18, 22.5, "bruslopez@gmail.com"));
        datos.add(new Estudiante("Carlos Fuentes", 30, 22.5, "cfuentes@msn.com"));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Estudiante> desSerializarDatos(String archivo) throws IOException,
            ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }
}