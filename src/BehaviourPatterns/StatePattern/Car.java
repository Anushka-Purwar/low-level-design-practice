package BehaviourPatterns.StatePattern;

public class Car implements State{
    @Override
    public int calcEta() {
        System.out.print("Eta for car is: ");
        return 5;
    }

    @Override
    public void calcMethod() {
        System.out.println("Method is car");
    }
}
