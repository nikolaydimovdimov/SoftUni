package P06Ex_Nested_Loops;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guri = Integer.parseInt(scanner.nextLine());
        String projectName = scanner.nextLine();
        double sumAverageGrades = 0;
        int numberProjects = 0;
        while (!projectName.equals("Finish")) {
            double sumGrade = 0;
            for (int count = 0; count < guri; count++) {
                sumGrade += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("%s - %.2f.%n", projectName, sumGrade / guri);
            numberProjects++;
            sumAverageGrades += sumGrade / guri;
            projectName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumAverageGrades / numberProjects);
    }
}
