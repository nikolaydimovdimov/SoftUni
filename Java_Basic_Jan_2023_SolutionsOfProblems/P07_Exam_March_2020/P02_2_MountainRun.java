package P07_Exam_March_2020;

import java.util.Scanner;

public class P02_2_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double time = distance * timePerMeter + Math.floor(distance / 50) * 30;
        if (time < record) {
            System.out.printf("Yes! The new record is %.2f seconds.", time);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", time - record);
        }
    }
}
