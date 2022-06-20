public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Mazo mazo = baraja.getMazo();
        System.out.println(baraja.cartas.toString());
        //System.out.println(mazo.toString() + "\n");

//        mazo.setAlgoritmo(new OrdPalNumInc());
//        mazo.ordena();
//        System.out.println(mazo.toString());
//
//        mazo.setAlgoritmo(new OrdPalNumDec());
//        mazo.ordena();
//        System.out.println(mazo.toString());

        mazo.setAlgoritmo(new OrdNumIncPal());
        mazo.ordena();
        //System.out.println(mazo.toString());
    }
}