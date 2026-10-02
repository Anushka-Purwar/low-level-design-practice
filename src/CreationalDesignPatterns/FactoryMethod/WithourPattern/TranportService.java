package CreationalDesignPatterns.FactoryMethod.WithourPattern;

public class TranportService {
    public static void main(String[] args) {
        Car car = new Car();
        car.deliver();
        Bus bus = new Bus();
        bus.deliver();
    }
}
