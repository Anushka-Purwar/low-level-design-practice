package CreationalDesignPatterns.FactoryMethod.WithPattern;

public class TranportService {
    public static void main(String[] args) {
        Transport vehicle = TransportFactory.getObject("car"); //car, bus,bike
        vehicle.deliver();
    }
}
