import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> cartasRepartidas;

    public Mazo() {
        cartas = new ArrayList<>();
        cartasRepartidas = new ArrayList<>();
        restablecerMazo();
    }

    public void restablecerMazo() {
        cartas.clear();
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (Palo palo : Palo.values()) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, palo));
            }
        }
        cartasRepartidas.clear();
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public ArrayList<Carta> repartirCartas(int numeroDeCartas) {
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numeroDeCartas; i++) {
            if (!cartas.isEmpty()) {
                Carta carta = cartas.remove(0);
                mano.add(carta);
                cartasRepartidas.add(carta);
            }
        }
        return mano;
    }

    public void regresarCartasAlMazo(ArrayList<Carta> cartasARegresar) {
        cartas.addAll(cartasARegresar);
        cartasRepartidas.removeAll(cartasARegresar);
    }

    public String mostrarMazo() {
        return "Cartas en el mazo: " + cartas.size() + ", Cartas repartidas: " + cartasRepartidas.size();
    }
}
