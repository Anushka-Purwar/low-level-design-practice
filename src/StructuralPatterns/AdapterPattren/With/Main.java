package StructuralPatterns.AdapterPattren.With;

public class Main {
    public static void main(String[] args) {
        EmailService email = new EmailService();
        email.sendEmail("mansi","anushka","hello");

        //new service

        Email newEmail = new SendGridAdapter(new SendGridEmailService());
        newEmail.sendEmail("anu","aaa","hhjsdchsdhjcbhds");
    }
}
