import java.io.IOException;

public class Editor {
    private Fichero fichero;

    /**
     * Constructor de la clase Editor
     * 
     * @param fichero Fichero que se va a editar
     */
    public Editor(Fichero fichero) {
        this.fichero = fichero;
    }

    /**
     * Abre un fichero de texto existente
     * nota: el atributo fichero debe de tener un objeto creado.
     * 
     * @param nombreFichero String que contiene la ruta completa del fichero
     * @return String que contiene el contenido del fichero
     * @throws IOException cuando hay problemas abriendo o leyendo el fichero
     */
    public String abrirFichero(String nombreFichero) throws IOException {
        String contenido = "";
        fichero = new Fichero(nombreFichero);
        try {
            contenido = fichero.darContenido();
        } catch (IOException e) {
            throw new IOException("Error al abrir el fichero");
        }
        return contenido;
    }

    /**
     * Crea un nuevo fichero de texto en el editor
     */
    public void crearFichero() {
        fichero = null;
    }

    /**
     * Guardar el contenido de un fichero, sea nuevo o existente
     * 
     * @param contenido   String que tiene el contenido que se va a guardar en el
     *                    fichero
     * @param rutaFichero String que contiene la ruta del fichero en caso de que sea
     *                    nuevo
     * @throws IOException cuando hay problemas tratando de escribir en el fichero
     */
    public void guardarFichero(String contenido, String rutaFichero) throws IOException {
        if (fichero == null)
            fichero = new Fichero(rutaFichero);

        try {
            fichero.guardar(contenido);
        } catch (IOException e) {
            throw new IOException("Error al guardar el fichero");
        }
    }

    /**
     * Añade el contenido a un fichero existente
     * 
     * @param contenido   String que tiene el contenido que se va a guardar en el
     *                    fichero
     * @param rutaFichero String que contiene la ruta del fichero
     * @throws IOException cuando hay problemas tratando de añadir al fichero
     */
    public void anadirFichero(String contenido, String rutaFichero) throws IOException {
        if (fichero == null)
            fichero = new Fichero(rutaFichero);

        try {
            fichero.anadir(contenido);
        } catch (IOException e) {
            throw new IOException("Error al guardar el fichero");
        }
    }

    /**
     * Modifica el fichero actual usando el metodo replace().
     * 
     * @param rutaFichero String que contiene la ruta del fichero
     * @param texto       String del texto que se quiere cambiar en el fichero
     * @param textoNuevo  String texto nuevo que remplaza al anterior en el fichero
     * @throws IOException cuando hay problemas al modificar el fichero
     */
    public void modificarFichero(String rutaFichero, String texto, String textoNuevo) throws IOException {
        try {
            String contenidoFichero = abrirFichero(rutaFichero);
            contenidoFichero = contenidoFichero.replace(texto, textoNuevo);
            guardarFichero(contenidoFichero, rutaFichero);
        } catch (IOException e) {
            throw new IOException("Error al modificar el fichero");
        }
    }
}
