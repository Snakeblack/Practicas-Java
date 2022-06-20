public class CuentaDeAhorros extends Cuenta {
    private boolean estado;

    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public void cambioDeEstado() {
        if (super.saldo < 100) {
            this.estado = false;
        } else {
            this.estado = true;
        }
    }
}