package p102_AutorLibro;

public class Autor {
    private String Nombre;
    private String Correo;
    private int Edad;

    //Constructores
    public Autor() {
    }
    public Autor(String nombre, int edad, String correo) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
    }

    // Get - Set
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    
    //Método toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor{");
        sb.append("Nombre=").append(Nombre);
        sb.append(", Correo=").append(Correo);
        sb.append(", Edad=").append(Edad);
        sb.append('}');
        return sb.toString();
    }

}
