package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a password from the console and prints if "Welcome" if it's "s3cr3t!P@ssw0rd" or "Wrong password!" if it's not.

public class Ex4_PasswordGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}