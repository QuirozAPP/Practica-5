public class Pica extends Triangulo{
    public Pica(int x, int y) {
        super(20, 20, 20+x, 10+y, "black");
        new Triangulo(20, 20, 10+x , 30+y, "black");
        new Triangulo(20, 20, 30+x, 30+y, "black");
    }
}

