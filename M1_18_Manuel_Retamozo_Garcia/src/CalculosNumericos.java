public class CalculosNumericos {
    
    // Calcular el logaritmo neperiano recibiendo un valor double como parametro. Este método debe ser estatico. Si el valor no es positivo se genera una excepción aritmética.
    public static double logNeperiano(double valor) throws ArithmeticException {
        if (valor <= 0) {
            throw new ArithmeticException("El valor debe ser positivo");
        }
        return Math.log(valor);
    }

    //Calcular la raíz cuadrada recibiendo un valor double como parámetro. Este método debe ser estático. Si el valor no es positivo se genera una excepción aritmética.
    public static double raizCuadrada(double valor) throws ArithmeticException {
        if (valor <= 0) {
            throw new ArithmeticException("El valor debe ser positivo");
        }
        return Math.sqrt(valor);
    }

}
