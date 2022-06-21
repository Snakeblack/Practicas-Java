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

    public void nombre(String nombre) throws Exception {
        if (nombre.matches("[0-9]*")) {
            throw new Exception("No se permiten datos numericos");
        } else if (nombre.length() > 20) {
            throw new Exception("El campo String no puede contener mas de 20 caracteres");
        } else {
            System.out.println("\nEl nombre ingresado es: " + nombre);
        }
    }

    public void apellido(String apellido) throws Exception {
        if (apellido.matches("[0-9]*")) {
            throw new Exception("No se permiten datos numericos");
        } else if (apellido.length() > 20) {
            throw new Exception("El campo String no puede contener mas de 20 caracteres");
        } else {
            System.out.println("El apellido ingresado es: " + apellido);
        }
    }

    @Override
    public String toString() {
        return "\n\t[ Nombre: " + nombre + ", Apellido: " + apellido + " ]";
    }

    
}