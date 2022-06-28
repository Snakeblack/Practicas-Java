package ejercicio;


public class Main {
    public static void main(String[] args) {
        Rational rational1 = new Rational(-2,8);
        Rational rational2 = new Rational(2,-6);
        Rational rational3 = new Rational(-4,16);
        Rational numCero = new Rational(0,1);

        System.out.println(rational1);
        System.out.println(rational2.getNumerator());
        System.out.println(rational3.getDenominator());

        System.out.println("NUMEROS:");
        System.out.println(rational1.hashCode());
        System.out.println(rational2.hashCode());
        System.out.println(rational3.hashCode());

        System.out.println("COMPARACIONES:");
        System.out.println(rational1.equals(rational2));
        System.out.println(rational1.equals(rational3));
        System.out.println(rational2.equals(rational3));

        System.out.println("FRACCIONES REDUCIDAS:");
        System.out.println(rational1.reducedFraction());
        System.out.println(rational2.reducedFraction());
        System.out.println(rational3.reducedFraction());

        System.out.println("FRACCIONES NULAS:");
        System.out.println(numCero.reducedFraction());
        System.out.println(numCero.hashCode());

        System.out.println("SUMAS:");
        System.out.println(rational1.addition(rational2));
        System.out.println(rational1.addition(rational3));
        System.out.println(rational1.addition(numCero));

        System.out.println("RESTAS:");
        System.out.println(rational1.subtraction(rational2));
        System.out.println(rational1.subtraction(rational3));
        System.out.println(rational1.subtraction(numCero));

        System.out.println("MULTIPLICACIONES:");
        System.out.println(rational1.multiplication(rational2));
        System.out.println(rational1.multiplication(rational3));
        System.out.println(rational1.multiplication(numCero));

        System.out.println("DIVISIONES:");
        System.out.println(rational1.division(rational2));
        System.out.println(rational1.division(rational3));
        System.out.println(rational1.division(numCero));

    }
}
