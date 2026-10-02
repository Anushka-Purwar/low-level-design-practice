package OOPS;

public class PaymentCalls {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.addPayment("mansiCreditCard", new CreditCard(1234, "mansiCreditCard"));
        paymentService.makePayment("mansiCreditCard");

        paymentService.addPayment("mansiUPI", new UPI("tyrdx"));
        paymentService.makePayment("mansiUPI");
    }
}
