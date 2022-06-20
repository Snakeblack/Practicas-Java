import java.util.ArrayList;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List listaCartas) {
        Baraja baraja = new Baraja();
        List<Carta> listaOrdenada = new ArrayList<>();

        
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < listaCartas.size(); j++) {
                int resultado = comparadorCarta(baraja.getCarta(i),(Carta) listaCartas.get(j));

                if(resultado == 1){
                    listaOrdenada.add(baraja.getCarta(i));
                } 
            }
        }
        System.out.println(listaOrdenada.toString());
    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        if (c1.getNumero().equals(c2.getNumero()) && c1.getPalo().equals(c2.getPalo())) {
            return 1;
        } else {
            return 0;
        }
    }
}

// public static void ordenar(String[] numeros){
//     String aux;
//     for(int i=0; i<numeros.length-1; i++){
//         for(int j=0; j<numeros.length-1; j++){
//             if(numeros[j].compareTo(numeros[j+1])>0){
//                 aux=numeros[j];
//                 numeros[j]=numeros[j+1];
//                 numeros[j+1]=aux;
//             }
//         }
//     }
// }