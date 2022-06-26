import java.util.Comparator;

/**
 * Compara dos cartas segun lo pasado como parametro al metodo ordena()
 */
public class OrdNumAscPalList implements Comparator<Carta> {
    @Override
    public int compare(Carta carta1, Carta carta2) {
        if (carta1.getNumero().equals(carta2.getNumero()) && carta1.getPalo().equals(carta2.getPalo()))
            return 1;
        return 0;
    }
}