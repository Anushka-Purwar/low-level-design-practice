package CreationalDesignPatterns.BuilderDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("conscrete","tiles", "wood").setGarder(true)
                .setPool(true).build();

        System.out.println(house.toString());
    }
}
