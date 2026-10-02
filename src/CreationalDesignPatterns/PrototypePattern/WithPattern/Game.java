package CreationalDesignPatterns.PrototypePattern.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class Game  implements Clone<Game>{
    private ArrayList<GamePeice> list = new ArrayList<>();


    public void addPiece(GamePeice gamePeice){
        list.add(gamePeice);
    }

    public List<GamePeice> getGame(){
        return list;
    }

    public void showBoard(){
        for(GamePeice gamePeice : list){
            System.out.println(gamePeice.toString());
        }
    }



    @Override
    public Game clone() {
        Game game = new Game();
        for(GamePeice g : list){
        //    game.addPiece(g); //shallow copy
            game.addPiece(g.clone()); // deep copy
        }
        return game;
    }
}
