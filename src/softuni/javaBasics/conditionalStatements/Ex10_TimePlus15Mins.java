package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a time (hours and minutes) on two separate lines from the console
//  and adds 15 minutes to that time. Hours are between 0 and 23, minutes are between 0 and 59. Time format is hours:minutes.
//  Add a 0 in front of the minutes where needed.

public class Ex10_TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String from = scanner.nextLine();
        String to = scanner.nextLine();

        if (from.equals("mm")) {
            num /= 1000;
        } else if (from.equals("cm")) {
            num /= 100;
        }
        if (to.equals("mm")) {
            num *= 1000;
        } else if (to.equals("cm")) {
            num *= 100;
        }
        System.out.printf("%.3f", num);
    }
}
