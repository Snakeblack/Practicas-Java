import java.util.ArrayList;

public class EquipoDeProgramadores {
    private String nombreEquipo;
    private String universidad;
    private String lenguaje;
    private int tamano;
    private ArrayList<Programador> programadores = new ArrayList<Programador>();

    public EquipoDeProgramadores(String universidad, String nombreEquipo, String lenguaje) {
        this.universidad = universidad;
        this.nombreEquipo = nombreEquipo;
        this.lenguaje = lenguaje;
        this.tamano = 0;
    }

    public String equipoCompleto() {
        if (tamano == 3)
            return "El equipo esta completo";
        else if (tamano == 2)
            return "Falta un programador para completar el equipo";
        else
            return "El equipo no esta completo";
    }

    public void anadirProgramadores(Programador programador) {
        if (tamano < 3) {
            programadores.add(programador);
            tamano++;
        } else {
            System.out.println("El equipo esta completo");
        }
    }

    public String getNombre() {
        return nombreEquipo;
    }

    public void setNombre(String nombre) {
        this.nombreEquipo = nombre;
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

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "EquipoDeProgramadores [\n\tuniversidad: " + universidad + ",\n\tnombreEquipo: " + nombreEquipo
                + ",\n\tlenguaje: "
                + lenguaje + ",\n\tprogramadores: " + programadores + ",\n\ttamanio del equipo: " + tamano + "\n]";
    }

}
