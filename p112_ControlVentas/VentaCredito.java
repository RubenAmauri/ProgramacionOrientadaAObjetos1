package p112_ControlVentas;

public class VentaCredito extends Venta{
    private int Meses;
    private double Interes;

    public VentaCredito(String artículo, int cantidad, double precio, double total, int meses, double interes) {
        super(artículo, cantidad, precio, total);
        Meses = meses;
        Interes = interes;
    }

    @Override
    public double getTotalVenta() {
        Total = Total + (Meses * Interes);
        return Total;
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + " Meses=" + Meses + ", Interes=" + Interes + ", Total=" + getTotalVenta() + "]";
    }
}
