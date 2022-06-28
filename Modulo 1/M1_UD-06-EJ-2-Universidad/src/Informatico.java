public class Informatico extends PAS {
    // ¿atributos?
    private final double eurosHora;
    private final double hora;
    private final double semana;
    private final String categoria;

    public Informatico(String nombre, String dni, int horasExtra) {
        super(nombre, dni, horasExtra);
        this.eurosHora = 6;
        this.hora = 40;
        this.semana = 4;
        this.categoria = "Informático";
    }

    // ¿métodos?
    public double calcularSueldo() {
        return (this.eurosHora * this.hora * this.semana ) + (this.eurosHoraExtra * this.horasExtra);
    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return categoria + ": " + nombre + " - " + dni + " - sueldo: " + calcularSueldo();
    }
}