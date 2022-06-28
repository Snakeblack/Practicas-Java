public final class Carta implements Comparable<Carta> {
    private final String numero;
    private final String palo;

    public Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return the palo
     */
    public String getPalo() {
        return palo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 47 * hash + (this.palo != null ? this.palo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.palo != other.palo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numero + " " + palo;
    }

    /**
     * Compara dos cartas según el orden natural de las cartas
     */
    @Override
    public int compareTo(Carta carta) {
        if (this.numero.equals(carta.getNumero()) && this.palo.equals(carta.getPalo()))
            return 1;
        return 0;
    }
}
