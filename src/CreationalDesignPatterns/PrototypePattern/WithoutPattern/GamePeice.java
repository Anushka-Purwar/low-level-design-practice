package CreationalDesignPatterns.PrototypePattern.WithoutPattern;

public class GamePeice {
    private String color;
    private int position;

    public GamePeice(String color, int position){
        this.color = color;
        this.position = position;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + position +
                '}';
    }
}
