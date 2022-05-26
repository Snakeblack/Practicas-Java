import java.util.ArrayList;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List listaCartas) {
        Baraja listaBaraja = new Baraja();

        for (int i = 0; i < listaCartas.size() - 1; i++) {
            for (int j = 0; j < listaBaraja.size(); j++) {
                comparadorCarta((Carta) listaCartas.get(i), (Carta) listaBaraja.get(j));
            }
        }
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        System.out.println(c1 + " compare to " + c2);
        return 0;
    }
}