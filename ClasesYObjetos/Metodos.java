// Clase 1
/*Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posición
dentro del mismo. Los movimiento posibles son ARRIBA,ABAJO, IZQUIERDA Y DERECHA. Tras cada movimiento el programa mostrará
la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero */

public class Metodos {
    // Atributos
    private int x;
    private int y;

    // Constructor
    public Metodos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moverArriba(int incremento) {
        y += incremento;
    }
    public void moverAbajo(int incremento) {
        y -= incremento;
    }

    public void moverDerecha(int incremento) {
        x += incremento;
    }
    public void moverIzquierda(int incremento) {
        x -= incremento;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
