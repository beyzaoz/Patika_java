package Week_7.Practice;

public class UserAuthMain {
    public static void main(String[] args) {
        AuthService authService = new AuthService();
        authService.register(new User("patika@gmail.com", "12345"));
        authService.register(new User("aysepatika@gmail.com", "75321"));
        authService.register(new User("fatmapatika@gmail.com", "678hby"));
        authService.register(new User("sedapatika@gmail.com", "567tyhe"));
        authService.register(new User("sedapatika@gmail.com", "567tyhe"));
        authService.getAllUsers();

    }
}
