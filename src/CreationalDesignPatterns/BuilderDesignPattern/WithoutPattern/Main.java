package CreationalDesignPatterns.BuilderDesignPattern.WithoutPattern;

public class Main {
    public static void main(String[] args) {
        House house = new House("Concrete","tiles", "wood",true,true);
        System.out.println(house.toString());
    }
}
