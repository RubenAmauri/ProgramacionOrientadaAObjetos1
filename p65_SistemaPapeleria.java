/*
 * p65_SistemaPapeleria - Este programa simulará el punto de venta de una papelería, con las siguientes características y condiciones:
 * El usuario ingresará qué tipo de hoja quiere para sus copias, siendo las opciones:
 * Tamaño carta = $3; tamaño oficio = $4; tamaño doble oficio = $6.
 * Después de elegir el tipo de hoja que se copiará, se le solicitará al usuario una cantidad de copias a imprimir, de esa cantidad se calculará el total y dependiendo del total se determinará el tipo de venta del día:
 * Venta menor a $50 - Venta moderada
 * Venta entre $50 y $100 - Venta frecuente 
 * Venta mayor a $100 - Venta superada
 */

import java.util.Scanner;

public class p65_SistemaPapeleria {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Variables que no pueden ser modificadas, para declarar los precios de los diferentes tipos de hoja
        final int PRECIO_CARTA = 3;
        final int PRECIO_OFICIO = 4;
        final int PRECIO_DOBLE_OFICIO = 6;

        //Declaración de variables, en este caso utilizamos puros enteros
        int totalVentas = 0;
        int totalCopias = 0;
        int copiasCarta = 0;
        int copiasOficio = 0;
        int copiasDobleOficio = 0;
        int totalCarta = 0;
        int totalOficio = 0;
        int totalDobleOficio = 0;
        int contadorVentas = 0;
        //Variable inicializada en "S" para entrar al ciclo
        String otraVenta = "S";

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("-----------------------------------------------------");
        System.out.println("Papelería MariaFernandaHernandezMartinez, SA. de CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("-----------------------------------------------------");
        // Entrada al ciclo que termina cuando el usuario lo decida
        while (otraVenta.equalsIgnoreCase("S")) { //En esta línea se utiliza un método que evalua que el String sea igual a "s" ignorando si es mayúscula o minúscula; Se termina cuando el usuario introduce N (O cualquier otro caracter que no sea s)
            contadorVentas++;

            System.out.println("Venta: " + contadorVentas);
            System.out.print("Tipo de copia (C)arta $3, (O)ficio $4, (D)oble Of $6? ");
            char tipoCopia = obj.next().toUpperCase().charAt(0); //Esta línea lee el primer caracter de lo que introduzca el usuario y lo convierte a mayúsculas

            System.out.print("Cantidad? ");
            int cantidad = obj.nextInt();

            switch (tipoCopia) {
                case 'C':
                    copiasCarta += cantidad;
                    totalCarta += cantidad * PRECIO_CARTA;
                    break;
                case 'O':
                    copiasOficio += cantidad;
                    totalOficio += cantidad * PRECIO_OFICIO;
                    break;
                case 'D':
                    copiasDobleOficio += cantidad;
                    totalDobleOficio += cantidad * PRECIO_DOBLE_OFICIO;
                    break;
                default:
                    System.out.println("Tipo de copia no válido");
                    contadorVentas--;  // No contar la venta inválida
                    continue;
            }

            totalCopias += cantidad;
            totalVentas += cantidad * (tipoCopia == 'C' ? PRECIO_CARTA : (tipoCopia == 'O' ? PRECIO_OFICIO : PRECIO_DOBLE_OFICIO));

            System.out.print("Otra venta (S/N)? ");
            otraVenta = obj.next();
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Resumen diario de ventas");
        System.out.println("-----------------------------------------------------");
        System.out.println("Ventas realizadas: " + contadorVentas);
        System.out.println("-----------------------------------------------------");
        System.out.println("Carta   : " + copiasCarta + " - $ " + totalCarta);
        System.out.println("Oficio  : " + copiasOficio + " - $ " + totalOficio);
        System.out.println("Doble Of.: " + copiasDobleOficio + " - $ " + totalDobleOficio);
        System.out.println("-----------------------------------------------------");
        System.out.println("Tot. Ventas : " + totalCopias + " - $ " + totalVentas);

        if (totalVentas < 50) {
            System.out.println("Esta venta es una: Venta moderada");
        } else if (totalVentas <= 100) {
            System.out.println("Esta venta es una: Venta frecuente");
        } else {
            System.out.println("Esta venta es una: Venta superada");
        }
    }
}