// Clase 1

public class Metodos {

    // Atributos
    private final String nombre;
    private int edad;

    public Metodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("El edad es: "+edad);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad ){
        this.edad = edad;
    }

}