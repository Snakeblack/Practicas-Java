import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String nombreFicheroOrigen = "M2_T02_Origen.txt";
        String nombreFicheroDestino = "M2_T02_Destino.txt";
        /*
         * try: Instanciamos el objeto BufferedReader para leer el fichero de entrada y
         * el objeto BufferedWriter para escribir el fichero de salida
         * try-logica: Hacemos un bucle pasando el entero leido por el metodo read() y
         * escribiendo el mismo entero por el metodo write() con la condicion de no ser
         * un espacio, si es un espacio pasa a ser un "-" guion.
         * catch: Capturamos los errores de lectura/escritura
         */
        try (
                BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File(nombreFicheroOrigen)));
                BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File(nombreFicheroDestino)));
        ) {
            int c;

            while ((c = ficheroEntrada.read()) != -1)
                ficheroSalida.write(c == ' ' ? '-' : (char) c);

        } catch (IOException errorDeFichero) {
            System.out.println("Error de fichero: " + errorDeFichero.getMessage());
        }
    }
}
