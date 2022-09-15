import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Crea la lista de ciudades
		List <Ciudad> ciudades = new ArrayList<Ciudad>();
		ciudades.add(new Ciudad("Madrid", "Madrid", 3000000));
		ciudades.add(new Ciudad("Barcelona", "Barcelona", 1600000));
		ciudades.add(new Ciudad("Valencia", "Valencia", 800000));
		ciudades.add(new Ciudad("Sevilla", "Sevilla", 700000));
		ciudades.add(new Ciudad("Mostoles", "Madrid", 200000));
		ciudades.add(new Ciudad("Fuenlabrada", "Madrid", 200000));
		ciudades.add(new Ciudad("Badalona", "Barcelona", 170000));
		ciudades.add(new Ciudad("Getafe", "Madrid", 175000));

		// Realiza las operaciones con Streams que permitan contestar a las preguntas

		// 1. ¿Cuántas ciudades hay en la Total?
		System.out.println("1. Cuantas ciudades hay en la Total?");
		System.out.println(ciudades.stream().count());
		
		// 2. ¿Cuántas ciudades de "Madrid" tienen más de 1000 habitantes?
		System.out.println("2. Cuantas ciudades de \"Madrid\" tienen mas de 1000 habitantes?");
		System.out.println(ciudades.stream().filter(ciudad -> ciudad.getProvincia().equals("Madrid") && ciudad.getHabitantes() > 1000).count());

		// 3. ¿De que provincias son las ciudades?
		System.out.println("3. De que provincias son las ciudades?");
		ciudades.stream().map(ciudad -> ciudad.getProvincia()).distinct().forEach(System.out::println);

		// 4. ¿De cuantas provincias diferentes son las ciudades?
		System.out.println("4. De cuantas provincias diferentes son las ciudades?");
		System.out.println(ciudades.stream().map(ciudad -> ciudad.getProvincia()).distinct().count());

		// 5. ¿Alguna ciudad de Madrid tiene más de 50000 habitantes?
		System.out.println("5. Alguna ciudad de Madrid tiene mas de 50000 habitantes?");
		System.out.println(ciudades.stream().anyMatch(ciudad -> ciudad.getProvincia().equals("Madrid") && ciudad.getHabitantes() > 50000));
	}

}
