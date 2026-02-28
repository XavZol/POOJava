// Clase tipo persona 

public class Metodos {

    // Atributos
    String nombre;
    int edad;
    String dni;

    // Métodos
    public Metodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Metodos(String dni) {
        this.dni = dni;
    }

    public void correr(){ 
        System.out.print("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maratón");
    }

    public void correr(int km) {
        System.out.println(" y He corrido "+km+" kilometros");
    }


}