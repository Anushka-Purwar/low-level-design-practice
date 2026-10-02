package CreationalDesignPatterns.FactoryMethod.WithourPattern;

public class Bus implements Transport{

    @Override
    public void deliver() {
        System.out.println("deliver by bus");
    }
}
