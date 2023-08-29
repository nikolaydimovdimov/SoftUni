package P07_Exam_March_2020;

import java.util.Scanner;

public class P01_2_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chjoans = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double euro = (bitcoins * 1168 / 1.95 + chjoans * 0.15 * 1.76 / 1.95) * (1 - tax / 100);
        System.out.printf("%.2f", euro);
    }
}
