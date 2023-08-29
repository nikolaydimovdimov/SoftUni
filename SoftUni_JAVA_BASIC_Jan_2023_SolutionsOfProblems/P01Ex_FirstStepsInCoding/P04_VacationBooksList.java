package P01Ex_FirstStepsInCoding;

import java.util.Scanner;

public class P04_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToRaed = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = (pagesInBook / pagesPerHour) / daysToRaed;

        System.out.println(hoursPerDay);
    }
}
