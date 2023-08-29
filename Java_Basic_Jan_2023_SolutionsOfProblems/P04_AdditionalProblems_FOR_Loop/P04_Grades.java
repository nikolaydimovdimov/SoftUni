package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStudents = Integer.parseInt(scanner.nextLine());
        double grade = 0, sum = 0;
        int lavel1 = 0, lavel2 = 0, lavel3 = 0, lavel4 = 0;
        for (int count = 0; count < numberStudents; count++) {
            grade = Double.parseDouble(scanner.nextLine());
            sum += grade;
            if (grade < 3) {
                lavel4++;
            } else if (grade < 4) {
                lavel3++;
            } else if (grade < 5) {
                lavel2++;
            } else {
                lavel1++;
            }
        }
        System.out.printf("Top students: %.2f%%%n", lavel1 * 100.0 / numberStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", lavel2 * 100.0 / numberStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", lavel3 * 100.0 / numberStudents);
        System.out.printf("Fail: %.2f%%%n", lavel4 * 100.0 / numberStudents);
        System.out.printf("Average: %.2f", sum / numberStudents);
    }
}
