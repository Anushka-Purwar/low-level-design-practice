package CreationalDesignPatterns.PrototypePattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.addPiece(new GamePeice("Red",1));

        Game g2 = g1.clone();
        g1.showBoard();
        g2.addPiece(new GamePeice("pink",5));
        System.out.println();
        g2.showBoard();
    }
}
