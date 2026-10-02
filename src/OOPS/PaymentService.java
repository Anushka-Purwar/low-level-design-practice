package OOPS;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, Payments> map;

    PaymentService(){
        map = new HashMap<>();
    }

    public void addPayment(String username, Payments payments){
        map.put(username,payments);
    }

    public void makePayment(String username){
        Payments payments = map.get(username);
        payments.pay(); //run time polymorphism
    }
}
