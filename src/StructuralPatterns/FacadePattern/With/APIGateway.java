package StructuralPatterns.FacadePattern.With;

public class APIGateway {

    PaymentDetails paymentDetails = new PaymentDetails();
    UserDetails userDetails = new UserDetails();

    public void getFullDetails(String userId, String paymentId){
        userDetails.getUserDetails(userId);
        paymentDetails.getPaymentDetails(paymentId);
    }
}
