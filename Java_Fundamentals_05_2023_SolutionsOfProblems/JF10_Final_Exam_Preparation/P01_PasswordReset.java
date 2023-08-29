package JF10_Final_Exam_Preparation;

import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder passBld = new StringBuilder();
        passBld.append(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");
        int index, length;
        String subString, substitute;

        while (!input[0].equals("Done")) {

            switch (input[0]) {
                case "TakeOdd":
                    subString = passBld.toString();
                    passBld.delete(0, passBld.length());
                    for (int i = 1; i < subString.length(); i += 2) {
                        passBld.append(subString.charAt(i));
                    }
                    System.out.println(passBld);
                    break;
                case "Cut":
                    index = Integer.parseInt(input[1]);
                    length = Integer.parseInt(input[2]);
                    subString = passBld.substring(index, index + length);
                    index = passBld.indexOf(subString);
                    passBld.delete(index, index + length);
                    System.out.println(passBld);
                    break;
                case "Substitute":
                    subString = input[1];
                    length = subString.length();
                    substitute = input[2];
                    index = passBld.indexOf(subString);
                    if (index == -1) {
                        System.out.println("Nothing to replace!");
                    } else {
                        while (index > -1) {
                            passBld.replace(index, index + length, substitute);
                            index = passBld.indexOf(subString);
                        }
                        System.out.println(passBld);
                    }
                    break;
            }

            input = scanner.nextLine().split(" ");

        }

        System.out.printf("Your password is: %s", passBld);
    }
}
