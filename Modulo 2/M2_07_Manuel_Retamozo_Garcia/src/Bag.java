import java.util.Iterator;
import java.util.ArrayList;

public class Bag<T> implements Iterable<T> {
  
    private ArrayList<T> bag;
    
    public Bag() {
      bag = new ArrayList<>();
    }
    
    public void add(T elem) {
      bag.add(elem);
    }
    
    public T extract() {
      int index = (int) (Math.random() * bag.size());
      return bag.remove(index);
    }
    
    public boolean isEmpty() {
      return bag.isEmpty();
    }
    
    public int size() {
      return bag.size();
    }
    
    public Iterator<T> iterator() {
      return bag.iterator();
    }
    
}