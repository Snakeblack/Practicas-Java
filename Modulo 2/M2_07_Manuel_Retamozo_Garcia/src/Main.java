import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bag con iteradores");
		
		//El siguiente c�digo deber�a funcionar sin problemas con vuestra Bag.
		
		Bag<Integer> b = new Bag<>();
		b.add(1);
		b.add(2);
		b.add(3);
		
		System.out.println("for tradicional con iteradores");		
		for(Iterator<Integer> i = b.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		System.out.println("for each");
		for(Integer i: b)
			System.out.println(i);
		
		System.out.println("Extraemos de forma aleatorio");
		while(!b.isEmpty()) {
			System.out.println(b.extract());
		}

	}

}
