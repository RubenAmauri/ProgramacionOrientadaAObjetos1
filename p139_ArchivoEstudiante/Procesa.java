package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    @SuppressWarnings("resource")
    public static void capturaDatos(ArrayList<Estudiante> estudiantes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIntroduce los datos del estudiante (nombre vacío para terminar):");
        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            if (nombre.isEmpty()) break;

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            System.out.print("Sexo (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); 

            estudiantes.add(new Estudiante(nombre, edad, promedio, sexo));
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Estudiante> estudiantes) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
        salida.writeObject(estudiantes);
        salida.close();
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) entrada.readObject();
        entrada.close();
        return estudiantes;
    }

    public static void mostrarDatos(ArrayList<Estudiante> estudiantes) {
        System.out.println("\nLista de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public static double calcularPromedioCalificaciones(ArrayList<Estudiante> estudiantes) {
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return estudiantes.size() > 0 ? suma / estudiantes.size() : 0;
    }

    public static double calcularPromedioEdades(ArrayList<Estudiante> estudiantes) {
        int suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getEdad();
        }
        return estudiantes.size() > 0 ? (double) suma / estudiantes.size() : 0;
    }

    public static int contarHombres(ArrayList<Estudiante> estudiantes) {
        int hombres = 0;
        for (Estudiante e : estudiantes) {
            if (e.getSexo() == 'M' || e.getSexo() == 'm') hombres++;
        }
        return hombres;
    }

    public static int contarMujeres(ArrayList<Estudiante> estudiantes) {
        int mujeres = 0;
        for (Estudiante e : estudiantes) {
            if (e.getSexo() == 'F' || e.getSexo() == 'f') mujeres++;
        }
        return mujeres;
    }
}

