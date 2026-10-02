package BehaviourPatterns.ObserverPattern;

import javax.sound.midi.Soundbank;

class Devices{
    private float temp;

    public void setTemp(float temp){
        System.out.println("temperature: " + temp + " C");
    }
}

class WeatherStation{
    private float temp;
    private Devices devices;

    WeatherStation(Devices de){
        this.devices = de;
    }

    public void setTemp(float temp){
        this.temp = temp;
        devices.setTemp(temp);
    }

}
public class WithoutObP {
    public static void main(String[] args) {
        Devices devices = new Devices();
        WeatherStation station = new WeatherStation(devices);
        station.setTemp(26);
        station.setTemp(30);
    }
}
