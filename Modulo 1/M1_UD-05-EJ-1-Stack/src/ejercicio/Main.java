package ejercicio;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push('a');
        s.push('b');
        s.push('c');
        s.push('d');
        s.push('e');
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}