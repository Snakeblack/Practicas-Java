package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char entrada;
        int cambios;

        cambios = 0;
        Scanner tecla = new Scanner(System.in);
        do {
            System.out.println("Inserte un Caracter");
            entrada = tecla.nextLine().charAt(0);
            if (entrada >= 97 && entrada <= 122) {
                entrada = (char) (entrada - 32);
                cambios++;
            }else if (entrada >= 65 && entrada <= 90) {
                entrada = (char) (entrada + 32);
                cambios++;
            }
            if (entrada != '.') {
                System.out.println(entrada);
            }
        }while (entrada != '.');

        System.out.println("Se han realizado " + cambios + " cambios.");
    }
}
