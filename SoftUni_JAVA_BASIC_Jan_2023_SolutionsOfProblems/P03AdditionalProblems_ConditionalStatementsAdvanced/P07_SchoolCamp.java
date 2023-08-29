package P03AdditionalProblems_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int numberStudents = Integer.parseInt(scanner.nextLine());
        int numberStay = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sportType = "";

        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "girls":
                        price = numberStudents * numberStay * 9.6;
                        sportType = "Gymnastics";
                        break;
                    case "boys":
                        price = numberStudents * numberStay * 9.6;
                        sportType = "Judo";
                        break;
                    case "mixed":
                        price = numberStudents * numberStay * 10.0;
                        sportType = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "girls":
                        price = numberStudents * numberStay * 7.2;
                        sportType = "Athletics";
                        break;
                    case "boys":
                        price = numberStudents * numberStay * 7.2;
                        sportType = "Tennis";
                        break;
                    case "mixed":
                        price = numberStudents * numberStay * 9.5;
                        sportType = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "girls":
                        price = numberStudents * numberStay * 15.0;
                        sportType = "Volleyball";
                        break;
                    case "boys":
                        price = numberStudents * numberStay * 15.0;
                        sportType = "Football";
                        break;
                    case "mixed":
                        price = numberStudents * numberStay * 20.0;
                        sportType = "Swimming";
                        break;
                }
                break;
        }

        if (numberStudents >= 50) {
            price = price * 0.5;
        } else if (numberStudents >= 20) {
            price = price * 0.85;
        } else if (numberStudents >= 10) {
            price = price * 0.95;
        }
        System.out.printf("%s %.2f lv.", sportType, price);
    }
}
