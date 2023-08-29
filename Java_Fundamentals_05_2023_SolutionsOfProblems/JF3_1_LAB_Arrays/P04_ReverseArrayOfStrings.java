package JF3_1_LAB_Arrays;

import java.util.Scanner;

public class P04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringsArray = scanner.nextLine().split(" ");
        for (int i = 0; i < stringsArray.length / 2; i++) {
            String saveStr = stringsArray[i];
            stringsArray[i] = stringsArray[stringsArray.length - i - 1];
            stringsArray[stringsArray.length - i - 1] = saveStr;
        }
        for (String s : stringsArray) {
            System.out.printf("%s ", s);
        }
    }
}
