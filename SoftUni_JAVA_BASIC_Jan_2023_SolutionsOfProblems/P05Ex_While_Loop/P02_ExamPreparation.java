package P05Ex_While_Loop;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxBadResults = Integer.parseInt(scanner.nextLine());
        String nameProblem = "", lastProblem = "";
        int result = 0, badResults = 0, sum = 0, count = 0;
        nameProblem = scanner.nextLine();
        while (!nameProblem.equals("Enough")) {
            lastProblem = nameProblem;
            result = Integer.parseInt(scanner.nextLine());
            sum += result;
            count++;
            if (result <= 4) {
                badResults++;
            }
            if (badResults >= maxBadResults) {
                break;
            }
            nameProblem = scanner.nextLine();
        }
        if (nameProblem.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", sum * 1.0 / count);
            System.out.printf("Number of problems: %d%n", count);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", badResults);
        }
    }
}
