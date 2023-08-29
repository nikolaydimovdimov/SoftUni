package P04Ex_FOR_Loop;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGroups = Integer.parseInt(scanner.nextLine());
        int numberClimbers = 0, sumClimbers = 0;
        int gr1 = 0, gr2 = 0, gr3 = 0, gr4 = 0, gr5 = 0;
        for (; numberGroups > 0; numberGroups--) {
            numberClimbers = Integer.parseInt(scanner.nextLine());
            sumClimbers += numberClimbers;
            if (numberClimbers < 6) {
                gr1 += numberClimbers;
            } else if (numberClimbers < 13) {
                gr2 += numberClimbers;
            } else if (numberClimbers < 26) {
                gr3 += numberClimbers;
            } else if (numberClimbers < 41) {
                gr4 += numberClimbers;
            } else {
                gr5 += numberClimbers;
            }
        }
        System.out.printf("%.2f%%%n", gr1 * 100.0 / sumClimbers);
        System.out.printf("%.2f%%%n", gr2 * 100.0 / sumClimbers);
        System.out.printf("%.2f%%%n", gr3 * 100.0 / sumClimbers);
        System.out.printf("%.2f%%%n", gr4 * 100.0 / sumClimbers);
        System.out.printf("%.2f%%%n", gr5 * 100.0 / sumClimbers);
    }
}
