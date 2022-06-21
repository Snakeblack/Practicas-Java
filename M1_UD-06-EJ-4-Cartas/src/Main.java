public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();

        System.out.println("Mazo Orignal: " + mazo.toString() + "\n");

        mazo.setAlgoritmo(new OrdPalNumInc());
        mazo.ordena();
        System.out.println("OrdPalNumeric: " + mazo.toString() + "\n");

        mazo.setAlgoritmo(new OrdPalNumDec());
        mazo.ordena();
        System.out.println("OrdPalNumDec: " + mazo.toString() + "\n");

        mazo.setAlgoritmo(new OrdNumIncPal());
        mazo.ordena();
        System.out.println("OrdNumIncPal: " + mazo.toString());

    }
}