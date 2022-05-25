public abstract class Empleados extends Mercado {
    protected String numeroSeguridadSocial;
    protected int salario;
    protected String turno;

    protected Empleados(String nombre, String apellidos, String dni, String direccion, String telefono, String numeroSeguridadSocial, int salario, String turno) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.turno = turno.toLowerCase();
        if(this.turno.equals("noche"))
            this.salario = salario + 150;
        else
            this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if(turno.equals("noche"))
            this.salario = salario + 150;
        this.salario = salario;
    }

    public String getTurno() {
        return turno.toLowerCase();
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
