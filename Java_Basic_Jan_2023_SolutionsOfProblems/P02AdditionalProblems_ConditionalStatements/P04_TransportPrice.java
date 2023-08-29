package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String dayPeriod = scanner.nextLine();

        if (distance >= 100)
            System.out.printf("%.2f", distance * 0.06);
        else if (distance >= 20)
            System.out.printf("%.2f", distance * 0.09);
        else if (dayPeriod.equals("day"))
            System.out.printf("%.2f", distance * 0.79 + 0.7);
        else
            System.out.printf("%.2f", distance * 0.9 + 0.7);
    }
}
