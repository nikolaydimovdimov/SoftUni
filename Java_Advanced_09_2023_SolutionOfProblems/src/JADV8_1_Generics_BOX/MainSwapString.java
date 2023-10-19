package JADV8_1_Generics_BOX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainSwapString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box<String>> stringBoxList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            stringBoxList.add(new Box<>(scanner.nextLine()));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Box<String> dataSaver = stringBoxList.get(indexes[0]);
        stringBoxList.set(indexes[0], stringBoxList.get(indexes[1]));
        stringBoxList.set(indexes[1], dataSaver);


        stringBoxList.forEach(el -> System.out.println(el.toString()));
    }
}
