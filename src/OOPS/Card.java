package OOPS;

public class Card implements Payments{
    protected int cardNo;
    private String userName;

    Card(int cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public void pay() {

    }
}
