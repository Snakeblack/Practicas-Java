import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private String universidad;
    private String lenguaje;
    private int tamanoEquipo;
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

    public void isCompleto() {
        if (tamanoEquipo == 3)
            System.out.println("El equipo esta completo");
        else if (tamanoEquipo > 3)
            System.out.println("En el equipo sobra gente");
        else
            System.out.println("El equipo aun no esta completo");
    }

    public static int tamanoValidator(int tamanoEquipo) throws Exception {
        if (tamanoEquipo >= 2 && tamanoEquipo <= 3) {
            return 1;
        } else {
            throw new Exception("\n[!]...El tamano del equipo debe de ser de minimo 2 y maximo 3");
        }
    }

    public void programador(String nombre, String apellido) throws Exception {
        if (listaProgramadores.size() <= 3) {
            Programador programador = new Programador(nombre, apellido);
            listaProgramadores.add(programador);
            System.out.println("\nProgramador agregado");
        } else {
            throw new Exception("[!]...El equipo esta lleno");
        }
    }

    @Override
    public String toString() {
        return "Datos del Equipo:\n\t[Universidad: " + universidad + ",\n\tNombre del equipo: " + nombreEquipo
                + ",\n\tLenguaje de Programacion: " + lenguaje + ",\n\tTamanio del equipo: " + tamanoEquipo + " ]\n" +
                "Equipo: " + listaProgramadores.toString()+ "\n";
    }
}