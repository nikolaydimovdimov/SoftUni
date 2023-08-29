package JF01_1_LAB_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P01_StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt((scanner.nextLine()));
        double grade = Double.parseDouble((scanner.nextLine()));

        System.out.printf("Name: %s, Age: %d, Grade: %.02f", name, age, grade);
    }
}
