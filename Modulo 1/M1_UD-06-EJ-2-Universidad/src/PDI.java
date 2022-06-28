public abstract class PDI extends Personal {
    // ¿atributos?

    // ¿constructor?
    protected PDI(String nombre, String dni) {
        super(nombre, dni);
    }
    // ¿métodos?
    public abstract double calcularSueldo();

    public abstract String getCategoria();
}