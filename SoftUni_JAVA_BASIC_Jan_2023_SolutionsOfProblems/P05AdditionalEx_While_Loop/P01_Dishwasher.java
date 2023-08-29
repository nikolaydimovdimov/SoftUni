package P05AdditionalEx_While_Loop;

import java.util.Scanner;

public class P01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDetergent = Integer.parseInt(scanner.nextLine()) * 750;
        int plates = 0, washCounter = 0, dishes = 0, pots = 0, usedDetergent = 0;
        String input = "";
        while (usedDetergent <= startDetergent) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            plates = Integer.parseInt(input);
            washCounter++;
            if (washCounter == 3) {
                usedDetergent += plates * 15;
                pots += plates;
                washCounter = 0;
            } else {
                usedDetergent += plates * 5;
                dishes += plates;
            }
        }
        if (input.equals("End")) {
            System.out.printf("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", dishes, pots, startDetergent - usedDetergent);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", usedDetergent - startDetergent);
        }
    }
}
