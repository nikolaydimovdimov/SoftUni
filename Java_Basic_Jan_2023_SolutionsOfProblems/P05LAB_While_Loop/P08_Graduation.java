package P05LAB_While_Loop;

import java.util.Scanner;

public class P08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = 1, outFlag = 0;
        double gpa = 0, sumGpa = 0;
        while (grade <= 12 && outFlag < 2) {
            gpa = Double.parseDouble(scanner.nextLine());
            sumGpa += gpa;
            if (gpa < 4) {
                outFlag++;
            } else {
                grade++;
            }
        }
        if (outFlag == 2) {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGpa / 12);
        }
    }
}
