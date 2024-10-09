public class Main {
    public static void main(String[] args) {
        int squareSize = 100; 
        int gap = 10;         

        for (int i = 0; i < 4; i++) {
            int xPosition = i * (squareSize + gap) + 20;
            Cuadrado square = new Cuadrado(squareSize, xPosition, 100, "yellow");
        }

        Trebol trebol = new Trebol(85, 105);
        Corazon corazon = new Corazon(195, 105);
        Diamante diamante = new Diamante(295, 90);
        Pica pica = new Pica(410, 90);

        int diametro = 30;
        int espacio = 10; 
        for (int i = 0; i < 5; i++) {
            int xPosition = i * (diametro + espacio) + 20; 
            Circulo circle = new Circulo(xPosition, 200, xPosition, "red");} 
    }
}
