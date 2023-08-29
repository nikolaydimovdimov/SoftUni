package P02Ex_ConditionalStatements;

import java.util.Scanner;

public class P03_TimePlus15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt((scanner.nextLine()));

        int time = hour * 60 + minutes + 15;

        System.out.printf("%d:%02d", time / 60 - ((time / 60) / 24) * 24, time % 60);
    }
}
