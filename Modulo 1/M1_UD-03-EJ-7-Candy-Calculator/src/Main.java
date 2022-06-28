import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(candyCalculator(15)));
    }

    /** En las fiestas del barrio hay competiciones deportivas que premian el desempeño
     *  en ellas con cupones que puedes luego cambiar por golosinas. Una barra de caramelo
     *  se puede cambiar por 10 cupones y un chicle por 3 cupones.
     *
     *  Escribe una clase CandyCalculator que tenga un método candyCalculator que permita
     *  calcular, dado un número dado de cupones, cuántas barras de caramelo y chicles puedes
     *  obtener si gastas todos sus cupones en barras de caramelo primero, y utilizas los
     *  cupones restantes en chicles. También te tiene que devolver el número de cupones
     *  restantes que no puedes gastar.
     *
     *  Devuelve los valores en un array en donde la posición [0] representa las barras de
     *  caramelo, la posición [1] los chicles y la posición [2] los cupones restantes.
     */

    public static int[] candyCalculator(int num_coupons) {
        int[] candys = new int[3];
        int barraDeCaramelos = num_coupons / 10;
        int chicles = (num_coupons % 10) / 3;
        int restantes = (num_coupons % 10) % 3;

        candys[0] = barraDeCaramelos;
        candys[1] = chicles;
        candys[2] = restantes;

        return candys;
    }
}