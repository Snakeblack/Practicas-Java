import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cumpleanios {
    public static void main(String[] args) throws ParseException {
        // Crear el formato (AAAA-MM-DD)
        SimpleDateFormat fechaSimple = new SimpleDateFormat("yyyy-MM-dd");

        // Mostrar fecha y hora actual
        Calendar calendario = Calendar.getInstance();
        System.out.println("Fecha actual: " + fechaSimple.format(calendario.getTime()));

        // Pedir fecha de nacimiento por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (AAAA-MM-DD):");
        String input = scanner.nextLine();

        // Parsear fecha de nacimiento
        Date fechaNacimiento = fechaSimple.parse(input);

        // Calcular días hasta el próximo cumpleaños
        Calendar cumpleanios = Calendar.getInstance();
        cumpleanios.setTime(fechaNacimiento);
        cumpleanios.set(Calendar.YEAR, calendario.get(Calendar.YEAR));
        if (cumpleanios.before(calendario)) {
            cumpleanios.set(Calendar.YEAR, calendario.get(Calendar.YEAR) + 1);
        }
        long diferencia = cumpleanios.getTimeInMillis() - calendario.getTimeInMillis();
        long dias = diferencia / (24 * 60 * 60 * 1000);

        // Mostrar días hasta el próximo cumpleaños
        System.out.println("Faltan " + dias + " días para tu próximo cumpleaños.");
    }
}