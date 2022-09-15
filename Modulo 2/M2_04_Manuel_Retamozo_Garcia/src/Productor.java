import java.util.List;

public class Productor implements Runnable {
    private List<Integer> lista;
    private final int CAPACIDAD = 10;
    private int contador = 0;
    public Productor(List<Integer> lista) {
        this.lista = lista;
    }
    @Override
    public void run() {
        while (true) {
            try {
                producir();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void producir() throws InterruptedException {
        synchronized (lista) {
            while (lista.size() == CAPACIDAD) {
                System.out.println("La lista esta llena. El productor espera.");
                lista.wait();
            }
        }
        synchronized (lista) {
            lista.add(contador++);
            System.out.println("Se ha producido el elemento " + contador);
            lista.notifyAll();
        }
    }
}