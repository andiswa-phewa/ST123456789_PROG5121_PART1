package za.ac.iie.prog5121.quickchat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        login login = new login();

        System.out.println("=== QuickChat Registration ===");
        System.out.print("First name: ");
        String firstName = sc.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = sc.nextLine().trim();

        System.out.print("Username: ");
        String username = sc.nextLine().trim();

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.print("Cell number (+27XXXXXXXXX): ");
        String cell = sc.nextLine().trim();

        // Register user
        String regMsg = login.registerUser(username, password, cell, firstName, lastName);
        System.out.println(regMsg);

        System.out.println("\n=== QuickChat Login ===");
        System.out.print("Enter username: ");
        String loginUser = sc.nextLine().trim();

        System.out.print("Enter password: ");
        String loginPass = sc.nextLine();

        // Attempt login
        boolean success = login.loginUser(loginUser, loginPass);
        System.out.println(login.returnLoginStatus());

        // Debug info (optional)
        System.out.println("Login success boolean: " + success);
    }
}
