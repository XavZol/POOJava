// Clase 1
/*Construir un programa para una competencia de atletismo, el programa debe gestiionar una serie de atletas
caracterizados por su número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador
de la carrera */

public class Metodos {
    // Atributos
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;

    // Constructor Atleta
    public Metodos(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatosGanador() {
        return "Numero de Atleta: "+numeroAtleta+"\nNombre de Atleta: "+nombre+"\nTiempo de Carrera: "+tiempoCarrera+"\n";
    }
    
}
