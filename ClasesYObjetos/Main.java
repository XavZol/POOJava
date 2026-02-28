
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Metodos op = new Metodos();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:"));
        
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        op.mostrarResultados();   
    }
}
