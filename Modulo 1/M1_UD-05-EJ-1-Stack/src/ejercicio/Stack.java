package ejercicio;

public class Stack {
    private int size;
    private char[] a;

    // Construct an empty Stack given its size.
    public Stack(int size) {
        this.size = size;
        a = new char[size];
    }

    // Construct a Stack from a Stack.
    public Stack(Stack ob) {
        this.size = ob.size;
        this.a = ob.a;
    }

    // Construct a stack with initial values.
    public Stack(char[] a) {
        this.size = a.length;
        this.a = a;
    }

    // Push characters onto the stack.
    public void push(char ch) {
        if (size == a.length) {
            char[] b = new char[2 * size];
            System.arraycopy(a, 0, b, 0, size);
            a = b;
        }
        a[size++] = ch;
    }

    // Pop a character from the stack.

    public char pop(){
        if (size == 0) {
            return '\0';
        } else {
            char[] b = new char[size - 1];
            if (size > 0) System.arraycopy(a, 0, b, 0, size - 1);
            char ch = a[size - 1];
            a = b;
            size--;
            return ch;
        }
    }
}
