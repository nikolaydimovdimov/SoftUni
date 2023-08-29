package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Scanner;

public class P01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendances = 0;

        for (int i = 0; i < countOfStudents; i++) {
            int countOfAttendances = Integer.parseInt(scanner.nextLine());
            double totalBonus = countOfAttendances * 1.0 / countOfLectures * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendances = countOfAttendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
