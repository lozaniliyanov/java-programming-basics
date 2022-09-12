package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a number from the console and prints if it's less than 100, between 100 and 200 or greater than 200.

public class Ex3_100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if  (num < 100) {
            System.out.println("Less than 100");
        }
        else if (num <= 200) {
            System.out.println("Between 100 and 200");
        }
        else {
            System.out.println("Greater than 200");
        }
    }
}
