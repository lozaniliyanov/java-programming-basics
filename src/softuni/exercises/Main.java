package softuni.exercises;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads two numbers from the console and prints the larger one.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(Math.max(num1, num2));
    }
}