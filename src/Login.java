import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("username: ");
        username = scanner.nextLine();
        System.out.println("password: ");
        password = scanner.nextLine();

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}