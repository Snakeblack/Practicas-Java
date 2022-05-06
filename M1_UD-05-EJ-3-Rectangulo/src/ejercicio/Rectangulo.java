package ejercicio;
/*
 * Author: Manuel Michael Retamozo Garcia.
 */
public class Rectangulo {
    /* Atributos con las dimensiones de este rectángulo ( valores enteros ). */

    /**
     * Inicializa un nuevo rectángulo con los valores pasados por parámetro .
     * Si se intenta dar valor negativo a alguna de las dimensiones ,
     * lo corrige al valor positivo usando Math.abs(int a).
     * @param base base .
     * @param altura altura .
     */
    private int base;
    private int altura;

    public Rectangulo (int base, int altura) {
        this.base = Math.abs(base);
        this.altura = Math.abs(altura);
    }
    /**
     * Inicializa un nuevo rectángulo con base 2 y altura 1.
     */
    public Rectangulo () {
        this.base = 2;
        this.altura = 1;
    }

    /**
     * Indica si este rectángulo es un cuadrado .
     * @return true si y solo si la base y la altura son iguales .
     */
    public boolean esCuadrado () {
        return base == altura;
    }

    /**
     * Calcula el área de este rectángulo .
     * @return El área del rectángulo.
     */
    public int area () {
        return base * altura;
    }

    /**
     * Calcula el perímetro de este rectángulo .
     * @return perímetro del rectángulo.
     */
    public int perimetro () {
        return 2 * (base + altura);
    }

    /**
     * Gira 90 grados este rectángulo intercambiado la base por la altura.
     */
    public void gira () {
        int temp;
        temp = base;
        base = altura;
        altura = temp;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
}
