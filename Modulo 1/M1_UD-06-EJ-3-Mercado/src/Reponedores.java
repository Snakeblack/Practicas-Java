public class Reponedores extends Empleados{
    private String empresa;

    public Reponedores(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSeguridadSocial, int salario, String turno, String empresa) {
        super(nombre, apellidos, dni, direccion, telefono, numeroSeguridadSocial, salario, turno);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Reponedor " + nombre + " " + apellidos + " {" + '\n' +
                "   dni: " + dni + '\n' +
                "   direccion: " + direccion + '\n' +
                "   telefono: " + telefono + '\n' +
                "   numero de la seguridad social: " + numeroSeguridadSocial + '\n' +
                "   salario: " + salario + "€\n" +
                "   turno: " + turno + '\n' +
                "   empresa: " + empresa + '\n' +
                '}';
    }
}
