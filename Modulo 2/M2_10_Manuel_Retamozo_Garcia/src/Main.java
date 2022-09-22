public class Main {
    public static void main(String[] args) {

        // StringBuilder
        System.out.println("StringBuilder:\n");

        StringBuilder cadena = new StringBuilder("Hay coches");
        System.out.println(cadena);

        int tamCadena = cadena.length();
        System.out.println("La cadena tiene " + tamCadena + " caracteres");

        cadena.append(" en el desguace");
        System.out.println(cadena);

        int numCoches = 1000;
        cadena.insert(4, "mas de " + numCoches + " ");
        System.out.println(cadena);

        String ultimosCaracteres = cadena.substring(cadena.length() - 4);
        System.out.println(ultimosCaracteres);

        System.out.println("La capacidad del StringBuilder es " + cadena.capacity());
        System.out.println("La longitud del StringBuilder es " + cadena.length());

        // StringBuffer
        System.out.println("\nStringBuffer:\n");

        StringBuffer cadena2 = new StringBuffer("Hay coches");
        System.out.println(cadena2);

        int tamCadena2 = cadena2.length();
        System.out.println("La cadena tiene " + tamCadena2 + " caracteres");

        cadena2.append(" en el desguace");
        System.out.println(cadena2);

        int numCoches2 = 1000;
        cadena2.insert(4, "mas de " + numCoches2 + " ");
        System.out.println(cadena2);

        String ultimosCaracteres2 = cadena2.substring(cadena2.length() - 4);
        System.out.println(ultimosCaracteres2);

        System.out.println("La capacidad del StringBuffer es " + cadena2.capacity());

        System.out.println("La longitud del StringBuffer es " + cadena2.length());

    }
}
