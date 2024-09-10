/*
 * Una escuela ha organizado un curso de técnicas avanzadas de programación y desea llevar el control de la
*inscripción de los participantes y el dinero recaudado.
* El usuario ingresará nombre, edad, sexo y tipo de participante
 */

import java.util.Scanner;

public class ep01_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        final int costo_alumno = 40;
        final int costo_docente = 60;
        final int costo_trabajador = 80;

        String nombre;
        char sexo, tipo;
        int edad, conteoTotal, conteoAlumno, conteoDocente, conteoTrabajador, conteoHombres, conteoMujeres, conteoRechazado;
        conteoTotal = conteoAlumno = conteoDocente = conteoTrabajador = conteoHombres = conteoMujeres = conteoRechazado = 0;

        int dineroTotal, dineroAlumno, dineroDocente, dineroTrabajador;
        dineroTotal = dineroAlumno = dineroDocente = dineroTrabajador = 0;

        double promedioEdad = 0;
        double sumaEdad = 0;
        String repite = "S";

        while (repite.equalsIgnoreCase("S")) {
            System.out.print("Ingresa tu nombre: ");
            nombre = obj.next();
            System.out.println("\nIngresa tu edad: ");
            edad = obj.nextInt();
            System.out.println("\nIngresa tu sexo (H/M): ");
            sexo = obj.next().toUpperCase().charAt(0);
            System.out.println("\n(A)lumno - (D)ocente - (T)rabajador: ");
            tipo = obj.next().toUpperCase().charAt(0);

            if (edad < 23) {
                System.out.println("Lo sentimos, " + nombre + ". Solo los participantes de 23 años o más pueden inscribirse.");
                conteoRechazado++;
                System.out.print("¿Desea inscribir otro participante? (S/N): ");
                repite = obj.next();
                continue;
            }

            System.out.println("\nBienvenido, " + nombre + ". Edad: " + edad + ", Sexo: " + (sexo == 'H' ? "Hombre" : "Mujer"));
            switch (tipo) {
                case 'A':
                    conteoAlumno++;
                    dineroAlumno += costo_alumno;
                    dineroTotal += dineroAlumno;
                    break;
                case 'D':
                    conteoDocente++;
                    dineroDocente += costo_docente;
                    dineroTotal += dineroDocente;
                    break;
                case 'T':
                    conteoTrabajador++;
                    dineroTrabajador += costo_trabajador;
                    dineroTotal += dineroTrabajador;
                    break;
                default:
                    System.out.println("Tipo de participante no válido.");
                    System.out.print("¿Desea inscribir otro participante? (S/N): ");
                    repite = obj.next();
                    continue;
            }

            conteoTotal++;
            sumaEdad += edad;

            if (sexo == 'H') {
                conteoHombres++;
            } else if (sexo == 'M') {
                conteoMujeres++;
            }

            System.out.print("¿Agregar otro participante? (S/N)? ");
            repite = obj.next();
        }
        promedioEdad = sumaEdad / conteoTotal;

        System.out.println("\n--------------------------------------------");
        System.out.println("Resumen de inscripciones:");
        System.out.println("--------------------------------------------");
        System.out.println("Total de Alumnos: " + conteoAlumno);
        System.out.println("Total de Docentes: " + conteoDocente);
        System.out.println("Total de Trabajadores: " + conteoTrabajador);
        System.out.println("Total de Hombres: " + conteoHombres);
        System.out.println("Total de Mujeres: " + conteoMujeres);
        System.out.println("Total de Participantes: " + conteoTotal);
        System.out.println("Promedio de Edad: " + promedioEdad);
        System.out.println("Total de Rechazados: " + conteoRechazado);
        System.out.println("--------------------------------------------");
        System.out.println("Total dinero recaudado de Alumnos: $" + dineroAlumno);
        System.out.println("Total dinero recaudado de Docentes: $" + dineroDocente);
        System.out.println("Total dinero recaudado de Trabajadores: $" + dineroTrabajador);
        System.out.println("Total dinero recaudado en general: $" + dineroTotal);
        System.out.println("--------------------------------------------");

        if (dineroTotal < 50) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (dineroTotal < 1000) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}
