package P05Ex_While_Loop;

import java.util.Scanner;

public class P04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int sumSteps = 0;
        while (sumSteps < 10000) {
            input = scanner.nextLine();
            if (input.equals("Going home")) {
                input = scanner.nextLine();
                sumSteps += Integer.parseInt(input);
                break;
            }
            sumSteps += Integer.parseInt(input);
        }
        if (sumSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        } else {
            System.out.printf("Goal reached! Good job!%n" + "%d steps over the goal!", sumSteps - 10000);
        }
    }
}
