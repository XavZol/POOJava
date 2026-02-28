// Clase 1

public class Metodos {

    private static String frase = "Primera frase";

    public static int sumar(int n1,int n2 ){
        int suma = n1+n2;
        return suma;
    }
    // Atributos
    public static void main(String[] args) {
        System.out.println(Metodos.frase);
        System.out.println("La suma es: "+Metodos.sumar(3, 4));
    }

}