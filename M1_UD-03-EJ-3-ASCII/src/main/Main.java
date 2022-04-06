package main;

public class Main {
    public static void main(String[] args) {
        // Declaramos variables

        // Ponemos un texto indicando que se introduzcan caracteres
        char entrada;
        int numeroDeEspacios;

        Scanner tecla = new Scanner(System.in);
        do {
            System.out.println("Inserte un Caracter");
            entrada = tecla.nextLine().charAt(0);
            if (entrada >= 97 && entrada <= 122) {
                numeroDeEspacios++;
            }
        }while (entrada != '.');

        System.out.println("Han sido " + numeroDeEspacios + " espacios.");
        // Bucle do..while

        // Leemos un caracter

        // Si es minúscula la pasamos a mayúscula,
        // la imprimimos y sumamos uno al número de cambios

        // Si es mayúscula la pasamos a minúscula,
        // la imprimimos y sumamos uno al número de cambios

        // Nos salimos cuando encontramos un punto

        // Imprimimos el número de cambios

    }
}
