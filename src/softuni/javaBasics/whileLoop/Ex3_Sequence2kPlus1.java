package softuni.javaBasics.whileLoop;

//  Write a program that reads a number from the console
//  and prints all numbers that are less than or equal to the number from the sequence: 1, 3, 5, 7, 15, 31...
//  .


import java.util.Scanner;

public class Ex3_Sequence2kPlus1 {
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
