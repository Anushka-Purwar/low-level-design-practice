package BehaviourPatterns.ObserverPattern.withPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private int temp;
    List<Observer> observerList = new ArrayList<>();

    public void setTemp(int temp){
        this.temp = temp;
    }

    public int getTemp(){
        return temp;
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs : observerList){
            obs.update(temp);
        }
    }
}
