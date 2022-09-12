package softuni.javaBasics.whileLoop;

import java.util.Scanner;

//  PROBLEM DESCRIPTION: Write a program that reads a number between 1 and 100 from the console
//  and print "Invalid number!" if it is outside that range. Keep reading a number from the console until
//  a number within the range is read. Then print the following: "The number is: (the number)".

public class Ex1_NumberInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", num);
    }
}