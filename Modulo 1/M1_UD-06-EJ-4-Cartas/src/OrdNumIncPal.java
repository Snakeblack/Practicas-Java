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

        // Ordeno los palos de la baraja de forma alfabetica
        Arrays.sort(palosBaraja, String.CASE_INSENSITIVE_ORDER);

        // Creo una lista con objetos Carta con los numeros y palos de la baraja
        for (String numero : numerosBaraja)
            for (String palo : palosBaraja)
                listaOrdenada.add(new Carta(numero, palo));

        // Recorro la lista ordenada creada previamente y comparo con la lista de cartas que me pasan como parametro
        // Si la carta de la lista de parametro esta en la lista ordenada, la añado a la lista de ordenada
        // La comparacion se hace con la funcion comparadorCarta();
        for (int i = 0; i < listaOrdenada.size(); i++)
            for (int j = 0; j < listaCartas.size(); j++)
                if (comparadorCarta((Carta) listaOrdenada.get(i), (Carta) listaCartas.get(j)) == 1)
                    mazoOrdenado.add(listaOrdenada.get(i));

        //Elimino los elementos de la lista y la reemplazo por la lista ordenada
        listaCartas.clear();
        listaCartas.addAll(mazoOrdenado);
    }

    // Funcion que compara dos cartas y devuelve un numero 1 si son iguales.
    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo()))
            return 1;
        return 0;
    }
}