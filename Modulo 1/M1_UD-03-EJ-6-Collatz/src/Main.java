import java.util.*;

public class Main {

    public static void main(String[] args){
        System.out.println(Arrays.toString(collatz(6)));
    }
    /**
     * Devuelve la lista de Collatz para el valor n
     *
     * @param n valor entero positivo (>0)
     * @return Array de enteros representando la lista de Collatz, los valores restantes del array se inicializan a cero
     *
     * Dado un número devuelve un array con la serie de números de Collatz (incluyendo en la primera posición el número
     * inicial. Para no tener que trabajar con un array de tamaño variable supondremos que el array tiene un tamaño fijo 
     * suficiente (p.ej. 300 elementos) para albergar la serie y que los elementos no utilizados se fijan a cero.
     *
     * Por ejemplo, para el número 6 devolvería el siguiente array:
     * [6, 3, 10, 5, 16, 8, 4, 2, 1, 0, 0, 0, 0, ..., 0]
     */
    public static int[] collatz(int n) {
        // Código...
        final int TAM_MAX = 300;
        int[] lista = new int[TAM_MAX];

        if (n > 0){
            lista[0] = n;
            for (int i = 1; i < TAM_MAX; i++){
                if(n == 1){
                    lista[i] = 0;
                } else if (n % 2 == 0){
                    n = (n / 2);
                    lista[i] = n;
                } else {
                    n = (n * 3) + 1;
                    lista[i] = n;
                }
            }
        }
        return lista;
    }
} 