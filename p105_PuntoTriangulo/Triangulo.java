package p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    // Constructores
    
    public Triangulo() {
    }
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    // Get - Set
    public Punto getV1() {
        return v1;
    }
    public void setV1(Punto v1) {
        this.v1 = v1;
    }
    public Punto getV2() {
        return v2;
    }
    public void setV2(Punto v2) {
        this.v2 = v2;
    }
    public Punto getV3() {
        return v3;
    }
    public void setV3(Punto v3) {
        this.v3 = v3;
    }

    // Método para calcular el perímetro del triángulo
    public double getPerimetro() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);
        return lado1 + lado2 + lado3;
    }

    // Método para determinar el tipo de triángulo
    public String getTipo() {
        double lado1 = v1.getDistancia(v2);
        double lado2 = v2.getDistancia(v3);
        double lado3 = v3.getDistancia(v1);

        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    // toString
    @Override
    public String toString() {
        return "Triangulo [V1=" + v1 + ", V2=" + v2 + ", V3=" + v3 + "]";
    }
}
