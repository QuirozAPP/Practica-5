import java.util.ArrayList;

public class Jugador {

    public String nombre;
    private ArrayList<Carta> mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }

    public void recibirCartas(ArrayList<Carta> cartas) {
        mano.addAll(cartas);
    }

    public ArrayList<Carta> devolverCartas() {
        ArrayList<Carta> devolverCartas = new ArrayList<>(mano);
        mano.clear();
        return devolverCartas;
    }

    public String toString() {
        return "Jugador: " + nombre + ", Cartas: " + mano.toString();
    }
}
