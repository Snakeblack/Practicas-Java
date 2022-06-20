import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List listaCartas) {
        // Baraja baraja = new Baraja();
        List<Carta> listaOrdenada = new ArrayList<>();
        List<Carta> mazoOrdenado = new ArrayList<>();
        List cartasAux = new ArrayList(mazoOrdenado);

        String[] numerosBaraja = Baraja.numeros;
        String[] palosBaraja = Baraja.palos;

        for (String numero : numerosBaraja) {
            for (String palo : palosBaraja) {
                listaOrdenada.add(new Carta(numero, palo));
            }
        }
        
        for (int i = 0; i < listaOrdenada.size(); i++) {
            for (int j = 0; j < listaCartas.size(); j++) {
                int resultado = comparadorCarta(listaOrdenada.get(i),(Carta) listaCartas.get(j));

                if(resultado == 1){
                    mazoOrdenado.add(listaOrdenada.get(i));
                }
            }
        }

        
        System.out.println(mazoOrdenado.toString());
    }
    

    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo())) {
            return 1;
        } else {
            return 0;
        }
    }
}