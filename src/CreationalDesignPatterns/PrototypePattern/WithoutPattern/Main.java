package CreationalDesignPatterns.PrototypePattern.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        Game g1 = new Game();
        g1.addPiece(new GamePeice("Red",1));

        Game g2 = new Game();
        g1.showBoard();
        for(GamePeice g : g1.getGame()){
            g2.addPiece(g);
        }
        g2.showBoard();
    }
}
