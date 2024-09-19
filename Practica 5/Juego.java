public class Juego {
    public static void main(String[] args) {

        Mazo mazo = new Mazo();
        Jugador jugador1 = new Jugador("Ness");
        Jugador jugador2 = new Jugador("Lucas");

        mazo.barajar();
        System.out.println("Mazo barajado.");
        System.out.println(mazo.mostrarMazo());

        jugador1.recibirCartas(mazo.repartirCartas(5));
        jugador2.recibirCartas(mazo.repartirCartas(5));

        System.out.println(jugador1);
        System.out.println(jugador2);
        System.out.println(mazo.mostrarMazo());

        mazo.regresarCartasAlMazo(jugador1.devolverCartas());
        mazo.regresarCartasAlMazo(jugador2.devolverCartas());

        System.out.println("Después de regresar las cartas al mazo:");
        System.out.println(mazo.mostrarMazo());
    }
}
