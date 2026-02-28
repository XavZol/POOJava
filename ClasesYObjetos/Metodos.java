// Clase 1
/*Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados
los valores de la longitud deberán introducirse por líneas de ordenes. Si es un cuadrado, sólo se proporcionará la longitud
de uno de los lados al constructor */

public class Metodos {
    // Atributos
    private float lado1;
    private float lado2;

    // Métodos

    // Método constructor 1 (cuadrilátero)
    public Metodos(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método Constructor 2 (Cuadrado)
    public Metodos(float lado) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea() {
        float area = (lado1*lado2);
        return area;    
    }
}
