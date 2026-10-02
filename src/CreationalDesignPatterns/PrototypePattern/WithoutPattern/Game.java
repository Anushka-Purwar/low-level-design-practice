package CreationalDesignPatterns.PrototypePattern.WithoutPattern;

import java.util.ArrayList;
import java.util.List;

public class Game {
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

}
