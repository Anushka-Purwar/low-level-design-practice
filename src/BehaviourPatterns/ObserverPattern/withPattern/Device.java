package BehaviourPatterns.ObserverPattern.withPattern;

public class Device implements Observer{
    @Override
    public void update(int temp) {
        System.out.println("temp is :" + temp);
    }
}
