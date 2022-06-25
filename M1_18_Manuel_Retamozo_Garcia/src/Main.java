public class Main {
    public static void main(String[] args) throws Exception {
        
        try {
            System.out.println(CalculosNumericos.logNeperiano(5.5));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CalculosNumericos.logNeperiano(-1.5));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CalculosNumericos.raizCuadrada(10.8));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(CalculosNumericos.raizCuadrada(-6.8));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
