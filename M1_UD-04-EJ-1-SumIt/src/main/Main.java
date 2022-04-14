package main;

//Crea un método con el nombre sum() que use varargs para sumar un número indeterminado de valores enteros y devolver el resultado.
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));

    }

    static int sum(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }
}
