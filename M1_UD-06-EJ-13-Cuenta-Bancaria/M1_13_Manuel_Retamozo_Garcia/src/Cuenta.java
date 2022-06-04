public class Cuenta {
    protected float saldo;
    private int numeroDeIngresos = 0;
    private int numeroDeRetiros = 0;
    protected float tasaAnual;
    private float comisionMensual = 0;
    

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void ingresarDinero(float dinero) {
        this.saldo += dinero;
        this.numeroDeIngresos++;
    }
    
    public void retirarDinero(float dinero) {
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
            this.numeroDeRetiros++;
        }
    }

    public void calcularInteresMensual() {
        this.saldo += this.saldo * this.tasaAnual / 100;
    }

    public void extractoMensual() {
        this.saldo -= this.comisionMensual;
        calcularInteresMensual();
    }

    @Override
    public String toString() {
        return "Cuenta [comisionMensual=" + comisionMensual + ", numeroDeIngresos=" + numeroDeIngresos
                + ", numeroDeRetiros=" + numeroDeRetiros + ", saldo=" + saldo + ", tasaAnual=" + tasaAnual + "]";
    }

}
