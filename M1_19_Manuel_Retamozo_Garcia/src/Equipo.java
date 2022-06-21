import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String universidad;
    private String lenguaje;
    private int tamanoEquipo;
    private int contador = 0;
    List listaProgramadores = new ArrayList();

    public Equipo(String nombreEquipo, String universidad, String lenguaje, int tamanoEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguaje = lenguaje;
        this.tamanoEquipo = tamanoEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int gettamanoEquipo() {
        return tamanoEquipo;
    }

    public void settamanoEquipo(int tamanoEquipo) {
        this.tamanoEquipo = tamanoEquipo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public boolean isCompleto() {
        if (contador == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void programador(String nombre, String apellido) throws Exception {
        if (contador < tamanoEquipo) {
            Programador programador = new Programador(nombre, apellido);
            contador++;
            System.out.println("\nProgramador agregado");
            programador.nombre(nombre);
            programador.apellido(apellido);
            listaProgramadores.add(programador);
        } else {
            throw new Exception("El equipo esta lleno");
        }
    }

    @Override
    public String toString() {
        return "Datos del Equipo:\n\t[Universidad: " + universidad + ",\n\tNombre del equipo: " + nombreEquipo
                + ",\n\tLenguaje de Programacíon: " + tamanoEquipo + ",\n\tTamanio del equipo: " + lenguaje + " ]" +
                "\nEquipo: " + listaProgramadores.toString();
    }
}