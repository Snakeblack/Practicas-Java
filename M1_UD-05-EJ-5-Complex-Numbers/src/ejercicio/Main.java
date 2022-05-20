package ejercicio;

public class Main {
    public static void main(String[] args)
    {
        ComplexNumber c1 = new ComplexNumber(5, 8);
        ComplexNumber c2 = new ComplexNumber(4.6, 45.96);

        System.out.println("\nSUMA:");
        ComplexNumber c3 = c1.add(c2);
        System.out.println("Numero Real de c3: " + c3.getReal());
        System.out.println("Numero Imaginario de c3: " + c3.getImaginary());
        System.out.println(c3);

        System.out.println("\nRESTA:");
        ComplexNumber c4 = c1.substract(c2);
        System.out.println("Numero Real de c4: " + c4.getReal());
        System.out.println("Numero Imaginario de c4: " + c4.getImaginary());
        System.out.println(c4);

        System.out.println("\nMULTIPLICACIÓN:");
        ComplexNumber c5 = c1.multiply(c2);
        System.out.println("Numero Real de c5: " + c5.getReal());
        System.out.println("Numero Imaginario de c5: " + c5.getImaginary());
        System.out.println(c5);

        System.out.println("\nDIVISIÓN:");
        ComplexNumber c6 = c1.divide(c2);
        System.out.println("Numero Real de c6: " + c6.getReal());
        System.out.println("Numero Imaginario de c6: " + c6.getImaginary());
        System.out.println(c6);

        System.out.println("\nEQUALS:");
        ComplexNumber c7 = new ComplexNumber(5, 8);
        ComplexNumber c8 = c7.divide(c2);
        System.out.println("¿El c6 y el c8 son iguales? " + c6.equals(c8));

    }
}
