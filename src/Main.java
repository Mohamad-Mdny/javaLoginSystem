import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //making new instances of classes
        Scanner scanner = new Scanner(System.in);
        Login Login = new Login();
        Register Register = new Register();

        // Starting screen when terminal is opened
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        int ans = Integer.valueOf(scanner.nextLine());

        //calling the methods depending on what the suer wants
        if (ans == 1) {
            Login.login();
        } else if (ans == 2) {
            Register.register();
        } else if (ans == 3) {
            System.out.println("Have a nice day!");
            System.exit(0);
        } else {
            System.out.println("This is not a valid number, choose between 1, 2 and, 3");
        }

    }
}