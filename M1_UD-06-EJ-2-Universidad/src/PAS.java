public abstract class PAS extends Personal {
    // ¿atributos?
    protected int horasExtra;
    protected double eurosHoraExtra;

    // ¿constructor?
    public PAS(String nombre, String dni, int horasExtra) {
        super(nombre, dni);
        this.horasExtra = horasExtra;
        this.eurosHoraExtra = 6;
    }

    // ¿métodos?
    public abstract double calcularSueldo();
}