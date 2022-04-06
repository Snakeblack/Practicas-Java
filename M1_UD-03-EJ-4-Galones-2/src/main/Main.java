package main;

public class Main {
    public static void main(String[] args) {
        double metro;
        int contador;

        contador = 0;
        for (double pulgada = 1; pulgada <= 144; pulgada++) {
            metro = pulgada / 39.37;
            System.out.println(pulgada + "  pulgadas son " + metro + "  metros.");
            contador++;
            if (contador == 12) {
                System.out.println();
                contador = 0;
            }
        }
    }
}
