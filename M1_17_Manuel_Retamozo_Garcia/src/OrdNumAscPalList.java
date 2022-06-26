import java.util.Comparator;

public class OrdNumAscPalList implements Comparator<Carta> {

    // primero por números strings (de forma ascendente) y luego por palos (por orden de lista)
    @Override
    public int compare(Carta carta1, Carta carta2) {
        int resultado = carta1.getNumero().compareTo(carta2.getNumero());
        if (resultado == 0) {
            resultado = carta1.getPalo().compareTo(carta2.getPalo());
        }
        return resultado;
    }

}