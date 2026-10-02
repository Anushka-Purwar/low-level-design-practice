package SOLID.OCP;


public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.paymentMethod(new CreditCard());
    }
}
