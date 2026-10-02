package SOLID.SRP;

public class Main {
    public static void main(String[] args) {
        User user = new User("7865");
        UserRepo userRepo = new UserRepo();
        userRepo.saveUser();
    }
}
