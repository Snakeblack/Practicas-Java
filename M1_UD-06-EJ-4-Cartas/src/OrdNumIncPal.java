import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List listaCartas) {
        List listaOrdenada = new ArrayList();
        List mazoOrdenado = new ArrayList();
        String[] numerosBaraja = Baraja.numeros;
        String[] palosBaraja = Baraja.palos;

        Arrays.sort(palosBaraja, String.CASE_INSENSITIVE_ORDER);

        for (String numero : numerosBaraja)
            for (String palo : palosBaraja)
                listaOrdenada.add(new Carta(numero, palo));

        for (int i = 0; i < listaOrdenada.size(); i++)
            for (int j = 0; j < listaCartas.size(); j++)
                if (comparadorCarta((Carta) listaOrdenada.get(i), (Carta) listaCartas.get(j)) == 1)
                    mazoOrdenado.add(listaOrdenada.get(i));

        listaCartas.clear();
        listaCartas.addAll(mazoOrdenado);
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo()))
            return 1;
        else
            return 0;
    }
}