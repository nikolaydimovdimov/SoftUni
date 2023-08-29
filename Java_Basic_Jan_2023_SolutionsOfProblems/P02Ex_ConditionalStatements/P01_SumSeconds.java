package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeSec1 = Integer.parseInt(scanner.nextLine());
        int timeSec2 = Integer.parseInt(scanner.nextLine());
        int timeSec3 = Integer.parseInt(scanner.nextLine());

        int totalTimeSec = timeSec1 + timeSec2 + timeSec3;

        System.out.printf("%d:%02d", totalTimeSec / 60, totalTimeSec % 60);
    }
}
