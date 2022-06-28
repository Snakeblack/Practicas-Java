package ejercicio;

public class Main {
    public static void main(String[] args) {
        int num = contarVocales("¿Nació una abeja bajo el Sol?");

        System.out.println(num);
    }

    public static int contarVocales(String cadena) {
        char[] vocales  = new char[]{'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
        char[] arrCadena = cadena.toCharArray();
        int contador = 0;

        for (char letra : arrCadena) {
            for (char vocal : vocales) {
                if (letra == vocal)
                    contador++;
            }
        }
        return contador;
    }
}
