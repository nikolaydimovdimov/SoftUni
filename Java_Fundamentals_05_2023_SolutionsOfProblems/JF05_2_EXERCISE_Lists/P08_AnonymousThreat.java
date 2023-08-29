package JF05_2_EXERCISE_Lists;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lineList = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String commandStr = scanner.nextLine();

        while (!commandStr.equals("3:1")) {
            String[] commandElement = commandStr.split(" ");

            if (commandElement[0].equals("merge")) {
                int startIndex = Integer.parseInt(commandElement[1]);
                int endIndex = Integer.parseInt(commandElement[2]);
                if (startIndex < 0) startIndex = 0;
                if (endIndex > lineList.size() - 1) endIndex = lineList.size() - 1;
                if (startIndex > endIndex) startIndex = endIndex;

                String newString = lineList.get(startIndex);
                for (int i = startIndex + 1; i <= endIndex; i++) {
                    newString += lineList.get(startIndex + 1);
                    lineList.remove(startIndex + 1);
                }
                lineList.set(startIndex, newString);
            } else {
                int index = Integer.parseInt(commandElement[1]);
                int partitions = Integer.parseInt(commandElement[2]);
                int lengthStr = lineList.get(index).length();
                int newLength = lengthStr / partitions;
                int endElemLength = newLength;
                if (lengthStr % partitions != 0) {
                    endElemLength += lengthStr % partitions;
                }
                int strartIndex = 0;
                String newStringArr = lineList.get(index);
                lineList.remove(index);
                for (int i = 0; i < partitions - 1; i++) {
                    String partString = newStringArr.substring(strartIndex, strartIndex + newLength);
                    lineList.add(index + i, partString);
                    strartIndex += newLength;

                }
                lineList.add(index + partitions - 1, newStringArr.substring(strartIndex, strartIndex + endElemLength));


            }
            commandStr = scanner.nextLine();
        }
        System.out.println(String.join(" ", lineList));
    }
}
