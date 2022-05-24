public class Profesor extends PDI {
    // ¿atributos?
    private double eurosHora;
    private double hora;
    private double semana;
    private String categoria;
    private int sexenios;
    private double eurosSexenio;

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
}