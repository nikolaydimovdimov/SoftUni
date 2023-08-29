package JF08_Exercise_Text_Processing;

import java.util.*;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        inputText=inputText.replaceAll("^0+(?!$)","");  // премахва водещите нули

        int i;

//        for (i = 0; i < inputText.length(); i++) {
//            if (inputText.charAt(i) != '0') break;
//        }
//
//        inputText = inputText.substring(i);
        char[] bigNumber = inputText.toCharArray();

        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();

        int saver = 0;
        if (multiplier != 0) {
            for (i = bigNumber.length - 1; i >= 0; i--) {
                result.insert(0, (((int) bigNumber[i] - 48) * multiplier + saver) % 10);
                saver = (((int) bigNumber[i] - 48) * multiplier + saver) / 10;
            }
        }

        if (result.length() == 0) result.append(0);
        if (saver != 0) result.insert(0, saver);

        System.out.println(result);
    }
}
