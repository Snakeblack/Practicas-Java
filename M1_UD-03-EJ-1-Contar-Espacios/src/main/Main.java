package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        char entrada;
        int numeroDeEspacios;

        numeroDeEspacios = 0;
        Scanner tecla = new Scanner(System.in);
        do {
            System.out.println("Inserte un Caracter");
            entrada = tecla.nextLine().charAt(0);
            if (entrada == ' ') {
                numeroDeEspacios++;
            }
        }while (entrada != '.');

        System.out.println("Han sido " + numeroDeEspacios + " espacios.");
    }
}