package ejercicio;

import java.util.Locale;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        if (esPalindromo("Dábale arroz a la zorra el abad"))
            System.out.println("Es un Palindromo");
        else
            System.out.println("No es un Palindromo");

    }
    /**
     * Implementa la función boolean esPalindromo(String) que dado un String
     * devuelve un valor booleano indicando si dicho String es palíndromo o no.
     *
     * Un palíndromo es una palabra o frase que se lee igual tanto
     * si empiezas por el principio como por el final.
     *
     * En nuestro caso el método no es sensible a las diferencias entre mayúsculas
     * y minúsculas y solo tendrá en cuenta los caracteres ASCII situados entre
     * la 'A' y la 'Z' (o la 'a' y la 'z'). El resto de caracteres como espacios,
     * símbolos de interrogación, etc. serán ignorados.
     *
     * @param texto Cadena de texto a analizar
     * @return True si es palíndromo, False en caso contrario
     */
    public static boolean esPalindromo(String texto) {
        String textoSaneado = sanearTexto(texto);
        StringBuilder builder= new StringBuilder(textoSaneado);
        String textoInvertido = builder.reverse().toString();

        return Objects.equals(textoInvertido, textoSaneado);
    }

    public static String sanearTexto(String texto)
    {
        final String ORIGIN  = "ÁáÉéÍíÓóÚúÜü";
        final String REPLACE = "AaEeIiOoUuUu";

        if (texto == null)
            return null;

        char[] array = texto.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int pos = ORIGIN.indexOf(array[i]);

            if (pos > -1)
                array[i] = REPLACE.charAt(pos);
        }
        return new String(array).replace(" ", "").toLowerCase(Locale.ROOT);
    }

}
