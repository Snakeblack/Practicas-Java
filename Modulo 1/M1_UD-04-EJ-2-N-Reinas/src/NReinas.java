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

    public static void resolverReinas(int n)
    {
        int[][] soluciones = new int[n][n];
        int[] solucion = new int[n];

        resolverReinas(soluciones, solucion, 0);
    }

    private static void resolverReinas(int[][] soluciones, int[] solucion, int columna)
    {
        if (columna == soluciones.length)
        {
            System.out.println(Arrays.toString(solucion));
            System.out.println();
        } else
        {
            for (int i = 0; i < soluciones.length; i++)
            {
                solucion[columna] = i;
                if (esValida(solucion, columna))
                {
                    soluciones[columna][i] = 1;
                    resolverReinas(soluciones, solucion, columna + 1);
                    soluciones[columna][i] = 0;
                }
            }
        }
    }

    private static boolean esValida(int[] solucion, int columna)
    {
        for (int i = 0; i < columna; i++)
        {
            if (solucion[i] == solucion[columna])
            {
                return false;
            }
            if (columna - i == Math.abs(solucion[columna] - solucion[i]))
            {
                return false;
            }
        }
        return true;
    }
}