// Clase 1

public class Metodos {

    private String frase = "Primera frase";
    // Atributos
    public static void main(String[] args) {
        Metodos ob1 = new Metodos();
        Metodos ob2 = new Metodos();

        ob2.frase = "Segunda frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
    }

}