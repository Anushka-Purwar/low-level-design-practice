package SOLID.DIP.GOODCode;

public class EmailService implements NotiChannel{
    @Override
    public void send(String msg) {
        System.out.println("sending via email: " + msg);
    }
}
