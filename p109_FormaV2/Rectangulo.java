package p109_FormaV2;

public class Rectangulo extends Forma {
    private double Largo, Ancho;

    public Rectangulo(double largo, double ancho) {
    }

    public Rectangulo(String color, boolean relleno, double largo, double ancho) {
        super(color, relleno);
        Largo = largo;
        Ancho = ancho;
    }

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override
    public double getArea() {
        return Largo * Ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (Largo + Ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + ", Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }
}
