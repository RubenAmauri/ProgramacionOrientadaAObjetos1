package p105_PuntoTriangulo;

public class Punto {
    private int x;
    private int y;

    // Constructor por defecto
    public Punto() {
    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get - Set
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Método para calcular la distancia entre dos puntos
    public double getDistancia(Punto punto) {
        return Math.sqrt(Math.pow(punto.getX() - this.x, 2) + Math.pow(punto.getY() - this.y, 2));
    }

    // toString
    @Override
    public String toString() {
        return "Punto [X=" + x + ", Y=" + y + "]";
    }
}

