package ejercicio;

/**
 * Un número complejo es un número formado por un par ordenado de números reales.
 * El primer elemento "a" se define como parte real y el segundo "b" se define como la
 * parte imaginaria. Una forma típica de representar estos números es de
 * forma binomial como: (a + bi) donde "a" es la parte real y "b" es la parte
 * imaginaria. Varios ejemplos serían: (5 + 8i), (4.6 + 45.96i).
 *
 * Define una clase ComplexNumber que represente a un número real y que implemente
 * los métodos que se incluyen a continuación.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Construye un número complejo a partir de su parte real y su parte imaginaria.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Devuelve el valor de la parte real.
     */
    public double getReal() {
        return real;
    }

    /**
     * Devuelve el valor de la parte imaginaria.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Devuelve un nuevo número complejo que es el resultado de sumar, al número
     * complejo actual, el complejo que se pasa por parámetro.
     * Recuerda que el objeto actual no puede cambiar al ser inmutable.
     * La suma de complejos se define de la siguiente forma:
     * Suma: (a + bi) + (c + di) = (a + c) + (b + d)i
     */
    public ComplexNumber add(ComplexNumber n) {

    }

    /**
     * Devuelve un nuevo número complejo que es el resultado de restar, al número
     * complejo actual, el complejo que se pasa por parámetro.
     * Recuerda que el objeto actual no puede cambiar al ser inmutable.
     * La resta de complejos se define de la siguiente forma:
     * Resta: (a + bi) - (c + di) = (a - c) + (b - d)i
     */
    public ComplexNumber substract(ComplexNumber n) {

    }

    /**
     * Devuelve un nuevo número complejo que es el resultado de multiplicar,
     * al número complejo actual, el complejo que se pasa por parámetro.
     * Recuerda que el objeto actual no puede cambiar al ser inmutable.
     * La multiplicación de complejos se define de la siguiente forma:
     * Multiplicación: (a + bi) * (c + di) = (ac – bd) + (ad +bc)i
     */
    public ComplexNumber multiply(ComplexNumber n) {

    }

    /**
     * Devuelve un nuevo número complejo que es el resultado de dividir,
     * al número complejo actual, el complejo que se pasa por parámetro.
     * Recuerda que el objeto actual no puede cambiar al ser inmutable.
     * La división de complejos se define de la siguiente forma:
     * División: (a + bi) / (c + di) = ((ac + bd) / (c2 + d2)) + ((bc – ad) / (c2 + d2))i
     */
    public ComplexNumber divide(ComplexNumber n) {

    }


    /**
     * Compara dos números complejos para ver si son iguales.
     * Dos números complejos (a + bi) y (c + di) son iguales sí:
     * a = c y b = d
     */
    @Override
    public boolean equals(Object obj) {

    }

    /**
     * Devuelve un hashCode que sea consistente con el método equals
     */
    @Override
    public int hashCode() {

    }

    /** Devuelve una representación en String del número complejo con su representación binomial
     * Si la parte imaginaria es negativa deberemos poner un menos en vez de un más.
     * Algunos ejemplos:
     *   "5+4i" "3.5-4.5i"
     */
    @Override
    public String toString() {

    }
}

