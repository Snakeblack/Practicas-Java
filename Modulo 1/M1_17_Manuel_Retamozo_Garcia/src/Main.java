public class Main {
    public static void main(String[] args) throws Exception {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();

        System.out.println("Mazo Original: " + mazo + "\n");
        
        // Ordena según el orden natural de las cartas
        mazo.ordena();
        System.out.println("Mazo Ordenado Comparable: " + mazo + "\n");

        // Ordena según un comparator que se pasa como parametro
        mazo.ordena(new OrdNumAscPalList());
        System.out.println("Mazo Ordenado Comparator: " + mazo + "\n");
    }
}
