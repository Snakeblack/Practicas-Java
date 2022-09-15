import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
  private int size;
  private ArrayList<T> elements;
  
  public Bag() {
    this.size = 0;
    this.elements = new ArrayList<T>();
  }

  /** Añade un elemento a la bolsa */
  public boolean add(T element) {
    this.elements.add(element);
    this.size++;
    return true;
  }

  /** Elimina todos los elementos de la bolsa */
  public void clear() {
    this.elements.clear();
    this.size = 0;
  }

  /** Comprueba si un objeto determinado está en la bolsa */
  public boolean contains(T element) {
    return this.elements.contains(element);
  }

  /** Indica si la bolsa está vacía o no */
  public boolean isEmpty() {
    return this.size == 0;
  }

  /** Devuelve el número de elementos de la bolsa */
  public int size() {
    return this.size;
  }

  /**
   * Extrae un elemento de la bolsa. Todos, independiente-
   * mente de como se hayan introducido tienen la misma
   * probabilidad de salir.
   * Ayuda: Usa la clase java.util.Random y su método
   * nextInt para obtener un entero aleatorio.
   */
  public Object extract() {
    Random random = new Random();
    int index = random.nextInt(this.size);
    return this.elements.get(index);
  }
}
