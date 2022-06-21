import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacion {
    @Override
    public void ordena(List listaCartas) {
        List<Carta> listaOrdenada = new ArrayList<>();
        List<Carta> mazoOrdenado = new ArrayList<>();
        String[] numerosBaraja = Baraja.numeros;
        String[] palosBaraja = Baraja.palos;
        
        Arrays.sort(palosBaraja, String.CASE_INSENSITIVE_ORDER);
        
        for (String palo : palosBaraja) {
            for (String numero : numerosBaraja) {
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

        System.out.println("OrdPalNumInc: " + mazoOrdenado.toString() + "\n");
        
    }
    

    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo())) {
            return 1;
        } else {
            return 0;
        }
    }
}