public abstract class Personal {
    // ¿atributos?
    protected String nombre;
    protected String dni;
    // ¿constructor?
    public Personal(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // ¿métodos?
    public abstract double calcularSueldo();
    public abstract String getTipo();
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}