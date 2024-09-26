public class Visualizador {

    public static void carta(Carta c, Posicion p) {

        Square cartaShape = new Square();
        cartaShape.changeColor("white");
        cartaShape.changeSize(100);
        cartaShape.moveHorizontal(p.x);
        cartaShape.moveVertical(p.y);
        cartaShape.makeVisible();

        Circle paloShape = new Circle();
        paloShape.changeSize(30); 
        paloShape.moveHorizontal(p.x + 35);
        paloShape.moveVertical(p.y + 35);

        switch (c.palo) {
            case CORAZONES:
                paloShape.changeColor("red");
                break;
            case DIAMANTES:
                paloShape.changeColor("red");
                break;
            case TREBOLES:
                paloShape.changeColor("black");
                break;
            case PICAS:
                paloShape.changeColor("black");
                break;
        }
        paloShape.makeVisible();

        Person valorDisplay = new Person();
        valorDisplay.changeColor("blue");
        valorDisplay.moveHorizontal(p.x + 50);
        valorDisplay.moveVertical(p.y + 70);
        valorDisplay.makeVisible();
    }
}
