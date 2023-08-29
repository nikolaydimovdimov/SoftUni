package P07_Exam_March_2020;

import java.util.Scanner;

public class P04_2_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGroups = Integer.parseInt(scanner.nextLine());
        int musala = 0, monblan = 0, kilimandjaro = 0, k2 = 0, everest = 0, totalClimbers = 0;
        for (int groupCount = 1; groupCount <= numberGroups; groupCount++) {
            int numberClimbers = Integer.parseInt(scanner.nextLine());
            totalClimbers += numberClimbers;
            if (numberClimbers > 40) {
                everest += numberClimbers;
            } else if (numberClimbers > 25) {
                k2 += numberClimbers;
            } else if (numberClimbers > 12) {
                kilimandjaro += numberClimbers;
            } else if (numberClimbers > 5) {
                monblan += numberClimbers;
            } else {
                musala += numberClimbers;
            }
        }
        System.out.printf("%.2f%%%n", musala * 100.0 / totalClimbers);
        System.out.printf("%.2f%%%n", monblan * 100.0 / totalClimbers);
        System.out.printf("%.2f%%%n", kilimandjaro * 100.0 / totalClimbers);
        System.out.printf("%.2f%%%n", k2 * 100.0 / totalClimbers);
        System.out.printf("%.2f%%%n", everest * 100.0 / totalClimbers);
    }
}
