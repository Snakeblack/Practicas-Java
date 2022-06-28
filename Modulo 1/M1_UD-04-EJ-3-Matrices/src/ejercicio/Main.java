package ejercicio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numsMedia = {8.2, 4.6, 5.2};
        int [] numsMinMax =  {9, 21, 4, 51, 6, 7, 10};

        System.out.println("La media de los numeros " + Arrays.toString(numsMedia) + " es:");
        System.out.println(Matrices.mediaArray(numsMedia) + "\n");

        System.out.println("El valor minimo y maximo de " + Arrays.toString(numsMinMax) + " son:");
        System.out.println(Arrays.toString(Matrices.minMax(numsMinMax)));
    }
}
