package P04_AdditionalProblems_FOR_Loop;

import java.util.Scanner;

public class P07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        String sector = "";
        int fansA = 0, fansB = 0, fansV = 0, fansG = 0;
        for (int count = 0; count < fans; count++) {
            sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    fansA++;
                    break;
                case "B":
                    fansB++;
                    break;
                case "V":
                    fansV++;
                    break;
                case "G":
                    fansG++;
                    break;
            }
        }
        System.out.printf("%.2f%%%n", fansA * 100.0 / fans);
        System.out.printf("%.2f%%%n", fansB * 100.0 / fans);
        System.out.printf("%.2f%%%n", fansV * 100.0 / fans);
        System.out.printf("%.2f%%%n", fansG * 100.0 / fans);
        System.out.printf("%.2f%%%n", fans * 100.0 / places);
    }
}
