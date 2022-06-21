public class Programador {
    private String nombre;
    private String apellidos;

    public Programador(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static void validarAtributos(String nombre, String apellidos) {
        if (!nombre.matches("[a-zA-Z ]+") || !apellidos.matches("[a-zA-Z ]+")) {
            throw new IllegalArgumentException("Los atributos nombre y apellidos deben ser solo texto");
        }
        if (nombre.length() > 20 || apellidos.length() > 20) {
            throw new IllegalArgumentException(
                    "Los campos String no deben tener una longitud igual o superior a 20 caracteres");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "\n\t\t[\n\t\t\tapellidos: " + apellidos + ",\n\t\t\tnombre:" + nombre + "\n\t\t]\n\t";
    }

    
}