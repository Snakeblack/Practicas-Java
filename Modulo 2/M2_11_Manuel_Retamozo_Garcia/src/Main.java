import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        
        Persona p1 = new Persona("Juan", "12345678A", "juan12");
        Persona p2 = new Persona("Ana", "87654321B", "ana12@gmail.com");
        Persona p3 = new Persona("Luis9", "12389778A", "luis10@hotmail.com");
        Persona p4 = new Persona("Maria#", "87654345B", "maria8@outlook.com");
        Persona p5 = new Persona("Pedro", "550047896A", "pedro45@proton.me");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        // El nombre no debe de contener números ni caracteres especiales.
        for (Persona p : lista) {
            if (p.getNombre().matches(".*\\d.*")) {
                System.out.println("El nombre de " + p.getNombre() + " contiene numeros.");
            }
            if (p.getNombre().matches(".*\\W.*")) {
                System.out.println("El nombre de " + p.getNombre() + " contiene caracteres especiales.");
            }
        }

        // El DNI o NIE debe de tener el formato correcto.
        for (Persona p : lista) {
            if (!p.getDni().matches("[0-9]{8}[A-Z]")) {
                System.out.println("El DNI de " + p.getNombre() + " no es valido");
            }
        }

        // El correo electrónico debe de ser válido.
        for (Persona p : lista) {
            if (!p.getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                System.out.println("El email de " + p.getNombre() + " no es valido");
            }
        }

    }
}
