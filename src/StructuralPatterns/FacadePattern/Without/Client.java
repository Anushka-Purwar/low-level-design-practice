package StructuralPatterns.FacadePattern.Without;

public class Client {
    public static void main(String[] args) {
        PaymentDetails paymentDetails = new PaymentDetails();
        UserDetails userDetails = new UserDetails();

        paymentDetails.getPaymentDetails("77979dsbcjsbc");
        userDetails.getUserDetails("123");
    }
}
