import java.util.ArrayList;

public class RegisterUser {
    private ArrayList<User> listOfUsers;

    public RegisterUser() {
        this.listOfUsers = new ArrayList<>();
    }
    public void addUser(User user) {
        listOfUsers.add(user);
    }
    public void removeUser(User user) {
        listOfUsers.remove(user);
    }
}
