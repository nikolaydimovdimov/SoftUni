package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gradeInNumber = Double.parseDouble(scanner.nextLine());

        printGradeInWord(gradeInNumber);
    }

    public static void printGradeInWord(double grade) {

        if (grade < 3) {
            System.out.println("Fail");
        } else if (grade < 3.5) {
            System.out.println("Poor");
        } else if (grade < 4.5) {
            System.out.println("Good");
        } else if (grade < 5.5) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
