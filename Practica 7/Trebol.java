public class Trebol extends Cuadrado {
    public Trebol(int x, int y) {
        super(15, x + 15, y + 15, "black");
        new Cuadrado(15, x + 7, y + 0, "black");
        new Cuadrado(15, x + 0, y + 15, "black");
    }
}
