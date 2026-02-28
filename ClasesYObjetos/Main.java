
import javax.swing.JOptionPane;

// clase 2

public class Main {
    public static void main(String[] args){
        Metodos  c1;    // Cuadrilatero 
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del cuadrilátero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del cuadrilátero: "));

        if(lado1 == lado2) {
            c1 = new Metodos(lado1);
        }
        else {
            c1 = new Metodos(lado1, lado2);
        }

        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}
