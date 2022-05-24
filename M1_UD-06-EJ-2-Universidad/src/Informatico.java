public class Informatico extends PAS {
    // ¿atributos?
    private double eurosHora;
    private double hora;
    private double semana;
    private String categoria;

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

    public double getEurosHora() {
        return eurosHora;
    }

    public double getHora() {
        return hora;
    }

    public double getSemana() {
        return semana;
    }

    public void setEurosHora(double eurosHora) {
        this.eurosHora = eurosHora;
    }

}