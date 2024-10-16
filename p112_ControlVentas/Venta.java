package p112_ControlVentas;

public abstract class Venta {
    private String Artículo;
    private int Cantidad;
    private double Precio;
    protected double Total;

    public Venta(String artículo, int cantidad, double precio, double total) {
        Artículo = artículo;
        Cantidad = cantidad;
        Precio = precio;
        Total = total;
    }

    @Override
    public String toString() {
        return "Venta [Artículo=" + Artículo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total+ "]";
    }

    public abstract double getTotalVenta();
}
