import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mazo {

    List cartas;

    /**
     * Ordena el mazo según el orden natural de las cartas
     */
    public void ordena() {
        String[] numeros = Baraja.numeros;
        String[] palos = Baraja.palos;
        List<Carta> cartasOrdenadas = new ArrayList<Carta>();

        for (String palo : palos)
            for (String numero : numeros)
                cartasOrdenadas.add(new Carta(numero, palo));

        Collections.sort(cartasOrdenadas);
        this.cartas = cartasOrdenadas;
    }

    /**
     * Ordena según un comparator que se pasa como parametro
     */
    public void ordena(Comparator c) {
        String[] numeros = Baraja.numeros;
        String[] palos = Baraja.palos;
        List<Carta> cartasOrdenadas = new ArrayList<Carta>();
        for (String numero : numeros)
            for (String palo : palos)
                cartasOrdenadas.add(new Carta(numero, palo));

        Collections.sort(cartasOrdenadas, c);
        this.cartas = cartasOrdenadas;
    }

    /**
     * Crea un mazo de cartas vacío
     */
    public Mazo() {
        cartas = new ArrayList();
    }

    /**
     * Devuelve la carta de una posición dada
     *
     * @param posicion La posición de la carta
     * @return La carta de dicha posición
     * @exception IllegalArgumentException si la posición no es válida en la
     *                                     lista
     */
    public Carta getCarta(int posicion) {
        return (Carta) cartas.get(posicion);
    }

    /**
     * Añade una carta en el mazo en la posición dada. Las cartas que están
     * después de la posición dada avanzan una posición
     *
     * @param posicion Posición a añadir
     * @param carta    Carta a añadir
     * @exception IllegalArgumentException si la posición no es válida en la
     *                                     lista
     */
    public void insertarCarta(int posicion, Carta carta) {
        List<Carta> aux = new ArrayList<>();

        // Extraemos las cartas desde la posición dada a un array auxiliar
        for (int i = cartas.size() - 1; i >= posicion; i--) {
            aux.add((Carta) cartas.remove(i));
        }

        // Insertamos la carta pasada por parámetro
        cartas.add(carta);

        // Volvemos a insertar las cartas extraídas
        for (int i = aux.size() - 1; i >= 0; i--) {
            cartas.add(aux.get(i));
        }
    }

    /**
     * Extrae la carta de la posición dada, las demás cartas se corren una
     * posición
     *
     * @param posicion Posición de extracción
     * @return Carta que estaba en dicha posición
     * @exception IllegalArgumentException si la posición no es válida en la
     *                                     lista
     */
    public Carta extraerCarta(int posicion) {
        return (Carta) cartas.remove(posicion);
    }

    /**
     * Devuelve la carta de la cima del mazo
     *
     * @return La carta en la cima del mazo
     */
    public Carta extraerCarta() {
        return (Carta) cartas.remove(cartas.size() - 1);
    }

    /**
     * Añade una carta al final del mazo
     *
     * @param carta Carta a añadir
     */
    public void anadirCarta(Carta carta) {
        cartas.add(carta);
    }

    /**
     * Devuelve el número de cartas del mazo
     *
     * @return número de cartas
     */
    public int numCartas() {
        return cartas.size();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    @Override
    public String toString() {
        return "" + cartas;
    }
}
