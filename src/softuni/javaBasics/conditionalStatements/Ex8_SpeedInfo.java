package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a speed from the console and depending on the speed it prints the following message:
// 1) If the speed is less than or equal to 10, the message is "slow".
// 2) If the speed is between 10 and 50, the message is "average".
// 3) If the speed is between 50 and 150, the message is "fast".
// 4) If the speed is between 150 and 1000, the message is "ultra fast".
// 5) If the speed is more than 1000, the message is "extremely fast".

public class Ex8_SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed <= 10 ) {
            System.out.println("slow");
        } else if (speed > 10 && speed <= 50) {
            System.out.println("average");
        } else if (speed > 50 && speed <= 150) {
            System.out.println("fast");
        } else if (speed > 150 && speed <= 1000) {
            System.out.println("ultra fast");
        } else System.out.println("extremely fast");
    }
}
