public class Dependientes extends Empleados {
    private String especialidad;

    public Dependientes(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSeguridadSocial, int salario, String turno, String especialidad) {
        super(nombre, apellidos, dni, direccion, telefono, numeroSeguridadSocial, salario, turno);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Dependiente " + nombre + " " + apellidos + " {" + '\n' +
                "   dni: " + dni + '\n' +
                "   direccion: " + direccion + '\n' +
                "   telefono: " + telefono + '\n' +
                "   numero de la seguridad social: " + numeroSeguridadSocial + '\n' +
                "   salario: " + salario + "€\n" +
                "   turno: " + turno + '\n' +
                "   especialidad: " + especialidad + '\n' +
                '}';
    }
}
