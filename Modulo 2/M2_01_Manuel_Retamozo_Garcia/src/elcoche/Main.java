package elcoche;

import elcoche.Coche.Chasis;
import elcoche.Coche.Rueda;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("4780KLC", "Ford", "Focus", 150, 260);

        Chasis chasis = coche.new Chasis("Acero Inoxidable", 1322);
        
        // true = "seco", false = "lluvia"
        Rueda rueda = coche.new Rueda(20, true, "Pirelli", "F1");

        coche.setChasis(chasis);
        coche.setRueda(rueda);

        System.out.println(coche.toString());
    }
}
