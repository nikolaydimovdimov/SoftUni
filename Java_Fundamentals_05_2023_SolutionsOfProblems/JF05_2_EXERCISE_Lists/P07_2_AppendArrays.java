package JF05_2_EXERCISE_Lists;

import java.util.*;
import java.util.stream.Collectors;


public class P07_2_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().replaceAll(" ", "");

        List<String> inputList = Arrays
                .stream(inputLine.split(""))
                .collect(Collectors.toList());

        for (int i = 0; i < inputList.size() - 1; i++) {
            if (inputList.get(i).equals("|") && inputList.get(i + 1).equals("|")) {
                inputList.remove(i + 1);
                i--;
            }
        }

        inputLine = inputList.toString();
        inputList = Arrays
                .stream(inputLine.split("\\|"))
                .collect(Collectors.toList());


        Collections.reverse(inputList);

//OUTPUT String List / inputList / with delimiter " "
        String outputStr = inputList.toString().replaceAll("[\\[\\], ]", "");
        System.out.println(outputStr);
        String[] outputStrArray = outputStr.split("");
        System.out.println(String.join(" ", outputStrArray));

//        System.out.println(String.join(" ", inputList.toString()
//                .replaceAll("[\\[\\], ]", "")
//                .split("")));

    }
}
