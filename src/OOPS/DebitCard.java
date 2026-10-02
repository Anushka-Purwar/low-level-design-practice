package OOPS;

public class DebitCard extends CreditCard{
    DebitCard(int cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("making payment via debit");
    }
}
