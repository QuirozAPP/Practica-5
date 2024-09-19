public class Carta {
    
    private String valor;
    private Palo palo;

    public Carta(String valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public String toString() {
        return valor + " de " + palo;
    }
}

enum Palo {
    CORAZONES, DIAMANTES, TREBOLES, PICAS
}
