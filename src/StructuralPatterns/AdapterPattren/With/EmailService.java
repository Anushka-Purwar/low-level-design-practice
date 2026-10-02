package StructuralPatterns.AdapterPattren.With;

public class EmailService implements Email{
    private String to;
    private String from;
    private String body;

    @Override
    public void sendEmail(String to, String from, String body){
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
