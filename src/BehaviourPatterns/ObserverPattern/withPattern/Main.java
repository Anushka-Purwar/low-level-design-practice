package BehaviourPatterns.ObserverPattern.withPattern;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        MobileDevice mobileDevice = new MobileDevice();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.attach(device);
        weatherStation.attach(mobileDevice);
        weatherStation.setTemp(26);

        weatherStation.notifyObservers();
        weatherStation.detach(mobileDevice);
        weatherStation.notifyObservers();
    }
}
