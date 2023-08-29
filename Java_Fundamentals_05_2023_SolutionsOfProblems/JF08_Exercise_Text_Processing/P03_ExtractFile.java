package JF08_Exercise_Text_Processing;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathStr = scanner.nextLine();
        int backslashPosition = 0, fullStopPosition = 0, index = 0;
        for (char ch : pathStr.toCharArray()) {
            if (ch == '\\') backslashPosition = index;
            if (ch == '.') fullStopPosition = index;
            index++;
        }
        System.out.printf("File name: %s%n", pathStr.substring(backslashPosition + 1, fullStopPosition));
        System.out.printf("File extension: %s%n", pathStr.substring(fullStopPosition + 1));
    }
}
