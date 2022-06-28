public class Investigador extends PDI {
    // ¿atributos?
    private final double eurosHora;
    private final double hora;
    private final double semana;
    private final String categoria;
    public Investigador(String nombre, String dni) {
        super(nombre, dni);
        this.eurosHora = 7;
        this.hora = 35;
        this.semana = 4;
        this.categoria = "Investigador";
    }

    // ¿métodos
    public double calcularSueldo() {
        return (this.eurosHora * this.hora * this.semana );
    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return categoria + ": " + nombre + " - " + dni + " - sueldo: " + calcularSueldo();
    }
}