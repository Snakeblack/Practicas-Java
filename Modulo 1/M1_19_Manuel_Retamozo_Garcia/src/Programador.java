public class Programador  {
    private String nombre;
    private String apellido;

    public Programador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void nombre(String nombre) throws Exception {
        //condicion de si el string pasado como parametro contiene un caracter numero
        if (!nombre.matches("^[a-zA-Z ]+$")) {
            throw new Exception("[!]...No se permiten datos numericos");
        } else if (nombre.length() > 20) {
            throw new Exception("[!]...El campo String no puede contener mas de 20 caracteres");
        } else {
            System.out.println("\nEl nombre ingresado es: " + nombre);
        }
    }

    public static void apellidos(String apellidos) throws Exception {
        if (!apellidos.matches("^[a-zA-Z ]+$")) {
            throw new Exception("[!]...No se permiten datos numericos");
        } else if (apellidos.length() > 20) {
            throw new Exception("[!]...El campo String no puede contener mas de 20 caracteres");
        } else {
            System.out.println("\nLos apellidos ingresados son: " + apellidos);
        }
    }

    @Override
    public String toString() {
        return "\n\t[ Nombre: " + nombre + ", Apellido: " + apellido + " ]";
    }

    
}