// clase 2

public class Main {
    public static void main(String[] args){
        Metodos objeto1 = new Metodos();
        Metodos objeto2 = new Metodos();

        objeto1.setEdad(10);
        System.out.println("La edad es: "+objeto1.getEdad());

        objeto2.setNombre("Naomi");
        System.out.println("El nombre es: "+objeto2.getNombre());
    }
}
