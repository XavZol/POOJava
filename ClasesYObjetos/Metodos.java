// Clase tipo persona 

public class Metodos {
    //Atributos
    String nombre;
    int edad;

    // Métodos en el constructor no se ponen los tipos de valor de retorno
    // Método constructor
    public Metodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}