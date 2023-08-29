package JF05_1_LAB_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> productsList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            productsList.add(scanner.nextLine());
        }
        Collections.sort(productsList);
        for (int i = 0; i < number; i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));
        }
    }
}
