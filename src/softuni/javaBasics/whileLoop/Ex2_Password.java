package softuni.javaBasics.whileLoop;

//  Write a program that reads a user's username and a password on two separate lines from the console
//  and reads a password on the third line. If the passwords on the second and third lines match
//  print "Welcome (username)!" on the console. If they don't, keep reading a password, until they match.


import java.util.Scanner;

public class Ex2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
