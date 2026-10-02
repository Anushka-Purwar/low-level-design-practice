package BehaviourPatterns.StatePattern;

public class Walking implements State{
    @Override
    public int calcEta() {
        System.out.print("ETA for walking is: ");
        return 10;
    }

    @Override
    public void calcMethod() {
        System.out.println("method is walking");
    }
}
