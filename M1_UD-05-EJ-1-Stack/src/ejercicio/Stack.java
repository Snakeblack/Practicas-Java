package ejercicio;

import java.util.EmptyStackException;

public class Stack {

    // Construct an empty Stack given its size.
    public Stack(int size) {
        this.size = size;
    }

    // Construct a Stack from a Stack.
    public Stack(Stack ob) {
        this.ob = ob;
    }

    // Construct a stack with initial values.
    public Stack(char[] a) {
        this.a = a;
    }

    // Push characters onto the stack.
    public char push(char ch) {
        return ch;
    }

    // Pop a character from the stack.
    public char pop() {

    }

}
