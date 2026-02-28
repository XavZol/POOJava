
import java.util.Scanner;

// clase 2
public class Main {

    public static int indiceCocheMBarato(Metodos coches[]) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length; i++) {
            if(coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }   
        }
        return indice;
    } 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        System.out.print("Digite la cantidad de Vehículos: ");
        numeroVehiculos = entrada.nextInt();
        // Vehículos
        Metodos coches[] = new Metodos[numeroVehiculos];

        for(int i=0; i<coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del Coche "+(i+1)+":");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = entrada.nextFloat();

            // el Vehiculo
            coches[i] = new Metodos(marca, modelo, precio);
        }
        indiceBarato = indiceCocheMBarato(coches);
        System.out.print("\nEl coche más barato es: ");
        System.out.print(coches[indiceBarato].mostrarDatos());
    }
}
