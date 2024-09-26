public class Main {
    public static void main(String[] args) {

        Carta carta1 = new Carta("A", Palo.CORAZONES);

        Visualizador.carta(carta1, new Posicion(20, 40));

        Carta carta2 = new Carta("K", Palo.PICAS);

        Visualizador.carta(carta2, new Posicion(150, 40));
    }
}

