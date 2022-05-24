public class Administrativo extends PAS {
    // ¿atributos?
    private double eurosHora;
    private double hora;
    private double semana;
    private String categoria;

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

    public double getEurosHora() {
        return eurosHora;
    }

    public double getHora() {
        return hora;
    }

    public double getSemana() {
        return semana;
    }
}

