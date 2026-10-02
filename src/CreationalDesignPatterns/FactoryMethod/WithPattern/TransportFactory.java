package CreationalDesignPatterns.FactoryMethod.WithPattern;

public class TransportFactory {
    public static Transport getObject(String type){
        switch(type){
            case "car": return new Car();
            case "bus": return new Bus();
            default:  throw new IllegalArgumentException("not supported");
        }

    }
}
