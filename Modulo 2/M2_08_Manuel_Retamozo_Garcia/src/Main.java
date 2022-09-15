import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Dogs y funciones");
        Dog boi    = new Dog("boi"   ,  30,  6);
        Dog tyri   = new Dog("tyri"  ,  40, 12);
        Dog charis = new Dog("charis", 120,  7);
        
        System.out.println(boi);
        
        // ... 

        Function<Dog, String> getName = dog -> dog.toString();
        Function<String, Character> getInitial = name -> name.charAt(0);
        
        Character andThenBoi = getName.andThen(getInitial).apply(boi);
        Character composeBoi = getInitial.compose(getName).apply(boi);

        System.out.println("andThenMethod: " + andThenBoi);
        System.out.println("composeMethod: " + composeBoi);

        System.out.println(tyri);

        Character andThenTyri = getName.andThen(getInitial).apply(tyri);
        Character composeTyri = getInitial.compose(getName).apply(tyri);

        System.out.println("andThenMethod: " + andThenTyri);
        System.out.println("composeMethod: " + composeTyri);

        System.out.println(charis);

        Character andThenCharis = getName.andThen(getInitial).apply(charis);
        Character composeCharis = getInitial.compose(getName).apply(charis);

        System.out.println("andThenMethod: " + andThenCharis);
        System.out.println("composeMethod: " + composeCharis);
	}

}
