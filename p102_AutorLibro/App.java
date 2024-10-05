package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();

        libro1.setIsbn("1234567-27-32");
        libro1.setNombre("Java para principiantes");
        libro1.setPrecio(300);
        autor.setNombre("Carlos Castañeda");
        autor.setEdad(45);
        autor.setCorreo("castr@uaz.edu.mx");
        libro1.setAutor(autor);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Datos del libro 1:");
        System.out.println("ISBN: " + libro1.getIsbn());
        System.out.println("Nombre: " + libro1.getNombre());
        System.out.println("Precio: " + libro1.getPrecio());
        System.out.println("Autor: " + libro1.getAutor().getNombre());
        System.out.println("Edad del autor: " + libro1.getAutor().getEdad());
        System.out.println("Correo del autor: " + libro1.getAutor().getCorreo());
        System.out.println("\n " + libro1);

        Libro libro2 = new Libro("4567-89-10-11","Consejos infalibles para conquistar morritas", new Autor("Brusli Lopez", 25, "kimberlyloaiza@gmail.com"), 450);
        System.out.println("Datos del libro 2:");
        System.out.println("ISBN: " + libro2.getIsbn());
        System.out.println("Nombre: " + libro2.getNombre());
        System.out.println("Precio: " + libro2.getPrecio());
        System.out.println("Autor: " + libro2.getAutor().getNombre());
        System.out.println("Edad del autor: " + libro2.getAutor().getEdad());
        System.out.println("Correo del autor: " + libro2.getAutor().getCorreo());
        System.out.println(libro2.toString());
    }
}
