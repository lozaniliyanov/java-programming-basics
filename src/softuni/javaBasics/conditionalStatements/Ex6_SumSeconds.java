package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads an athletes' three separate lap times in seconds, sums them and prints them in minutes.

public class Ex6_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalSecs = first + second + third;

        int mins = totalSecs / 60;
        int secs = totalSecs % 60;

        if (secs < 10) {
            System.out.printf("%d:0%d", mins, secs);
        } else {
            System.out.printf("%d:%d", mins, secs);
        }
    }
}
