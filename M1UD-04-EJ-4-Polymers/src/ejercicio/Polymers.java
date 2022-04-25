package ejercicio;

public class Polymers {
    /**
     * Un polímero es una macromolécula formada por la unión de una o más unidades
     * simples llamadas monómeros. En nuestro laboratorio identificamos los monómeros
     * con letras del alfabeto, de la "A" a la "Z" (sin contar la "Ñ". Si la letra está
     * en mayúsculas representa un monómero con polaridad positiva, si está en mayúsculas
     * representa polaridad negativa.
     *
     * Cuando en un polímero coinciden dos unidades con polaridades distintas, ambas unidades
     * reaccionan destruyéndose y dejando al polímero sin las mismas. Por ejemplo, en el
     * polímero "CaAdbb", el par "aA" reacciona autoeliminándose y dejándo el polímero como
     * "Cdbb". "C" y "d" son de polaridades distintas pero al ser distintos monómeros no
     * reaccionan entre sí. Las unidades "bb" son del mismo tipo pero al tener la misma
     * polaridad no reacionan entre sí.
     *
     * La eliminación de unidades o monómeros puede producir eliminaciones en cascada. Por
     * ejemplo, el polímero "rFvdAaDVb" al reaccionar elimina sucesivamente el par "Aa", el
     * par "dD" y el par "vV" para dejar un resultado final de "rFb" Una reacción en cadena
     * puede eliminar por completo el polímero.
     *
     * Escribe una función que dado un polímero representado con las letras del alfabeto
     * (mayúsculas y minúsculas excluyendo la Ñ), procesa las reacciones en cadena de dicho
     * polímero y devuelve el polímero reducido.
     */
    public static String processPolymer(String polymer) {
        String resultado = "";
        char [] arrPolymer = polymer.toCharArray();
        int j = 0;
        int i = 1;
        while ( j < arrPolymer.length - 1) {
            if (arrPolymer[j] != (arrPolymer[i] + 32) && arrPolymer[j] != (arrPolymer[i] - 32)) {
                resultado += arrPolymer[j];
                j++;
                i++;
            } else {
                i += 2;
                j += 2;
            }
        }
        if (arrPolymer.length != 0)
            resultado += arrPolymer[arrPolymer.length - 1];

        return resultado;
    }
    
    

    public static boolean parOrImpar(int num){
        return num % 2 == 0;
    }
}
