package SOLID.OCP;

import OOPS.Payments;

public class DebitCard implements Payments {
    @Override
    public void pay() {
        System.out.println("Paying via debit");
    }
}
