public abstract class Personal {
    // ¿atributos?
    protected String nombre;
    protected String dni;
    // ¿constructor?
    protected Personal(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // ¿métodos?
    public abstract double calcularSueldo();

}