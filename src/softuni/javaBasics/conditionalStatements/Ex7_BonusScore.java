package softuni.javaBasics.conditionalStatements;

import java.util.Scanner;


//  PROBLEM DESCRIPTION: Write a program that reads a score from the console and depending on the score it adds the following bonus points:
// 1) If the score is less than or equal to 100, the bonus points are 5.
// 2) If the score is more than 100, the bonus points are 20% of the score.
// 3) If the score is more than 1000, the bonus points are 10% of the score.

public class Ex7_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (points <= 100) {
            bonus = 5;
        }
        if (points >= 100) {
            bonus = points * 0.2;
        }
        if (points >= 1000) {
            bonus = points * 0.1;

        }
        if (points % 2 == 0) {
            bonus += 1;

        }
        if (points % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(points + bonus);

    }
}
