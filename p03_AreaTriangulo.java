// p03_AreaTriangulo - Calcula el area de un triangulo

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el area de un triangulo:\n");
        System.out.print("Dame la base: ");
        base = obj.nextDouble();
        System.out.print("Dame la altura: ");
        altura = obj.nextDouble();

        area = (base * altura) / 2;

        System.out.println("Para un triangulo de base " + base + " y altura de " + altura + " el area es " + area);

        System.out.println(String.format("Para un triangulo de base %.2f y una altura de %.2f el area es %.2f", base, altura, area));

        obj.close();
    }
}
