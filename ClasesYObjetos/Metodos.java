import javax.swing.JOptionPane;

public class Metodos {
    //Atributos

    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Métodos

    // Método para pedirle usuario que nos digite 2 números
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
    }

    // Método para sumar ambos números
    public void sumar() {
        suma = numero1+numero2;
    }
    // Método para restar ambos números
    public void restar() {
        resta = numero1-numero2;
    }
    // Método para multiplicar ambos números
    public void multiplicar() {
        multiplicacion = numero1*numero2;
    }
    // Método para dividir ambos números
    public void dividir() {
        division = numero1/numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}