package JF10_Final_Exam_Preparation;

import java.util.Scanner;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder();
        message.append(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Reveal")) {
            String[] commandItems = command.split(":\\|:");
            int index;
            String substring, replacement;
            switch (commandItems[0]) {
                case "InsertSpace":
                    index = Integer.parseInt(commandItems[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    substring = commandItems[1];
                    index = message.indexOf(substring);
                    if (index != -1) {
                        int endIndex = substring.length() - 1;
                        for (int i = 0; i <= endIndex; i++) {
                            char saver = substring.charAt(endIndex - i);
                            message.replace(index + i, index + i + 1, saver + "");
                        }
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    substring = commandItems[1];
                    replacement = commandItems[2];
                    index = message.indexOf(substring);
                    while (index != -1) {
                        message.replace(index, index + substring.length(), replacement);
                        index = message.indexOf(substring);
                    }
                    System.out.println(message);
                    break;
                default:
                    System.out.println(message);
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", message);
    }
}
