package StructuralPatterns.FacadePattern.With;

public class Client {
    public static void main(String[] args) {
        APIGateway apiGateway = new APIGateway();
        apiGateway.getFullDetails("123","dcgdjscb");
    }
}
