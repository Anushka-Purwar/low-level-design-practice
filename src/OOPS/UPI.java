package OOPS;

public class UPI implements Payments{
    private String upiId;
    UPI(String upiId){
        this.upiId = upiId;
    }
    @Override
    public void pay() {
        System.out.println("making payment via upi" + upiId);
    }
}
