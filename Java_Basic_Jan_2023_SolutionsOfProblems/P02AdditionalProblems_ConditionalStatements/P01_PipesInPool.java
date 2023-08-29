package P02AdditionalProblems_ConditionalStatements;

import java.util.Scanner;

public class P01_PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double vFull = h * (p1 + p2);
        if (vFull > v)
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, vFull - v);
        else
            System.out.printf("The pool is %.2f %% full. " +
                            "Pipe 1: %.2f %%. Pipe 2: %.2f %%.", (vFull / v) * 100,
                    ((h * p1) / vFull) * 100, ((h * p2) / vFull) * 100);
    }
}
