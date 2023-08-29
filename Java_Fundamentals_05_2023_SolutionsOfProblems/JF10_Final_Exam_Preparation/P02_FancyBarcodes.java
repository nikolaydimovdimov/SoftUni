package JF10_Final_Exam_Preparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rgxValidBarCode = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern patternValidBarCode = Pattern.compile(rgxValidBarCode);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            Matcher matcherValidBarCode = patternValidBarCode.matcher(input);

            if (matcherValidBarCode.find()) {

                String group = "";
                for (int j = 0; j < input.length(); j++) {
                    if (Character.isDigit(input.charAt(j))) group += input.charAt(j);
                }
                if (group.equals("")) group = "00";

                System.out.printf("Product group: %s%n", group);

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
