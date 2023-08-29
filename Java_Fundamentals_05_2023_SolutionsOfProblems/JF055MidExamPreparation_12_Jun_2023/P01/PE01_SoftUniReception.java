package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.Scanner;

public class PE01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employee1Ef = Integer.parseInt(scanner.nextLine());
        int employee2Ef = Integer.parseInt(scanner.nextLine());
        int employee3Ef = Integer.parseInt(scanner.nextLine());
        int studentsNumber = Integer.parseInt((scanner.nextLine()));

        int sumEmployees = employee1Ef + employee2Ef + employee3Ef;
        int workingTime = 0;

        while (studentsNumber > 0) {
            workingTime++;
            if (workingTime % 4 == 0) continue;
            studentsNumber -= sumEmployees;
        }
        System.out.printf("Time needed: %dh.", workingTime);
    }
}
