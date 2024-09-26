public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        // Crear un cuadrado para representar la carta
        Square cartaShape = new Square();
        cartaShape.changeColor("white");
        cartaShape.changeSize(100);  // tamaño estándar de la carta
        cartaShape.moveHorizontal(p.x);
        cartaShape.moveVertical(p.y);
        cartaShape.makeVisible();

        // Crear un círculo para representar el palo de la carta
        Circle paloShape = new Circle();
        paloShape.changeSize(30);  // tamaño más pequeño para el palo
        paloShape.moveHorizontal(p.x + 35);  // ajustar posición del círculo
        paloShape.moveVertical(p.y + 35);

        // Cambiar el color dependiendo del palo
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

        // Mostrar el valor de la carta (usando la clase Person como placeholder para el valor)
        Person valorDisplay = new Person();
        valorDisplay.changeColor("blue");
        valorDisplay.moveHorizontal(p.x + 50);  // ajustar posición del valor
        valorDisplay.moveVertical(p.y + 70);
        valorDisplay.makeVisible();
    }
}
