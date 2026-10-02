package SOLID.OCP;


public class CreditCard implements Payments {
    @Override
    public void pay() {
        System.out.println("Paying via credit");
    }
}
