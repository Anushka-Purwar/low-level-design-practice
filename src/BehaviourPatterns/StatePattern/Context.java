package BehaviourPatterns.StatePattern;

public class Context {
    private State state;

    public void setState(State state){
        this.state = state;
    }

    public int getEta(){
        return state.calcEta();
    }

    public void getMethod(){
        state.calcMethod();
    }
}
