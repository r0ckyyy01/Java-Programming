package LoginProgram;

import java.io.Console;
import java.util.Scanner;

public class LoginProgram {
    public static void main(String[] args) {
        // Predefined username and password for authentication
        final String USERNAME = "admin";
        final String PASSWORD = "password123";

        // Number of allowed login attempts
        int maxAttempts = 3;
        int attempts = 0;
        boolean loggedIn = false;

        Scanner scanner = new Scanner(System.in);
        Console console = System.console();

        System.out.println("Welcome! Please log in.");

        // Loop for login attempts
        while (attempts < maxAttempts && !loggedIn) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            String inputPassword;

            // Check if console is available for masking password
            if (console != null) {
                // Read password securely and mask input with '*'
                char[] passwordChars = console.readPassword("Enter password: ");
                inputPassword = new String(passwordChars);
            } else {
                // If running in IDE without console, fallback to plain input (cannot mask)
                System.out.print("Enter password (input will not be masked): ");
                inputPassword = scanner.nextLine();
            }

            // Comment: Checking if username and password match
            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful! Welcome, " + USERNAME + ".");
                loggedIn = true;
            } else {
                attempts++;
                // Comment: Displaying remaining attempts
                System.out.println("Incorrect username or password. Attempts left: " + (maxAttempts - attempts));
                if (attempts == maxAttempts) {
                    // Comment: User has exhausted all attempts
                    System.out.println("Maximum login attempts reached. Access denied.");
                }
            }
        }

        scanner.close();
    }
}