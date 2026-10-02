package BehaviourPatterns.StatePattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new Car());
        System.out.println(context.getEta());
        context.getMethod();
    }
}
