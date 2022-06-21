import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Equipo de Java");
        System.out.println("Ingrese nombre del equipo");
        String nombreEquipo = sc.next();
        System.out.println("Ingrese universidad del equipo");
        String universidad = sc.next();
        System.out.println("Ingrese el lenguaje del equipo");
        String lenguaje = sc.next();
        System.out.println("Ingrese tamano del equipo");
        int tamanoEquipo;
        try {
            tamanoEquipo = sc.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("El tamano del equipo debe ser un numero");
        }

        Equipo equipo = new Equipo(nombreEquipo, universidad, lenguaje, tamanoEquipo);

        for (int i = 0; i < tamanoEquipo; i++) {

            System.out.println("\nIngrese nombre del programador " + (i + 1));
            String nombreProgramador = sc.next();
            System.out.println("\nIngrese apellido del programador " + (i + 1));
            String apellidoProgramador = sc.next();

            try {
                equipo.programador(nombreProgramador, apellidoProgramador);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        System.out.println("\n" + equipo.toString());

        if (equipo.isCompleto())
            System.out.println("El equipo esta completo");
        else
            System.out.println("El equipo aun no esta completo");

    }
}