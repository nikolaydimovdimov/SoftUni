package JADV8_1_Generics_BOX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainSwapIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Box<Integer>> integerBoxList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            integerBoxList.add(new Box<>(Integer.parseInt(scanner.nextLine())));
        }

        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        swapBoxList(integerBoxList,indexes[0],indexes[1] );



        integerBoxList.forEach(el -> System.out.println(el.toString()));
    }
    private static <T> void swapBoxList(List<T> dataList,int indexFirst, int indexSecond){
        T dataSaver = dataList.get(indexFirst);
        dataList.set(indexFirst, dataList.get(indexSecond));
        dataList.set(indexSecond, dataSaver);
    }
}
