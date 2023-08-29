package JF3_1_LAB_Arrays;


import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayOfWeek = {"Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        int dayNumber = Integer.parseInt(scanner.nextLine());
        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(dayOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
