package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a geometrical 2D shape and depending on its type, it also reads its side/s or radius from the console
//  and prints its area.

public class Ex5_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        double area = 0;
        switch (figureType) {
            case "square" -> {
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
            }
            case "rectangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a * b;
            }
            case "circle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                area = Math.PI * Math.pow(a, 2);
            }
            case "triangle" -> {
                double a = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = (a * b) / 2;
            }
        }
        System.out.printf("%.3f", area);
    }
}
