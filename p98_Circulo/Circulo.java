package p98_Circulo;

public class Circulo {
    private double radio;

    // Constructores
    public Circulo() {}
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Set - Get
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Circulo [Radio=" + radio + "]";
    }
}
