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
    public static String processPolymer(String polymer)
    {
        int len = polymer.length();
        boolean flag = false;

        while (!flag)
        {
            flag = true;
            for (int i = 0; i < len - 1; i++ )
            {
                char j = polymer.charAt(i);
                char k = polymer.charAt(i+1);

                if ((j > 65 && j < 122 || k > 65 && k < 122) &&
                    (j == k + 32 || j == k - 32) ||
                    ( k == j + 32 || k == j - 32))
                {
                    String fchar = Character.toString(j);
                    String schar = Character.toString(k);

                    polymer = polymer.replace(fchar + schar, "");
                    len = polymer.length();
                    flag = false;
                }
            }
            polymer = polymer.trim();
        }
        return polymer;
    }
}
