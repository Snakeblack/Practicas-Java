public class Clientes extends Mercado{
    private final int codigoCliente;
    private static int countCodigoCliente = 1;
    private int comprasRealizadas;
    private int descuento;

    public Clientes(String nombre, String apellidos, String dni, String direccion, String telefono) {
        super(nombre, apellidos, dni, direccion, telefono);
        this.comprasRealizadas = 0;
        this.descuento = 0;
        codigoCliente = countCodigoCliente++;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente " + nombre + " " + apellidos + " {" + '\n' +
                "   dni: " + dni + '\n' +
                "   direccion: " + direccion + '\n' +
                "   telefono: " + telefono + '\n' +
                "   codigoCliente: " + codigoCliente + '\n' +
                "   comprasRealizadas: " + comprasRealizadas + '\n' +
                "   descuento: " + descuento + "%\n" +
                '}';
    }

    public void compra(){
        comprasRealizadas++;
        descuento();
    }

    public void descuento() {
        if (comprasRealizadas % 100 == 0)
            this.descuento++;
    }

}
