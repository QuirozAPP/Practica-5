public class Circulo extends Circle{

    public Circulo(int size, int xPosition, int yPosition, String color) {
        changeSize(size);
        changeColor(color);
        makeVisible();
        moveHorizontal(xPosition - 310);
        moveVertical(yPosition - 120);
   }
}
