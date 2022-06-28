package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {
    private int size;
    private final List<String> elements;

    public Bag()
    {
        this.size = 0;
        this.elements = new ArrayList<>();
    }

    /** Añade un elemento a la bolsa */
    public boolean add(Object e)
    {
        if (e == null)
            return false;
        if (e instanceof String)
        {
            this.elements.add((String) e);
            this.size++;
            return true;
        }
        return false;
    }

    /** Elimina todos los elementos de la bolsa */
    public void clear() {
        this.elements.clear();
        this.size = 0;
    }

    /** Comprueba si un objeto determinado está en la bolsa */
    public boolean contains(Object o)
    {
        return this.elements.contains(o);
    }

    /** Indica si la bolsa está vacía o no */
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    /** Devuelve el número de elementos de la bolsa */
    public int size()
    {
        return this.size;
    }

    /**
     * Extrae un elemento de la bolsa. Todos, independiente-
     * mente de como se hayan introducido tienen la misma
     * probabilidad de salir.
     * Ayuda: Usa la clase java.util.Random y su método
     * nextInt para obtener un entero aleatorio.
     */
    public Object extract()
    {
        Random r = new Random();
        int index = r.nextInt(this.size);
        Object o = this.elements.get(index);
        this.elements.remove(index);
        this.size--;
        return o;
    }
}
