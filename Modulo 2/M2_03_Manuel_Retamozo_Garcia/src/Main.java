import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /* Para este ejercicio se pide en primer lugar, crear un programa que escriba tres veces el valor “1” en un archivo, y después seis veces el valor “2”. Luego se mostrará el contenido del archivo por pantalla.

        La segunda parte de este ejercicio consiste en hacer, que todos los valores “2” del archivo se sustituyan por “3”, mostrándose de nuevo por pantalla el contenido del archivo. Finalmente cerramos el archivo y el programa termina
        */
        String nombreFichero = "fichero.txt";
        Fichero fichero = new Fichero(nombreFichero);
        Editor editor = new Editor(fichero);

        /*
         * Crea los contenidos pedidos en el enunciado.
         */
        String primerContenido = "";
        String segundoContenido = "";

        for (int i = 0; i < 3; i++) {
            primerContenido += "1";
        }

        for (int i = 0; i < 6; i++) {
            segundoContenido += "2";
        }
        
        /*
         * Estructura del programa segun el ejercicio. 
         */

         // Parte 1
        editor.crearFichero();
        editor.anadirFichero(primerContenido, nombreFichero);
        editor.anadirFichero(segundoContenido, nombreFichero);
        System.out.println(editor.abrirFichero(nombreFichero));

        // Parte 2
        editor.modificarFichero(nombreFichero, "2", "3");
        System.out.println(editor.abrirFichero(nombreFichero));
    }
}
