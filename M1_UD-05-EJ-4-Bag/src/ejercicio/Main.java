package ejercicio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio de la clase Bag");
        Bag bag = new Bag();
        bag.add("Portatil");
        bag.add("Tablet");
        bag.add("Movil");
        bag.add("Reloj");

        System.out.println("¿La bolsa esta vacia?: " + bag.isEmpty());
        System.out.println("¿Cuantos elementos tiene la bolsa?: " + bag.size());
        System.out.println("¿Hay un Movil en la bolsa?: " + bag.contains("Movil"));
        System.out.println("¿Hay un Cuaderno en la bolsa?: " + bag.contains("Cuaderno"));
        System.out.println("Elemento random: " + bag.extract());
        System.out.println("\nEliminamos todos los elementos de la bolsa");
        bag.clear();
        System.out.println("¿La bolsa esta vacia?: " + bag.isEmpty());
    }
}
