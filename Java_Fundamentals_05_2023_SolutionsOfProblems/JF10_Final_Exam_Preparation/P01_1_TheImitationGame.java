package JF10_Final_Exam_Preparation;

import java.util.Scanner;

public class P01_1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder();
        message.append(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("Decode")) {
            String[] commandItems = command.split("\\|");
            int index;
            switch (commandItems[0]) {
                case "Move":
                    index = Integer.parseInt(commandItems[1]);
                    message.append(message.substring(0, index));
                    message.delete(0, index);
                    break;
                case "Insert":
                    index = Integer.parseInt(commandItems[1]);
                    message.insert(index, commandItems[2]);
                    break;
                case "ChangeAll":
                    index = message.indexOf(commandItems[1]);
                    while (index != -1) {
                        message.replace(index, index + commandItems[1].length(), commandItems[2]);
                        index = message.indexOf(commandItems[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s%n", message);
    }
}

