package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a number from the console and prints if it's even or odd.

public class Ex2_EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(num % 2 == 0 ? "even" : "odd");
    }
}
