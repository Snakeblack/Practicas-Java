import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreProgramador = "";
        String apellidoProgramador = "";
        int tamanoEquipo;
        int tamanoValidator = 0;
        boolean flagValidator = false;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del equipo");
        String nombreEquipo = sc.nextLine();
        System.out.println("Ingrese universidad del equipo");
        String universidad = sc.nextLine();
        System.out.println("Ingrese el lenguaje del equipo");
        String lenguaje = sc.nextLine();
        System.out.println("Ingrese tamano del equipo");
        tamanoEquipo = sc.nextInt();
        do {
            try {
                tamanoValidator = Equipo.tamanoValidator(tamanoEquipo);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Ingrese tamano del equipo");
                tamanoEquipo = sc.nextInt();
            }
        } while (tamanoValidator == 0);

        Equipo equipo = new Equipo(nombreEquipo, universidad, lenguaje, tamanoEquipo);
        sc.nextLine();
        int i = 0;
        while (i < tamanoEquipo) {
            do {
                flagValidator = false;
                System.out.println("\nIngrese el nombre del programador " + (i + 1));
                try {
                    nombreProgramador = sc.nextLine();
                    Programador.nombre(nombreProgramador);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    flagValidator = true;
                }
            } while (flagValidator);

            do {
                flagValidator = false;
                System.out.println("\nIngrese los apellidos del programador " + (i + 1));
                try {
                    apellidoProgramador = sc.nextLine();
                    Programador.apellidos(apellidoProgramador);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    flagValidator = true;
                }
            } while (flagValidator);
            try {
                equipo.programador(nombreProgramador, apellidoProgramador);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            i++;
        }

        System.out.println("\n" + equipo.toString());

        equipo.isCompleto();

        if (tamanoEquipo < 3) {

            System.out.println("\nQuieres agregar a un programador mas? (s/n)");
            char respuesta = sc.next().charAt(0);
            sc.nextLine();
            if (respuesta == 's') {
                do {
                    flagValidator = false;
                    System.out.println("\nIngrese el nombre del programador " + (i + 1));
                    try {
                        nombreProgramador = sc.nextLine();
                        Programador.nombre(nombreProgramador);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        flagValidator = true;
                    }
                } while (flagValidator);

                do {
                    flagValidator = false;
                    System.out.println("\nIngrese los apellidos del programador " + (i + 1));
                    try {
                        apellidoProgramador = sc.nextLine();
                        Programador.apellidos(apellidoProgramador);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        flagValidator = true;
                    }
                } while (flagValidator);

                try {
                    equipo.programador(nombreProgramador, apellidoProgramador);
                    equipo.settamanoEquipo(3);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

            sc.close();
            System.out.println(equipo.toString());
            equipo.isCompleto();
        }
    }
}