package StructuralPatterns.AdapterPattren.With;

public class SendGridAdapter implements Email{
    private SendGridEmailService instance;

    public SendGridAdapter(SendGridEmailService sendGridEmailService){
        this.instance = sendGridEmailService;
    }
    @Override
    public void sendEmail(String to, String from, String body) {
        //adapt to new method
        instance.send(to,from,body);
    }

    public String print(){
        return instance.toString();
    }
}
