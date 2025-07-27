package Week_2.OOP.Encapsulation;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        if(username.length()>=3 && username.length()<=15){
        this.username = username;
        }else{
            System.out.println("Username should be between 3-15 character.");
        }
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        if(password.length()>=8 && password.length()<=11){
        this.password = password;
        }else {
            System.out.println("Password length has to be between 8-11 character.");
        }


    }
}
