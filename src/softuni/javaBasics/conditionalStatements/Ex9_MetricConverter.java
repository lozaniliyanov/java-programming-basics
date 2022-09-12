package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads the following three lines from the console:
// 1) On the first line a distance.
// 2) On the second line the metric unit it is in.
// 3) On the third line the metric unit it will be converted in.
// Print the result with a precision of 3 digits after the decimal point.

public class Ex9_MetricConverter {
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
