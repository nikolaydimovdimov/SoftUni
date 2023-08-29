package JF02_1_LAB_Data_Types_and_Variables;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstCh = scanner.nextLine().charAt(0);
        char secondCh = scanner.nextLine().charAt(0);
        char thirdCh = scanner.nextLine().charAt(0);
//       String commonChars = Character.toString(firstCh) + Character.toString(secondCh) +
//                Character.toString(thirdCh);
        String commonChars = String.valueOf(thirdCh) + ' ' +
                String.valueOf(secondCh) + ' ' + String.valueOf(firstCh);
        System.out.println(commonChars);
    }
}
