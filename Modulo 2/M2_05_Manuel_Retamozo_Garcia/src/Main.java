public class Main {
    public static void main(String[] args) throws Exception {
        Carta carta = new Carta(Palo.Espadas, Numero.cinco);
        System.out.println(carta);
    }
}

enum Palo {
    Espadas('E'), Copas('C'), Bastos('B'), Oros('O');

    private char abreviatura;

    Palo(char abreviatura) {
        this.abreviatura = abreviatura;
    }

    public char getAbreviatura() {
        return abreviatura;
    }
}

enum Numero {
    As('A'), dos('2'), tres('3'), cuatro('4'), cinco('5'), seis('6'), siete('7'), sota('S'), caballo('C'), rey('R');
    
    private char valor;
    
    Numero(char valor) {
        this.valor = valor;
    }
    
    public char getValor() {
        return valor;
    }
}

class Carta {
    private Palo palo;
    private Numero numero;
    
    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }
    
    public Palo getPalo() {
        return palo;
    }
    
    public Numero getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Carta: " + numero.getValor() + palo.getAbreviatura();
    }
}
