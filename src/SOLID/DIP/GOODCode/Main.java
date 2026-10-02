package SOLID.DIP.GOODCode;

public class Main {
    public static void main(String[] args) {
        NotiService notiService = new NotiService(new EmailService());
        notiService.send("shippment updates send");

        NotiService notiServiceSMs = new NotiService(new SSMSService());
        notiServiceSMs.send("pin for otp 1234");
    }
}
