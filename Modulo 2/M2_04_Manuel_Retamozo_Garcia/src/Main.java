import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creamos la lista compartida
        List<Integer> lista = new ArrayList<Integer>();
        // Creamos el productor y el consumidor
        Productor p = new Productor(lista);
        Consumidor c = new Consumidor(lista);
        // Creamos los hilos
        Thread hiloProductor = new Thread(p);
        Thread hiloConsumidor = new Thread(c);
        // Iniciamos los hilos
        hiloProductor.start();
        hiloConsumidor.start();
        // Esperamos a que terminen
        hiloProductor.join();
        hiloConsumidor.join();
    }
}

