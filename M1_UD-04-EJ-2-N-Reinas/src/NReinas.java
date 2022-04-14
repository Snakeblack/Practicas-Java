import java.lang.Math;

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

    static void dibujar (int[] tablero) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i] == j) {
                    System.out.print("|R");
                }
                else {
                    System.out.print("|_");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean ataque(int[] tablero) {
        boolean res = false;

        //detectamos reinas en la misma columna
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (tablero[i] == tablero[j]) return true;
            }
        }
        //detectamos reinas en las diagonales
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (tablero[i]+i == tablero[j]+j) return true;
                if (tablero[i]-i == tablero[j]-j) return true;
            }
        }

        return res;
    }

    static void buscarSoluciones() {
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        for (int m = 0; m < 8; m++) {
                            for (int n = 0; n < 8; n++) {
                                for (int o = 0; o < 8; o++) {
                                    for (int p = 0; p < 8; p++) {
                                        int [] tablero = {i,j,k,l,m,n,o,p};
                                        if (!ataque(tablero)) {
                                            dibujar(tablero);
                                            cont++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("hay " + cont + " soluciones");
    }
}
