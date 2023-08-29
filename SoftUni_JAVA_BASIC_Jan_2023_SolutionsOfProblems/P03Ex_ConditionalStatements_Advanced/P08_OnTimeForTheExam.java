package P03Ex_ConditionalStatements_Advanced;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrived = Integer.parseInt(scanner.nextLine());
        int minutesArrived = Integer.parseInt(scanner.nextLine());

        int timeMinutesExam = hourExam * 60 + minutesExam;
        int timeMinutesArrived = hourArrived * 60 + minutesArrived;

        int difference = timeMinutesExam - timeMinutesArrived;
        int minutes = Math.abs(difference) % 60;
        int hour = Math.abs(difference) / 60;

        if (difference == 0) {
            System.out.println("On time");
        }

        if (difference > 0) {
            if (difference <= 30) {
                System.out.println("On time");
            } else {
                System.out.println("Early");
            }
            if (hour == 0) {
                System.out.printf("%d minutes before the start", minutes);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }

        if (difference < 0) {
            System.out.println("Late");
            if (hour == 0) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        }
    }
}
