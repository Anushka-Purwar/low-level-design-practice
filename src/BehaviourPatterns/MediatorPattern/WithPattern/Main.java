package BehaviourPatterns.MediatorPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        ChatRoom ch = new ChatRoom();
        User Mansi = new User("Mansi",ch);
        User Aditi = new User("Aditi",ch);
        User Mahi = new User("Mahi",ch);

        ch.setUser(Mansi);
        ch.setUser(Aditi);
        ch.setUser(Mahi);

        Aditi.sendMessage("Hallo guys");
    }
}
