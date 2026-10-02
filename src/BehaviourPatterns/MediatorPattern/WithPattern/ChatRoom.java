package BehaviourPatterns.MediatorPattern.WithPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements  Mediator{
    List<User> userList = new ArrayList<>();

    public void setUser(User user) {
        userList.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for(User user : userList){
            if(user.getName().equals(sender.getName())) continue;

            user.receiveMessage(message, sender);
        }
    }
}
