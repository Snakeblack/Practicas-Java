import java.util.ArrayList;
import java.util.List;

public class OrdNumIncPal extends AlgoritmoOrdenacion {

    @Override
    public void ordena(List listaCartas) {

    }

    public static int comparadorCarta(Carta c1, Carta c2) {
        System.out.println(c1 + " compare to " + c2);
        return 0;
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