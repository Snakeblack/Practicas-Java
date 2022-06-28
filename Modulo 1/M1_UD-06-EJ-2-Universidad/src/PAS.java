public abstract class PAS extends Personal {
    // ¿atributos?
    protected int horasExtra;
    protected double eurosHoraExtra;

    // ¿constructor?
    protected PAS(String nombre, String dni, int horasExtra) {
        super(nombre, dni);
        this.horasExtra = horasExtra;
        this.eurosHoraExtra = 0.5;
    }

    // ¿métodos?
    public abstract double calcularSueldo();

    public abstract String getCategoria();
    
    public int getHorasExtra() {
        return horasExtra;
    }

    public double getEurosHoraExtra() {
        return eurosHoraExtra;
    }
}