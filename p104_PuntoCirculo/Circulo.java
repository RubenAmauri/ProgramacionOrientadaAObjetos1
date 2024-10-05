package p104_PuntoCirculo;

public class Circulo {
    private Punto centro;
    private double radio;

    // Constructores
    public Circulo() {
    }
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    // Get - Set
    public Punto getCentro() {
        return centro;
    }
    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular la circunferencia del círculo
    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // toString
    @Override
    public String toString() {
        return "Circulo [Centro=" + centro + ", Radio=" + radio + "]";
    }
}
