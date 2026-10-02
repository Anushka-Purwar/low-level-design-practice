package BehaviourPatterns.ObserverPattern.withPattern;

public class MobileDevice implements Observer{
    @Override
    public void update(int temp) {
        System.out.println("temp is :" + temp);
    }
}
