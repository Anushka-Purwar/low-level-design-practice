package StructuralPatterns.AdapterPattren.Without;

public class Main {
    public static void main(String[] args) {
        Email email = new EmailService();

        email.sendEmail("mansi","anushka","hello");
        System.out.println(email.toString());
    }
}
