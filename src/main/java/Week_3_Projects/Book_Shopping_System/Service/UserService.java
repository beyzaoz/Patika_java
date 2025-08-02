package Week_3_Projects.Book_Shopping_System.Service;

import Week_3_Projects.Book_Shopping_System.User;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private static Set<User> users = new HashSet<>(); //user hashsete atandi

    public void create(String name, String email, String password){


        User userlar = new User(name,email,password); //name email ve password zorunlu
        users.add(userlar);// hashmap e butun kullanicilar eklendi

    }

    public void list(){ //butun userlar burda tutuldu.
        for(User user: users){
            System.out.println(user.getName()+" -> "+user.getEmail());
        }
    }



}
