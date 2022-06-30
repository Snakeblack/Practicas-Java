import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Fichero {

    /**
     * Objeto de la clase File que representa el fichero
     */
    private File fichero;

    /**
     * Construye un objeto de la clase Fichero
     * 
     * @param nombreFichero la ruta completa del fichero que se va a crear
     */
    public Fichero(String nombreFichero) {
        fichero = new File(nombreFichero);
    }

    /**
     * Retorna el contenido del fichero
     * 
     * @return String que tiene el contenido
     * @throws IOException cuando hay problemas abriendo o leyendo el fichero
     */
    public String darContenido() throws IOException {
        String contenido = "";
        FileReader fr = new FileReader(fichero);
        BufferedReader lector = new BufferedReader(fr);
        String linea = lector.readLine();

        while (linea != null) {
            contenido += linea + "\n";
            linea = lector.readLine();
        }
        lector.close();
        fr.close();

        return contenido;
    }

    /**
     * Guarda el contenido en el fichero nuevo o existente
     * 
     * @param contenido String que tiene el contenido que se va a guardar en el
     *                  fichero
     * @throws IOException cuando hay problemas tratando de escribir en el fichero
     */
    public void guardar(String contenido) throws IOException {
        FileWriter escritor = new FileWriter(fichero);
        escritor.write(contenido);
        escritor.close();
    }

    /**
     * Añade el contenido en el fichero existente
     * 
     * @param contenido String que tiene el contenido que se va a guardar en el fichero
     * @throws IOException cuando hay problemas tratando de escribir en el fichero
     */
    public void anadir(String contenido) throws IOException {
        FileWriter escritor = new FileWriter(fichero, true);
        escritor.write(contenido);
        escritor.close();
    }
}
