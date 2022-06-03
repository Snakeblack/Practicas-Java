public class Administrativo extends PAS {
    // ¿atributos?
    private final double eurosHora;
    private final double hora;
    private final double semana;
    private final String categoria;

    public Administrativo(String nombre, String dni, int horasExtra) {
        super(nombre, dni, horasExtra);
        this.eurosHora = 7.5;
        this.hora = 37;
        this.semana = 4;
        this.categoria = "Administrativo";
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

