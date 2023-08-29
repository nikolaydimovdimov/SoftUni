package P07_Exam_March_2020;

import java.util.Scanner;

public class P02_1_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int burnedCal = numberWalks * minutesWalk * 5;
        if (burnedCal >= calories / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCal);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCal);
        }
    }
}
