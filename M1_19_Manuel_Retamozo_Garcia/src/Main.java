import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        List<Programador> Programadores = new ArrayList<Programador>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre de la universidad: ");
        String nombreUniversidad = sc.nextLine();

        System.out.println("Introduce el nombre del equipo de programadores: ");
        String nombreEquipo = sc.nextLine();

        System.out.println("Ingrese el lenguaje de programacion que utiliza el equipo: ");
        String lenguaje = sc.nextLine();

        System.out.println("Cuantos programadores quiere añadir al equipo: ");
        int numeroProgramadores = sc.nextInt();

        for (int i = 0; i < numeroProgramadores; i++) {
            System.out.println("Introduce el nombre del programador: ");
            String nombre = sc.nextLine();

            System.out.println("Introduce los apellidos del programador: ");
            String apellidos = sc.nextLine();

            try {
                Programador.validarAtributos(nombre, apellidos);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            Programadores.add(new Programador(nombre, apellidos));
        }
        
        sc.close();
        
        EquipoDeProgramadores equipo = new EquipoDeProgramadores(nombreUniversidad, nombreEquipo, lenguaje);
        
        System.out.println(equipo.toString());

        System.out.println(equipo.equipoCompleto());
        
    }
}
