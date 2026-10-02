package BehaviourPatterns.MediatorPattern.WithPattern;

public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom){
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void sendMessage(String msg){
        chatRoom.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, User sender){
        System.out.println("getting message from " + sender.getName() + " to " + this.getName() + " msg: " + msg);
    }
    public String getName() {
        return name;
    }
}
