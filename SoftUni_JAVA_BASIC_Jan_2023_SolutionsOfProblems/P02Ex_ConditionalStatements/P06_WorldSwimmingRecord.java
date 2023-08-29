package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSeconds1Meter = Double.parseDouble(scanner.nextLine());
        double time = distanceMeters * timeSeconds1Meter + Math.floor(distanceMeters / 15) * 12.5;

        if (time < recordSeconds)
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - recordSeconds);
    }
}
