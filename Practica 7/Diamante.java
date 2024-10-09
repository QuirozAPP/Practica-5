public class Diamante extends Triangulo {
    public Diamante(int x, int y) {
        super(20, 20, 20+x, 10+y, "red");
        new Triangulo(20, 20, 10+x , 30+y, "red");
        new Triangulo(20, 20, 30+x, 30+y, "red");
    }
}
