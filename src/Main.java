import service.AuthService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthService authService = new AuthService();

        System.out.println("=== User Registration ===");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean success = authService.register(name, email, password);

        if (success) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Registration failed!");
        }

        sc.close();
    }
}


