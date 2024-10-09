public class Corazon extends Cuadrado {
    public Corazon (int x, int y) {
        super(15, x + 15, y + 15, "red");
        new Cuadrado(15, x + 7, y + 0, "red");
        new Cuadrado(15, x + 0, y + 15, "red");
    }
}
