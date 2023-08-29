package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int number;
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        for (int count = 0; count < n; count++) {
            number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%%n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p3 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p4 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p5 * 1.0 / n * 100);
    }
}
