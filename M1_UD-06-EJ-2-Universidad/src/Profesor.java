public class Profesor extends PDI {
    // ¿atributos?
    private final double eurosHora;
    private final double hora;
    private final double semana;
    private final String categoria;
    private final int sexenios;
    private final double eurosSexenio;

    public Profesor(String nombre, String dni, int sexenios) {
        super(nombre, dni);
        this.eurosHora = 8;
        this.hora = 37;
        this.semana = 4;
        this.categoria = "Profesor";
        this.sexenios = sexenios;
        this.eurosSexenio = 100;
    }

    // ¿métodos?
    public double calcularSueldo() {
        return (this.eurosHora * this.hora * this.semana ) + (this.eurosSexenio * this.sexenios);
    }

    public String getCategoria() {
        return this.categoria;
    }

    @Override
    public String toString() {
        return categoria + ": " + nombre + " - " + dni + " - sueldo: " + calcularSueldo();
    }
}