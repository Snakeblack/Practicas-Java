package ejercicio;

public class Stack {
    private int size;
    private char[] a;

    // Construct an empty Stack given its size.
    public Stack(int size) {
        this.size = size;
    }

    // Construct a Stack from a Stack.
    public Stack(Stack ob) {
        this.size = ob.size;
        this.a = ob.a;
    }

    // Construct a stack with initial values.
    public Stack(char[] a) {
        this.a = a;
    }

    // Push characters onto the stack.
    public void push(char ch) {
        this.a[size] = ch;
    }

    // Pop a character from the stack.
    public char pop() {
        return this.a[size];
    }
}
