public class Triangulo extends Triangle {

    public Triangulo(int altura, int ancho, int x, int y, String color) {
        changeSize(altura, ancho);
        changeColor(color);
        moveHorizontal(x - 210);
        moveVertical(y - 140);
        makeVisible();
    }
}
