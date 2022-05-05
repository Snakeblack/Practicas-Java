package ejercicio;

public class Rational {
    private int numerator;
    private int denominator;

    /**
     * Método constructor que inicializa el racional a los valores pasados.
     * Supondremos que no podemos pasar un denominador puesto a cero.
     */
    public Rational(int numerator, int denominador) {

        if( denominador == 0 ){
            this.numerator = 0;
            denominator = 1;
        }else {
            this.numerator = numerator;
            denominator = denominador;
        }
    }

    /**
     * Devuelve un nuevo racional que es igual a la suma del racional actual mas el racional
     * que se le pasa por parámetro.
     */
    public Rational addition(Rational r) {
        Rational addition = new Rational(0, 1);

        addition.numerator = this.numerator *r.denominator + this.denominator *r.numerator;
        addition.denominator = this.denominator * r.denominator;

        return addition.reducedFraction();
    }

    /**
     * Devuelve un nuevo racional que es igual a la resta del racional actual menos el racional
     * que se le pasa por parámetro.
     */
    public Rational subtraction(Rational r) {
        Rational subtraction = new Rational(0, 1);

        subtraction.numerator = this.numerator * denominator + this.denominator *r.numerator;
        subtraction.denominator = this.denominator * r.denominator;

        return subtraction.reducedFraction();
    }


    /**
     * Devuelve un nuevo racional que es igual a la multiplicación del racional actual por el racional
     * que se le pasa por parámetro.
     */
    public Rational multiplication(Rational r) {
        Rational multiplication = new Rational(0, 1);

        multiplication.numerator = this.numerator * r.numerator;
        multiplication.denominator = this.denominator * r.denominator;

        return multiplication.reducedFraction();
    }


    /**
     * Devuelve un nuevo racional que es igual a la división del racional actual por el racional
     * que se le pasa por parámetro.
     */
    public Rational division(Rational r) {
        Rational division = new Rational(0, 1);

        division.numerator = this.numerator * r.denominator;
        division.denominator = this.denominator * r.numerator;

        if(division.denominator == 0)
            System.out.println("[!]Error... Estas dividiendo entre cero");

        return  division.reducedFraction();
    }

    /**
     * Devuelve una representación en String del racional.
     * El racional 1/2 se representaría como "1/2"
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


    /**
     * Devuelve el numerador del racional.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Devuelve el denominador del racional
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Devuelve un método equals que determina si dos racionales son iguales.
     * Dos racionales son iguales si son equivalentes. Así 1/2 = 2/4
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        final Rational other = (Rational) o;
        return numerator *other.denominator == denominator *other.numerator;
    }


    /**
     * Devuelve el hashCode de un racional
     */
    @Override
    public int hashCode() {
        Rational reducedFraction = reducedFraction();
        int hash = 7;
        hash = 31 * hash + reducedFraction.numerator;
        hash = 31 * hash + reducedFraction.denominator;

        return hash;
    }

    /**
     * Devuelve el máximo común divisor del numerador y el denominador.
     */
    public int gcd() {
        int numerador = Math.abs(this.numerator);
        int denominador = Math.abs(this.denominator);

        if(numerador < denominador) {
            int aux = numerador;
            numerador = denominador;
            denominador = aux;
        }
        while(denominador > 0) {
            int aux = numerador % denominador;
            numerador = denominador;
            denominador = aux;
        }
        return numerador;
    }


    /**
     * Devuelve una versión reducida del racional actual que resulta de
     * dividir tanto el numerador como el denominador por su máximo
     * común divisor
     */
    public Rational reducedFraction() {
        if (numerator == 0)
            return new Rational(0, 1);

        int gcd = gcd();

        Rational res = new Rational(numerator /gcd, denominator /gcd);
        if (denominator < 0) {
            res.numerator = -res.numerator;
            res.denominator = -res.denominator;
        }
        return res;
    }
}
