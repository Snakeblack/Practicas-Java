import java.util.Arrays;

/*
Crea un método resolverReinas(int) en la clase NReinas que imprima por pantalla todas las posibles soluciones del problema de las N-Reinas.

El problema de las N-Reinas es un pasatiempo que consiste en poner N reinas en el tablero de ajedrez sin que se amenacen,
teniendo en cuenta que el tablero será de dimensión N x N.

Imprime por pantalla todas las soluciones posibles hasta N = 8.

La solución al problema se imprimirá como la posición de cada reina en cada columna del tablero (empezando a contar en cero).

Para n = 1, 2 o 3 el problema no tiene solución, puesto que no es posible colocar n reinas sin que se amenacen, así que no imprimirá nada.

Para n=4 el problema tiene dos posibles soluciones, por lo que imprimirá:

[1, 3, 0, 2]

[2, 0, 3, 1]
*/
/*
Para n=5 las soluciones son 10

[0, 2, 4, 1, 3]

[0, 3, 1, 4, 2]

[1, 3, 0, 2, 4]

[1, 4, 2, 0, 3]

[2, 0, 3, 1, 4]

[2, 4, 1, 3, 0]

[3, 0, 2, 4, 1]

[3, 1, 4, 2, 0]

[4, 1, 3, 0, 2]

[4, 2, 0, 3, 1]

 */

public class NReinas {


    static boolean ataque(int[] tablero, int numTablero) {
        boolean res = false;

        //detectamos reinas en la misma columna
        for (int i = 0; i < numTablero - 1; i++) {
            for (int j = i + 1; j < numTablero; j++) {
                if (tablero[i] == tablero[j]) return true;
            }
        }
        //detectamos reinas en las diagonales
        for (int i = 0; i < numTablero - 1; i++) {
            for (int j = i + 1; j < numTablero; j++) {
                if (tablero[i]+i == tablero[j]+j) return true;
                if (tablero[i]-i == tablero[j]-j) return true;
            }
        }

        return res;
    }

    static void resolverReinas(int numTablero) {
        // int cont = 0;
        int j = 0;
        // for (int i = 0; i < numTablero; i++) {
        //     for (int j = 0; j < numTablero; j++) {
        //         for (int k = 0; k < numTablero; k++) {
        //             for (int l = 0; l < numTablero; l++) {
        //                 for (int m = 0; m < numTablero; m++) {
        //                     for (int n = 0; n < numTablero; n++) {
        //                         for (int o = 0; o < numTablero; o++) {
        //                             for (int p = 0; p < numTablero; p++) {
        //                                 int [] tablero = {i,j,k,l,m,n,o,p};
        //                                 if (!ataque(tablero, numTablero)) {
        //                                     System.out.println(Arrays.toString(tablero) + "\n");
        //                                     cont++;
        //                                 }
        //                             }
        //                         }
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        int [] tablero = new int [numTablero];
        if(j < numTablero){
            for (int i = 0; i < numTablero; i++) {
                tablero[numTablero - 1] = i;
                resolverReinas(numTablero - 1);
                if(!ataque(tablero, numTablero)) {
                    System.out.println(Arrays.toString(tablero) + "\n");
                    
                    // cont++;
                }
            }
            
        }
        // System.out.println("Hay " + cont + " soluciones");
    }
}