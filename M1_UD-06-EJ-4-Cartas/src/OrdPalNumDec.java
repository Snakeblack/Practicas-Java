import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdPalNumDec extends AlgoritmoOrdenacion {
    @Override
    public void ordena(List listaCartas) {
        List<Carta> listaOrdenada = new ArrayList<>();
        List<Carta> mazoOrdenado = new ArrayList<>();
        String[] numerosBaraja = Baraja.numeros;
        String[] palosBaraja = Baraja.palos;
        String[] numerosInvertidos = new String[numerosBaraja.length];
        
        Arrays.sort(palosBaraja, String.CASE_INSENSITIVE_ORDER);
        
        int cont = 0;
        for (int i = numerosBaraja.length - 1; i >= 0; i--) {
            numerosInvertidos[cont] = numerosBaraja[i];
            cont++;
        }
        
        for (String palo : palosBaraja) {
            for (String numero : numerosInvertidos) {
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

        System.out.println("OrdPalNumDec: " + mazoOrdenado.toString() + "\n");
        
    }
    

    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo())) {
            return 1;
        } else {
            return 0;
        }
    }
}