package be.intecbrussel;

import java.util.Scanner;

public class DoubleSymbolApp {
    public static void main(String[] args) {

        System.out.println("Enter your new password:");
        String password = new Scanner(System.in).nextLine();

        if (isLongerThan10Chars(password) & isInLowerCase(password)) {
            System.out.println("password is valid");
        }
    }

    private static boolean isLongerThan10Chars(String password) {
        System.out.println("Testing if sentence is longer than 10 chars.");
        System.out.println("Amount of characters: " + password.length());
        return password.length() > 10;
    }

    private static boolean isInLowerCase(String password) {
        System.out.println("Testing if sentence is in lowercase");
        System.out.println("sentence: " + password);
        return password.toLowerCase().equals(password);
    }

}
