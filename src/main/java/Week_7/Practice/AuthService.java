package Week_7.Practice;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> registeredUsers = new ArrayList<>();
    public void register(User user){
        boolean exist = registeredUsers.stream()
                .anyMatch(registeredUser -> registeredUser.getEmail().equalsIgnoreCase(user.getEmail()));
        if(exist){
            throw new UserAlreadyExistException(ExceptionsMessages.USER_ALREADY_EXIST);
        }
        registeredUsers.add(user);
        System.out.println("Kullanici Basarili olarak kaydedildi. Email: " + user.getEmail());

    }

    public void getAllUsers(){
         registeredUsers.forEach(System.out::println);
    }
}
