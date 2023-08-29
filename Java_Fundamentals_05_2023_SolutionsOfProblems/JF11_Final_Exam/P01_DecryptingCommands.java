package JF11_Final_Exam;

import java.util.Scanner;

public class P01_DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputString = new StringBuilder();
        inputString.append(scanner.nextLine());
        String[] commands = scanner.nextLine().split("\\s+");
        int startIndex, endIndex;
        char currentChar;
        char newChar;
        while (!commands[0].equals("Finish")) {

            switch (commands[0]) {
                case "Replace":
                    if (!commands[1].equals(commands[2])) {
                        while (inputString.indexOf(commands[1]) > -1) {
                            startIndex = inputString.indexOf(commands[1]);
                            endIndex = startIndex + commands[1].length();
                            inputString.replace(startIndex, endIndex, commands[2]);
                        }
                    }
                    System.out.println(inputString);
                    break;
                case "Cut":
                    startIndex = Integer.parseInt(commands[1]);
                    endIndex = Integer.parseInt(commands[2]);
                    if (isIndexValid(inputString, startIndex) && isIndexValid(inputString, endIndex)) {
                        inputString.replace(startIndex, endIndex + 1, "");
                        System.out.println(inputString);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    for (int i = 0; i < inputString.length(); i++) {
                        currentChar = inputString.charAt(i);
                        if (commands[1].equals("Upper")) {
                            newChar = (inputString.substring(i, i + 1)).toUpperCase().charAt(0);
                            if (newChar != currentChar) {
                                replaceCharInString(inputString, currentChar, newChar);
                            }
                        } else {
                            newChar = (inputString.substring(i, i + 1)).toLowerCase().charAt(0);
                            if (newChar != currentChar) {
                                replaceCharInString(inputString, currentChar, newChar);
                            }
                        }
                    }
                    System.out.println(inputString);
                    break;
                case "Check":
                    if (inputString.indexOf(commands[1]) > -1) {
                        System.out.printf("Message contains %s%n", commands[1]);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", commands[1]);
                    }
                    break;
                case "Sum":
                    startIndex = Integer.parseInt(commands[1]);
                    endIndex = Integer.parseInt(commands[2]);
                    if (isIndexValid(inputString, startIndex) && isIndexValid(inputString, endIndex)) {
                        System.out.println(sumOfASCII(inputString.substring(startIndex, endIndex + 1)));
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            commands = scanner.nextLine().split("\\s+");
        }
    }

    public static boolean isIndexValid(StringBuilder text, int index) {
        if (index < 0 || index > text.length() - 1) return false;
        return true;
    }

    public static void replaceCharInString(StringBuilder text, char oldChar, char newChar) {

        String oldStr = oldChar + "", newStr = newChar + "";
        while (text.indexOf(oldStr) > -1) {
            text.replace(text.indexOf(oldStr), text.indexOf(oldStr) + 1, newStr);
        }

    }

    public static int sumOfASCII(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            sum += text.charAt(i);
        }
        return sum;
    }

}
