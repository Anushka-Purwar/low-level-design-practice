package OOPS;

public class CreditCard extends Card{
    CreditCard(int cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("paying via creditCard " + cardNo);
    }
}
