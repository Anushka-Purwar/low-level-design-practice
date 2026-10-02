package StructuralPatterns.AdapterPattren.With;

public class SendGridEmailService{
    private String to;
    private String from;
    private String body;

    public void send(String to, String from, String body) {
        this.to = to;
        this.from  = from;
        this.body = body;
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "email is  {" + to +" " + from +" " + body + " }";
    }

}
