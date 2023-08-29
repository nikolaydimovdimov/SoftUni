package JF3_2_EXERCISE_Arrays;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");
        for (String s : secondArr) {
            for (String f : firstArr) {
                if (f.equals(s)) {
                    System.out.printf("%s ", f);
                }
            }
        }
    }
}
