package SOLID.DIP.GOODCode;

public class SSMSService implements NotiChannel{
    @Override
    public void send(String msg) {
        System.out.println("sending vis sms: " + msg);
    }
}
